package com.sagarandcompany.ExceptionHandling.controller;

import com.sagarandcompany.ExceptionHandling.ResponseDTO;
import com.sagarandcompany.ExceptionHandling.domain.Person;
import com.sagarandcompany.ExceptionHandling.exception.RecordNotFoundException;
import com.sagarandcompany.ExceptionHandling.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public ResponseDTO save(@ModelAttribute Person person) {
        return personService.save(person);
    }

    @GetMapping("/get/{id}")
    public ResponseDTO get(@PathVariable Long id) {
        ResponseDTO responseDTO = personService.get(id);
        if (responseDTO.getData() == null)
            throw new RecordNotFoundException("Person not found with id=" + id);
        return personService.get(id);
    }
}
