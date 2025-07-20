package com.krish.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krish.model.BuyModel;
import com.krish.serve.orderServe;

@RestController
public class OrderControll {

	@Autowired
	orderServe os;
	
	@PostMapping("/Buy")
	public ResponseEntity<Object> getData(@RequestBody BuyModel bm){
		System.out.println("----------- "+bm.getId()+" ** "+bm.getProdid());
		String res = os.getData(bm);
		return new ResponseEntity<Object>(res,HttpStatus.OK);
	}
}
