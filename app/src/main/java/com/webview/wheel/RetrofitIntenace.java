package com.webview.wheel;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitIntenace {
    public static final String BASE_URL="https://broslotsonline.pw/";
    static Retrofit retrofit;
    public static Retrofit getRetrofit(){
        if (retrofit == null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
