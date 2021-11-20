package com.example.midterm.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    public Retrofit retrofit;

    public RetrofitBuilder() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BaseURL.baseURL())
                .addConverterFactory((GsonConverterFactory.create()))
                .build();
    }

    public static Retrofit getRetrofit() {
        return getRetrofit();
    }

    public void setRetrofit(Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}
