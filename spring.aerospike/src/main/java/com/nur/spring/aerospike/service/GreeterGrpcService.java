package com.nur.spring.aerospike.service;
import com.nur.spring.aerospike.contracts.GreeterGrpc;
import com.nur.spring.aerospike.contracts.Hellogrpc.HelloReply;
import com.nur.spring.aerospike.contracts.Hellogrpc.HelloRequest;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GRpcService
public class GreeterGrpcService extends GreeterGrpc.GreeterImplBase {
    private static final Logger logger = LoggerFactory.getLogger(GreeterGrpcService.class);
    private final GreeterDataService dataService;
    public GreeterGrpcService(GreeterDataService dataService){
        this.dataService = dataService;
    }
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String from = dataService.GetGreeterText();
        HelloReply reply =HelloReply.newBuilder().setFromAerospike(from).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
