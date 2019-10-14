
package com.example.simplecurrencyconverter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KisilerCevap {

    @SerializedName("rates")
    @Expose
    private List<Rates> kisiler = null;


    public List<Rates> getKisiler() {
        return kisiler;
    }

    public void setKisiler(List<Rates> kisiler) {
        this.kisiler = kisiler;
    }


}
