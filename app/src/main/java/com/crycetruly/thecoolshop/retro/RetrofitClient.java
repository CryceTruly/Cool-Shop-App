package com.crycetruly.thecoolshop.retro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Elia on 10/07/2018.
 */

public class RetrofitClient {
    public static Retrofit retrofit=null;

public static  Retrofit getRetrofit(String baseUrl){

    if (retrofit==null){
        retrofit=new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    return retrofit;
}

}
