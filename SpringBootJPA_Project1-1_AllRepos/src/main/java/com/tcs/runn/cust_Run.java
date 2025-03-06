package com.tcs.runn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.tcs.Serv.ICust_Service;
import com.tcs.enty.Cust_Entity_Model;
import com.tcs.enty.ICust_Data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class cust_Run implements CommandLineRunner{
	
	@Autowired
	private ICust_Service ics;
	@Autowired
	private ICust_Data icd;
	@Autowired
	private EntityManager manager;
	private String url;
	
	public void seturl(String url) {
		this.url = url;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		StoredProcedureQuery st=manager.createStoredProcedureQuery("P_GET_STORE_DATA",Cust_Entity_Model.class);
		
		st.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		st.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		st.registerStoredProcedureParameter(3, void.class, ParameterMode.REF_CURSOR);
		
		st.setParameter(1, "Amma");
		st.setParameter(2, "Cash");
		
		List<Cust_Entity_Model> li = st.getResultList();
		li.forEach(System.out::println);
		
//		System.out.println(ics.getClass());
//		//ics.getRelData("s%","Cash").forEach(System.out::println);
//		ics.getRelData("%Kishore%",10000f,15000f,RequiredCols2.class).forEach(data -> {
//			System.out.println(data.getBillAmount()+"---"+data.getCustName()+"---"+data.getClass()+"---"+data.getTrxType()+"---"+data.getTrxRefeNum());
//			
//		});
//		
//		List<RequiredCols2> li=icd.findByCustNameNotLikeAndBillAmountBetweenOrderByCustName("%Shiva%", 10000f, 15000f, RequiredCols2.class);
//		li.forEach(data -> {
//			System.out.println(data.getBillAmount()+"---"+data.getCustName()+"---"+data.getClass()+"---"+data.getTrxType()+"---"+data.getTrxRefeNum());
//		});
//		
//		System.out.println("-->> "+url);
//		
//		Cust_Entity_Model cem =icd.gatherSal("Shiva");
//		System.out.println(cem.getCustName()+" - "+cem.getTrxRefeNum());
//		
//		Object cem1 =icd.gatherSelectedSal("Shiva");
//		Object ob[] = (Object[]) cem1;
//		Arrays.stream(ob).forEach(System.out::println);
//		String trx_ref = LocalDateTime.now().toString().replace("-", "").replace(":", "").substring(0,15)+"GSR";
//		System.out.println(icd.modifyData(2500f, "Shiva"));
//		System.out.println(icd.insertData(2500f, "Eswar","Phone Pay",trx_ref));
		//System.out.println(ob[0]+" - "+ob[1]);
		//String trx_ref = LocalDateTime.now().toString().replace("-", "").replace(":", "").substring(0,15)+"GSR";
		//Cust_Entity_Model cem = new Cust_Entity_Model();
		
//		ics.cust_sort_data(true, "custName").forEach(System.out::println);
//		System.out.println();
//		Page<Cust_Entity_Model> p1=ics.getPag(1, 2, true, "custName");
//		System.out.println(p1.getNumber());
//		System.out.println(p1.getSize());
//		System.out.println(p1.getTotalPages());
//		System.out.println(p1.getPageable());
//		System.out.println(p1.getContent());
		
//		cem.setCust_Mob_Number(7661980740L);
//		cem.setCust_Name("Sri Ram");
//		cem.setTrx_Type("Phone Pay");
//		cem.setTrx_Refe_Num(trx_ref+cem.getCust_Mob_Number().toString().substring(5)+cem.getCust_Mob_Number().toString().substring(0,5));
//		cem.setBill_Amount(9250f);
//		
//		System.out.println(ics.save(cem));
//		ics.findAll().forEach(System.out::println);
//		System.out.println(ics.findById(5).orElseThrow(() -> new IllegalArgumentException("No Data Found")));
	
		
	}

}
