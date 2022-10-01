package com.example.thymeleafspring;

public class Person {
    private String name;
    private String jobDescription;


    public Person(String name, String jobDescription) {
        this.name=name;
        this.jobDescription=jobDescription;
    }

    public String getName() {
        return name;
    }

    public String getJobDescription() {
        return jobDescription;
    }
}
