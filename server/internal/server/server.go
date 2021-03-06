package server

import (
	pb "github.com/reyahsolutions/protobuf-tutorial/server/api"
)

// Contains rpc client, storage managers, etc...
type Server struct {
	pb.UnimplementedConcatenationServer
}

// New returns a new instance of the Server
func New() *Server {
	return &Server{
	}
}
