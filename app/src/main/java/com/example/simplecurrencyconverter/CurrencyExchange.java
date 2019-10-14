package com.example.simplecurrencyconverter;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange {

    private String base;
    private String date;


    private RatesEntity rates;

    public List<Currency> getCurrencyList(){
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("TRY", rates.getTRY()));
        currencyList.add(new Currency("USD", rates.getUSD()));
        currencyList.add(new Currency("AUD", rates.getAUD()));


        return currencyList;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RatesEntity getRates() {
        return rates;
    }

    public void setRates(RatesEntity rates) {
        this.rates = rates;
    }

    public static class RatesEntity {
        private double AUD;

        private double TRY;
        private double USD;


        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }



        public double getTRY() {
            return TRY;
        }

        public void setTRY(double TRY) {
            this.TRY = TRY;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }


    }
}
