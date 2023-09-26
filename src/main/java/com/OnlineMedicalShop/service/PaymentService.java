package com.OnlineMedicalShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineMedicalShop.model.Cart;
import com.OnlineMedicalShop.model.Payment;
import com.OnlineMedicalShop.repository.PaymentRepository;

@Service
public class PaymentService {
@Autowired
public PaymentRepository paymentRepo;
public Iterable<Payment> findAllPayments(){
	return paymentRepo.findAll();
}
//retrive only single payment
public Payment findPayment(Integer paymentId) {
	return paymentRepo.findById(paymentId).orElse(new Payment());
}
//inserting the payment data
public Payment createPayment(Payment paymentObj) {
	return paymentRepo.save(paymentObj);
}
//update the payment
public Payment updatePayment(Integer paymentId,String newPaymentType) {
	Payment paymentObj=findPayment(paymentId);
	paymentObj.setPaymentType(newPaymentType);
	return paymentRepo.save(null);	
}
//delete the payment data
public void deletePayment(Integer paymentId) {
	paymentRepo.deleteById(paymentId);
}
//this will call Derived Query of Dao layer
public Payment findByPaymentId(Integer paymentId) {
	return paymentRepo.findByPaymentId(paymentId);
}
public Payment savePayment(Long medicineId, List<Cart> carts) {
	// TODO Auto-generated method stub
	return null;
}
public List<Payment> getPaymentType() {
	// TODO Auto-generated method stub
	return null;
}
}
