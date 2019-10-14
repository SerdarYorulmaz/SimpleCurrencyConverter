package com.example.simplecurrencyconverter;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KisilerDaoInterface {
    @GET("kisiler/tum_kisiler.php")
    Call<KisilerCevap>tumKisiler();
}
