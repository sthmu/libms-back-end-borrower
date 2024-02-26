package com.lib.borrower.controller;

import com.lib.borrower.model.BorrowerModel;
import com.lib.borrower.model.TestObject;
import com.lib.borrower.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {

    @Autowired
    BorrowerService borrowerService;

    @PostMapping("/add")
    public ResponseEntity<String> hello(@RequestBody BorrowerModel borrowerModel){
        System.out.println(borrowerModel.toString());
        return borrowerService.save(borrowerModel);
    }





}
