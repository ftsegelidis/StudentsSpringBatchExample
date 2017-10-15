package com.example.model;

import com.example.constants.GradeCharacterization;
import org.apache.commons.lang.StringUtils;

public class Students {

    private long id;
    private String name;
    private double averageGrade;

    public Students() {
        this.id = 0L;
        this.name = StringUtils.EMPTY;
        this.averageGrade = 0.0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
       // return "[Student with id :" + this.getId() + " and name: " + this.getName() + " has average grade: " + this.getAverageGrade() + "]";
       return "[Student: " + this.getName() + "] = " + calculateStudentGradeStatus(this.getAverageGrade());
    }
    
    public String calculateStudentGradeStatus(double avgGrade){
        if(avgGrade >= 5.0 && avgGrade < 6.5){
            return GradeCharacterization.GOOD.name();
        }else if(avgGrade >= 6.5 && avgGrade < 8.5 ){
            return GradeCharacterization.VERY_GOOD.name();
        }else if(avgGrade >= 8.5 && avgGrade <= 10){
            return GradeCharacterization.EXCELLENT.name();
        }else{
            return GradeCharacterization.FAILED.name();
        }
    }
}