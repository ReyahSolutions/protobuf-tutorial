package com.reyahsolutions.protobuf.tutorial;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to concatenate strings
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: concatenation/service.proto")
public final class ConcatenationGrpc {

  private ConcatenationGrpc() {}

  public static final String SERVICE_NAME = "proto.concatenation.Concatenation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.reyahsolutions.protobuf.tutorial.ConcatenationRequest,
      com.reyahsolutions.protobuf.tutorial.ConcatenationResult> getConcatenateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Concatenate",
      requestType = com.reyahsolutions.protobuf.tutorial.ConcatenationRequest.class,
      responseType = com.reyahsolutions.protobuf.tutorial.ConcatenationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.reyahsolutions.protobuf.tutorial.ConcatenationRequest,
      com.reyahsolutions.protobuf.tutorial.ConcatenationResult> getConcatenateMethod() {
    io.grpc.MethodDescriptor<com.reyahsolutions.protobuf.tutorial.ConcatenationRequest, com.reyahsolutions.protobuf.tutorial.ConcatenationResult> getConcatenateMethod;
    if ((getConcatenateMethod = ConcatenationGrpc.getConcatenateMethod) == null) {
      synchronized (ConcatenationGrpc.class) {
        if ((getConcatenateMethod = ConcatenationGrpc.getConcatenateMethod) == null) {
          ConcatenationGrpc.getConcatenateMethod = getConcatenateMethod =
              io.grpc.MethodDescriptor.<com.reyahsolutions.protobuf.tutorial.ConcatenationRequest, com.reyahsolutions.protobuf.tutorial.ConcatenationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Concatenate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.reyahsolutions.protobuf.tutorial.ConcatenationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.reyahsolutions.protobuf.tutorial.ConcatenationResult.getDefaultInstance()))
              .setSchemaDescriptor(new ConcatenationMethodDescriptorSupplier("Concatenate"))
              .build();
        }
      }
    }
    return getConcatenateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConcatenationStub newStub(io.grpc.Channel channel) {
    return new ConcatenationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConcatenationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConcatenationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConcatenationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConcatenationFutureStub(channel);
  }

  /**
   * <pre>
   * Service to concatenate strings
   * </pre>
   */
  public static abstract class ConcatenationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Concatenation request
     * </pre>
     */
    public void concatenate(com.reyahsolutions.protobuf.tutorial.ConcatenationRequest request,
        io.grpc.stub.StreamObserver<com.reyahsolutions.protobuf.tutorial.ConcatenationResult> responseObserver) {
      asyncUnimplementedUnaryCall(getConcatenateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConcatenateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.reyahsolutions.protobuf.tutorial.ConcatenationRequest,
                com.reyahsolutions.protobuf.tutorial.ConcatenationResult>(
                  this, METHODID_CONCATENATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to concatenate strings
   * </pre>
   */
  public static final class ConcatenationStub extends io.grpc.stub.AbstractStub<ConcatenationStub> {
    private ConcatenationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConcatenationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConcatenationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConcatenationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Concatenation request
     * </pre>
     */
    public void concatenate(com.reyahsolutions.protobuf.tutorial.ConcatenationRequest request,
        io.grpc.stub.StreamObserver<com.reyahsolutions.protobuf.tutorial.ConcatenationResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConcatenateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to concatenate strings
   * </pre>
   */
  public static final class ConcatenationBlockingStub extends io.grpc.stub.AbstractStub<ConcatenationBlockingStub> {
    private ConcatenationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConcatenationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConcatenationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConcatenationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Concatenation request
     * </pre>
     */
    public com.reyahsolutions.protobuf.tutorial.ConcatenationResult concatenate(com.reyahsolutions.protobuf.tutorial.ConcatenationRequest request) {
      return blockingUnaryCall(
          getChannel(), getConcatenateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to concatenate strings
   * </pre>
   */
  public static final class ConcatenationFutureStub extends io.grpc.stub.AbstractStub<ConcatenationFutureStub> {
    private ConcatenationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConcatenationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConcatenationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConcatenationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Concatenation request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.reyahsolutions.protobuf.tutorial.ConcatenationResult> concatenate(
        com.reyahsolutions.protobuf.tutorial.ConcatenationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConcatenateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONCATENATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConcatenationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConcatenationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONCATENATE:
          serviceImpl.concatenate((com.reyahsolutions.protobuf.tutorial.ConcatenationRequest) request,
              (io.grpc.stub.StreamObserver<com.reyahsolutions.protobuf.tutorial.ConcatenationResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConcatenationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConcatenationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.reyahsolutions.protobuf.tutorial.ConcatenationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Concatenation");
    }
  }

  private static final class ConcatenationFileDescriptorSupplier
      extends ConcatenationBaseDescriptorSupplier {
    ConcatenationFileDescriptorSupplier() {}
  }

  private static final class ConcatenationMethodDescriptorSupplier
      extends ConcatenationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConcatenationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConcatenationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConcatenationFileDescriptorSupplier())
              .addMethod(getConcatenateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
