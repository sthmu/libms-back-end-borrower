package com.lib.borrower.persistence;

import com.lib.borrower.entity.BorrowerEntity;
import org.springframework.data.repository.CrudRepository;

public interface BorrowerRepository extends CrudRepository<BorrowerEntity,Long> {


}
