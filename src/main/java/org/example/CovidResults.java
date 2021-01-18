package org.example;

import jdk.vm.ci.meta.Local;


import java.time.LocalDate;
import java.util.Date;

public class CovidResults {
    private LocalDate date;
    private Boolean covidPositive;

    public CovidResults(LocalDate date, Boolean covidPositive){
        this.date = date;
        this.covidPositive = covidPositive;
    }

    public LocalDate getDate(){
        return this.date;
    }


}
