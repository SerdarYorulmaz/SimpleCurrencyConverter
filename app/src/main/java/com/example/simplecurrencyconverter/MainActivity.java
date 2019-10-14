package com.example.simplecurrencyconverter;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private KisilerDaoInterface kisilerDIF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kisilerDIF = ApiUtils.getKisilerDaoInterface();
        tumKisiler();
    }

    public void tumKisiler() {


        kisilerDIF.tumKisiler().enqueue(new Callback<KisilerCevap>() {
            @Override
            public void onResponse(Call<KisilerCevap> call, Response<KisilerCevap> response) {
                List<Kisiler> kisilerListe = response.body().getKisiler();

                for (Kisiler k : kisilerListe) {
                    Log.e("**********", "**********");
                    Log.e("kişi id:", k.getKisiId());
                    Log.e("kişi ad:", k.getKisiAd());
                    Log.e("kişi tel:", k.getKisiTel());
                    Log.e("**********", "**********");


                }
            }

            @Override
            public void onFailure(Call<KisilerCevap> call, Throwable t) {

            }
        });

    }


}
