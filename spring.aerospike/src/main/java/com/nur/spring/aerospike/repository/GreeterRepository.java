package com.nur.spring.aerospike.repository;

import com.nur.spring.aerospike.domain.GreeterDocument;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface GreeterRepository extends AerospikeRepository<GreeterDocument, String> {
}
