package com.example.fyahbetz.star_wars_app_api.network_utils;

import com.example.fyahbetz.star_wars_app_api.models.PeopleModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRetrofit {


    @GET("people")
    Call<PeopleModel> getPeople();
}
