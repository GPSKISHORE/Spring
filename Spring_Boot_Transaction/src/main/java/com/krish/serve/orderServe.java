package com.krish.serve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.krish.model.BuyModel;
import com.krish.model.BuyRepo;
import com.krish.model.CatlogModel;
import com.krish.model.CatlogRepo;

@Service
public class orderServe {

	@Autowired
	private BuyRepo br;
	@Autowired
	private CatlogRepo cr;
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
	public String getData(BuyModel bm) {
		System.out.println(bm.getProdid()+" - "+bm.getId());
		CatlogModel crm =cr.findById(bm.getProdid()).get();
		System.out.println(crm.getQuantity()+"/////");
		if((crm.getQuantity() < bm.getQuantity()))
			return "Available Quantity - "+crm.getQuantity();

		bm.setTotalPrice(bm.getQuantity()*crm.getPrice());
		bm.setProdname(crm.getProdname());
		BuyModel bmm = br.save(bm);
		if(bm.getQuantity()>10)
			throw(new RuntimeException("Exception occured, please try ofter some time..!"));
		
		int updateQuant = crm.getQuantity()-bm.getQuantity();
		crm.setQuantity(updateQuant);
		cr.save(crm);
		
		return bmm.getTotalPrice()+" Debit Amount";
	}
		
}
