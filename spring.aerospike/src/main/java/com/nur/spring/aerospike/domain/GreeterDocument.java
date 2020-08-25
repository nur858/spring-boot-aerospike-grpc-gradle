package com.nur.spring.aerospike.domain;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.aerospike.mapping.Field;

@Value
@Document(collection = "my_aerospike_set")
@AllArgsConstructor
public class GreeterDocument {
    @Field("my_aerospike_greeting_bin")
    String GreetingText;
}
