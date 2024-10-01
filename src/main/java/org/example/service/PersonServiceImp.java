package org.example.service;

import org.example.model.Person;
import org.example.model.RegisterPersonRequest;
import org.example.model.Student;

public class PersonServiceImp implements PersonInterface{
    private Student student;

    @Override
    public Person register(RegisterPersonRequest request){
        student.setEmail(request.getEmail());
        student.setName(request.getName());
        student.setPhone(request.getPhone());
        return student;
    }
}
