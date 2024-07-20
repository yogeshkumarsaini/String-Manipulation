package com.test.stringManipulation.repository;

import com.test.stringManipulation.model.JsonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonModelRepository extends JpaRepository<JsonModel, Long> {

}
