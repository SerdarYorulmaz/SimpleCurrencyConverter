package com.example.simplecurrencyconverter;

public class ApiUtils {

    public static final String BASE_URL = "http://data.fixer.io/api/";

    public static KisilerDaoInterface getKisilerDaoInterface() {
        return RetrofitClient.getClient(BASE_URL).create(KisilerDaoInterface.class);
    }
}
