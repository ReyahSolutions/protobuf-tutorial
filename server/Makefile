
MODULE_NAME     =   github.com/reyahsolutions/protobuf-tutorial/client

SERVICE_NAME    =   concatenation

gen:
	@protoc -I../proto --go-grpc_out=. --go-grpc_opt=module=$(MODULE_NAME) --go_out=. --go_opt=module=$(MODULE_NAME) ../proto/$(SERVICE_NAME)/service.proto

download:
	@echo Download go.mod dependencies
	@go mod download

install-tools: download
	@echo Installing tools from tools.go
	@cat tools.go | grep _ | awk -F'"' '{print $$2}' | xargs -tI % go install %

run: install-tools gen
	go build .
	./server