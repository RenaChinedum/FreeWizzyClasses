package org.example.model;

public class Student extends Person{

    private String stId;

    public Student(String name, String email, String phone, String stId) {
        super(name, email, phone);
        this.stId = stId;
    }
    public Student(){
        super();
    }
}
