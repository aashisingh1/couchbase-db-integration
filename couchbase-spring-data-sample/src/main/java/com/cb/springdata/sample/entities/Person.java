package com.cb.springdata.sample.entities;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import com.couchbase.client.java.repository.annotation.Field;

public class Person {

	@NotNull
    @Id
    private String id;

    @NotNull
    @Field
    private String name;

    @NotNull
    @Field
    private String age;
    
    
}
