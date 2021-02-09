package main

import (
	"fmt"
	"net"
	"os"

	"google.golang.org/grpc"
	"google.golang.org/grpc/reflection"
	"gopkg.in/alecthomas/kingpin.v2"

	pb "github.com/reyahsolutions/protobuf-tutorial/server/api"
	"github.com/reyahsolutions/protobuf-tutorial/server/internal/config"
	"github.com/reyahsolutions/protobuf-tutorial/server/internal/server"
)

const serviceName = "service.concatenation"

func main() {
	app := kingpin.New(serviceName, fmt.Sprintf("%s is a simple example", serviceName))
	app.HelpFlag.Short('h')

	cfg, err := config.New(app)
	if err != nil {
		app.Usage(os.Args[1:])
		os.Exit(1)
	}

	svc := server.New()
	grpcServer := grpc.NewServer()

	pb.RegisterConcatenationServer(grpcServer, svc)
	reflection.Register(grpcServer)

	lis, err := net.Listen("tcp", cfg.Addr)
	if err != nil {
		os.Exit(1)
	}
	fmt.Printf("running on %s...\n", cfg.Addr)
	err = grpcServer.Serve(lis)
	if err != nil {
		os.Exit(1)
	}
}
