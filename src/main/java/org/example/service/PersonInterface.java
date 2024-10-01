package org.example.service;

import org.example.model.Person;
import org.example.model.RegisterPersonRequest;

public interface PersonInterface {
    Person register(RegisterPersonRequest request);
}
