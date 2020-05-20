package com.company.EnumsLearn;

public enum Currencies {

    ZLOTY("PLN", "Polish Zloty", 1),
    DOLAR("USD", "American Dollar", 0.3),
    EURO("EUR", "European Ducat", 0.4),
    JUAN("JYN", "Japan Yen", 0.5),
    FUNT("GBP", "British Pound", 0.7);



    private String lettersOfShort;
    private String nameOfCurrency;
    private final double rateToPolishZloty ;


    Currencies(String lettersOfShort, String nameOfCurency, double rateToPolishZloty) {
        this.lettersOfShort = lettersOfShort;
        this.nameOfCurrency = nameOfCurency;
        this.rateToPolishZloty = rateToPolishZloty;

    }

    public String getLettersOfShort() {
        return lettersOfShort;
    }

    public String getNameOfCurrency() {
        return nameOfCurrency;
    }

    public double getRateToPolishZloty() {
        return rateToPolishZloty;
    }

    @Override
    public String toString() {
        return "Currencies{" +
                "lettersOfShort='" + lettersOfShort + '\'' +
                "lnameOfCureny='" + nameOfCurrency + '\'' +
                '}';
    }

    String currencyName = "ZLOTOWKA";

    public void shrtAndNameOfSpecificCurrency(String lettersOfShort, String nameOfCurrency) {
        switch (this) {
            case ZLOTY:
                currencyName = nameOfCurrency + "  " + lettersOfShort;
                break;
            case EURO:
                currencyName = nameOfCurrency + "  " + lettersOfShort;
                break;
            case DOLAR:
                currencyName = nameOfCurrency + "  " + lettersOfShort;
                break;
            case JUAN:
                currencyName = nameOfCurrency + "  " + lettersOfShort;
                break;
            case FUNT:
                currencyName = nameOfCurrency + "  " + lettersOfShort;
                break;

            default:
                System.out.println("unknown type");
        }
      System.out.println("Wluta: " + currencyName);
    }

    public double exchangeMoney(int amountCash){
        Double result=0.0;

               result = amountCash / getRateToPolishZloty();

        return result;
    }
}
