package com.example.writers;

import com.example.model.Students;
import java.util.List;
import org.springframework.batch.item.ItemWriter;

public class StudentWriter implements ItemWriter<Students> {

	@Override
	public void write(List<? extends Students> items) throws Exception {

		for(Students item : items){
			System.out.println(item);
		}
	}

}