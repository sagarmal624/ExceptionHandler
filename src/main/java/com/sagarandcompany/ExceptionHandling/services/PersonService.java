package com.sagarandcompany.ExceptionHandling.services;

import com.sagarandcompany.ExceptionHandling.ResponseDTO;
import com.sagarandcompany.ExceptionHandling.domain.Person;
import com.sagarandcompany.ExceptionHandling.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public ResponseDTO save(Person person) {
        Person savedPerson = personRepository.save(person);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Record is saved");
        responseDTO.setStatus(true);
        return responseDTO;
    }

    public ResponseDTO get(Long id) {
        Person savedPerson = personRepository.findById(id).get();
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(true);
        responseDTO.setData(savedPerson);
        return responseDTO;
    }

}
