package com.geblob.boost.core;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class Person implements Serializable {
    private Integer age;
    private String name;
}
