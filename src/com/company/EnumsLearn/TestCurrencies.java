package com.company.EnumsLearn;

public class TestCurrencies {

    public static void main(String[] args) {
      //  for (Currencies waluta : Currencies.valueOf() {
            //   System.out.println(waluta);
            //  System.out.println(waluta.getNameOfCurrency() + "  " + waluta.getLettersOfShort());
        /*    Currencies zlotowka = Currencies.valueOf("ZLOTY");
            System.out.println(zlotowka);
          Operation sdf = Operation.valueOf("MINUS");
        System.out.println(sdf);*/
double zlotyDolar;
Double casa = Currencies.DOLAR.exchangeMoney(120);

        System.out.println(casa + " PLN");
        }
    }
