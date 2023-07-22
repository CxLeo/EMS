package com.exercise.myEMS.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.myEMS.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
