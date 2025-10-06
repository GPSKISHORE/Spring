package com.krish.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.krish.enty.IBMEnty;

@Component
public class IBMprocesser implements ItemProcessor<IBMEnty, IBMEnty>{

	@Override
	public IBMEnty process(IBMEnty item) throws Exception {
		return item;
	}

	
}
