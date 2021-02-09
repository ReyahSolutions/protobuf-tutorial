package config

import (
	"os"

	"gopkg.in/alecthomas/kingpin.v2"
)

type (
	// Config is the configuration coming from user.
	Config struct {
		// Addr is the GRPC listening address
		Addr string
	}
)

// Parse parses the configuration from command args
func New(app *kingpin.Application) (*Config, error) {
	var c Config

	app.Flag("grpc.address", "Address to listen for the gRPC server.").
		Default(":10901").
		StringVar(&c.Addr)

	_, err := app.Parse(os.Args[1:])
	return &c, err
}
