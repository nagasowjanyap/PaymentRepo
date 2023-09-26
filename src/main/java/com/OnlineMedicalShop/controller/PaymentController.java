package com.OnlineMedicalShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineMedicalShop.model.Cart;
import com.OnlineMedicalShop.model.LoginUser;
import com.OnlineMedicalShop.model.Payment;
import com.OnlineMedicalShop.service.CartService;
import com.OnlineMedicalShop.service.MedicineService;
import com.OnlineMedicalShop.service.PaymentService;

@RestController

@RequestMapping("/payment")

@CrossOrigin("*")

public class PaymentController {

    @Autowired

    private PaymentService payService;
@Autowired
private CartService cService;
@Autowired
private MedicineService mediService;
    //create order

    @PostMapping("/paymentId")

    public Payment createPayment(@PathVariable Long medicineId, @RequestBody List<Cart> carts){

        return this.payService.savePayment(medicineId,carts);

    }

    //get all Payments

    @GetMapping("/Id")

    public List<Payment> getAllPaymentType(){

        return payService.getPaymentType();

    }

	public CartService getcService() {
		return cService;
	}

	public void setcService(CartService cService) {
		this.cService = cService;
	}

	public MedicineService getMediService() {
		return mediService;
	}

	public void setMediService(MedicineService mediService) {
		this.mediService = mediService;
	}

    
 

    

}