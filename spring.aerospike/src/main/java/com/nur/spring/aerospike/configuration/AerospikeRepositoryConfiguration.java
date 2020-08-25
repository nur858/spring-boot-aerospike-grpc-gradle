package com.nur.spring.aerospike.configuration;

import com.aerospike.client.Host;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;

import java.util.Collection;
import java.util.HashSet;

@Configuration
@EnableAerospikeRepositories(basePackages = {"com.nur.spring.aerospike.repository"})
public class AerospikeRepositoryConfiguration extends AbstractAerospikeDataConfiguration {
    @Override
    protected Collection<Host> getHosts() {
        HashSet<Host> hostSet = new HashSet<>();
        hostSet.add(new Host("localhost", 3000));
        return null;
    }

    @Override
    protected String nameSpace() {
        return "test";
    }
}
