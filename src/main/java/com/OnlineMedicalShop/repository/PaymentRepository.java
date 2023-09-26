package com.OnlineMedicalShop.repository;

import org.springframework.beans.factory.annotation.Autowired;


//import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OnlineMedicalShop.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	//@Query("SELECT f FROM payment")
//	public Iterable<Payment> allpayment();
	public Payment findByPaymentId(Integer paymentId);
	


}