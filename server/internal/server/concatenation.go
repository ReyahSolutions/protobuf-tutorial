package server

import (
	"fmt"
	"context"

	pb "github.com/reyahsolutions/protobuf-tutorial/server/api"
)

// Concatenate executes a new Concatenation
func (s *Server) Concatenate(_ context.Context, req *pb.ConcatenationRequest) (*pb.ConcatenationResult, error) {
	fmt.Printf("%s + %s = %s%s\n", req.GetA(), req.GetB(), req.GetA(), req.GetB())
	return &pb.ConcatenationResult{
		Result: req.GetA() + req.GetB(),
	}, nil

}
