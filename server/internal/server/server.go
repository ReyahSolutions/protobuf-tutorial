package server

import (
	pb "github.com/reyahsolutions/protobuf-tutorial/server/api"
)

// Server represents the Example concatenation service.
// Contains rpc client, storage managers, etc...
type Server struct {
	pb.UnimplementedConcatenationServer
}

// New returns a new instance of the Example concatenation service.
func New() *Server {
	return &Server{
	}
}
