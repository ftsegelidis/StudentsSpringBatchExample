package com.example.processor;

import com.example.model.Students;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Students,Students>{

    @Override
    public Students process(Students student) throws Exception {
      return student != null ? student : null;
    }
}
