# Un petit tour de protobuf en architecture microservice

- [Un petit tour de protobuf en architecture microservice](#un-petit-tour-de-protobuf-en-architecture-microservice)
  - [Contact](#contact)
  - [Setup](#setup)
    - [Clone](#clone)
    - [Requirements](#requirements)
    - [protoc](#protoc)
    - [Protobuf and gRPC toolchain for go](#protobuf-and-grpc-toolchain-for-go)
    - [Protobuf and gRPC toolchain for java](#protobuf-and-grpc-toolchain-for-java)
  - [Usage](#usage)
    - [Start the server](#start-the-server)
    - [Start the client](#start-the-client)
  - [Links](#links)

Contact
-------

- **Cédric THOMAS** (email: **[cedric@reyah.eu](mailto:cedric@reyah.eu)**)

Setup
-----

### Clone

```bash
git clone https://github.com/ReyahSolutions/protobuf-tutorial
```

### Requirements

- [Go](https://golang.org/doc/install)
- Java
- Make

### protoc

- **`protoc`**: allows to generate gRPC server and client specifications.  
Download `protoc` [the recommended way](http://google.github.io/proto-lens/installing-protoc.html) for your system.

### Protobuf and gRPC toolchain for go

To generate Go code for gRPC services from Protobuf definitions, you'll need the following tools:

- **`protoc-gen-go`**: allows to generate Go code from Protobuf files
- **`protoc-gen-go-grpc`**: allows to generate Go code from Protobuf file specifically for gRPC.

These tools are automatically installed when running the client:

```bash
make install-tools
```

### Protobuf and gRPC toolchain for java


Everything is automatically installed and generated when running:
```bash
make run
```

Usage
-----

### Start the server
```bash
cd server
make run
```

### Start the client
```bash
cd client
make run
```

Links
-----

- [Protocol buffers](https://developers.google.com/protocol-buffers)
- [GRPC](https://grpc.io/)
- [Awesome GRPC](https://github.com/grpc-ecosystem/awesome-grpc#tools-test)
- [12factor](https://12factor.net/)

doc.v1.2
