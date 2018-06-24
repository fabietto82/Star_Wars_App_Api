package com.example.fyahbetz.star_wars_app_api.people;

import com.example.fyahbetz.star_wars_app_api.models.PeopleModel;
import com.example.fyahbetz.star_wars_app_api.models.Result;
import com.example.fyahbetz.star_wars_app_api.network_utils.ApiRetrofit;
import com.example.fyahbetz.star_wars_app_api.network_utils.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PeoplePresenter implements ContractPeople.PeoplePresenter , ContractPeople.PeopleView {

    private ContractPeople.PeopleView view;

    private PeopleModel peopleModel;

    private List<Result> characters;

    @Override
    public void setView(ContractPeople.PeopleView peopleView) {
        this.view = peopleView;
    }

    @Override
    public void loadCharacters() {

        ApiRetrofit apiRetrofit = RetrofitClientInstance.getRetrofitInstance()
                .create(ApiRetrofit.class);

        Call<PeopleModel> peopleModelCall = apiRetrofit.getPeople();

        peopleModelCall.enqueue(new Callback<PeopleModel>() {
            @Override
            public void onResponse(Call<PeopleModel> call, Response<PeopleModel> response) {

                characters = response.body().getResults();

                view.showCharacters(characters);
            }

            @Override
            public void onFailure(Call<PeopleModel> call, Throwable t) {

                /*occhio che bisogna imparare a gestire se la chiamata non riesce*/

            }
        });

    }

    @Override
    public void setPresenter() {

    }

    @Override
    public void showCharacters(List<Result> characters) {

    }
}
