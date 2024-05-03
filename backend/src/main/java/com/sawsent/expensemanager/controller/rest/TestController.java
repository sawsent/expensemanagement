package com.sawsent.expensemanager.controller.rest;

import com.sawsent.expensemanager.command.TestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/customer")
public class TestController {

    @GetMapping( path = {"/", ""})
    public ResponseEntity<TestDto> listCustomers() {

        TestDto test = new TestDto();
        test.setName("helloitworks YES");

        return new ResponseEntity<>(test, HttpStatus.OK);
    }
}
