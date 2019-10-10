package com.averkin.resolver.mongo;


import org.springframework.data.annotation.Id;


public class Xpath {

    @Id
    private String id;

    public String classifier;
    public String className;
    public String methodName;
    public String xpath;
    public String status;


}