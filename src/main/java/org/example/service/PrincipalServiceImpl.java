package org.example.service;

import org.example.model.Person;
import org.example.model.Principal;
import org.example.model.RegisterPersonRequest;

public class PrincipalServiceImpl implements PersonInterface{
    @Override
    public Person register(RegisterPersonRequest request) {
        Principal principal= new Principal();
        principal.setEmail(request.getEmail());
        principal.setName(request.getName());
        principal.setPhone(request.getPhone());
        principal.setStaffId(request.getStaffId());
        return principal;
    }
}
