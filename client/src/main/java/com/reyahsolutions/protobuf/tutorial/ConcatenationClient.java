package com.reyahsolutions.protobuf.tutorial;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConcatenationClient {
    private static final Logger logger = Logger.getLogger(ConcatenationClient.class.getName());

    private final ManagedChannel channel;
    private ConcatenationGrpc.ConcatenationBlockingStub blockingStub;

    public ConcatenationClient(String hostname, int port) {
        channel = ManagedChannelBuilder.forAddress(hostname, port)
                .usePlaintext()
                .build();
        blockingStub = ConcatenationGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void concatenation(String A, String B) {
        try {
            ConcatenationRequest request = ConcatenationRequest.newBuilder().setA(A).setB(B).build();
            ConcatenationResult result = blockingStub.concatenate(request);
            logger.info("Response: " + result.getResult());
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }
    }


    public static void main(String[] args) throws Exception {
        ConcatenationClient client = new ConcatenationClient("localhost", 10901);

        try {
            client.concatenation("A", "B");
        } finally {
            client.shutdown();
        }
    }
}