package com.sscode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sscode.entity.Form;

@Repository
public interface FormRepository extends CrudRepository<Form, Long>{

}
