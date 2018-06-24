package com.example.fyahbetz.star_wars_app_api.network_utils;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitClientInstance {


    private final static String BASE_URL = "https://swapi.co/api/";
    private static Retrofit retrofit;

    //metodo statico get instance

    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
