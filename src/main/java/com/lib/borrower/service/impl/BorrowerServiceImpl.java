package com.lib.borrower.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lib.borrower.entity.BorrowerEntity;
import com.lib.borrower.model.BorrowerModel;
import com.lib.borrower.persistence.BorrowerRepository;
import com.lib.borrower.service.BorrowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class BorrowerServiceImpl implements BorrowerService{
    BorrowerRepository borrowerRepository;

    ObjectMapper objectMapper;
    @Override
    public ResponseEntity<String> save(BorrowerModel borrowerModel) {

        BorrowerEntity borrowerEntity= borrowerRepository.save(objectMapper.convertValue(borrowerModel, BorrowerEntity.class));
        if(borrowerEntity!=null){
            return new ResponseEntity<String>("Success", HttpStatus.OK);

        }
        else {
            return new ResponseEntity<String>("Failed", HttpStatus.CONFLICT);
        }
    }
}
