package com.OnlineMedicalShop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnlineMedicalShop.model.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup,Integer>{
    
 
}
