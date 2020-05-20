package com.company.KobietyDoKoduTasks;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class Kot {
    String imię;
  LocalDate dataUrodzenia;
    double waga;
    String imieOpiekuna;

    public Kot(String imię, LocalDate dataUrodzenia, double waga, String imieOpiekuna) {
        this.imię = imię;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public static void dateBirth(){

    DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
   System.out.println(dateFormat);
    LocalDate localDate2 = LocalDate.of(2019, 5, 25);
    System.out.println("Local date #2: " + localDate2);
}


    public String przedstawSie (){

                return "Cześć jestem: " + imię + ", urodziłem się: " + "dataUrodzenia: " + ", ważę:  " + waga + ", a opiekuje się mną: " + imieOpiekuna;

    }
    public String getImię(){
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

  //  public Date getDataUrodzenia() {
 //       return dataUrodzenia;
  //  }

   // public void setDataUrodzenia(Date dataUrodzenia) {
   //     this.dataUrodzenia = dataUrodzenia;
 //   }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }
}

