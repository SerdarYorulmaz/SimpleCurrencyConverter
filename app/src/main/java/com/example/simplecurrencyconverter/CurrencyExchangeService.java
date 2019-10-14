package com.example.simplecurrencyconverter;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyExchangeService {
    @GET("latest?access_key=898dcd233554fbd22b6ecfa6774365dc")
    Call<CurrencyExchange> loadCurrencyExchange();
}
