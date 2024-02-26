package com.lib.borrower.service;

import com.lib.borrower.model.BorrowerModel;
import com.lib.borrower.persistence.BorrowerRepository;
import org.springframework.http.ResponseEntity;

public interface BorrowerService {

    ResponseEntity<String> save(BorrowerModel borrowerModel);
}
