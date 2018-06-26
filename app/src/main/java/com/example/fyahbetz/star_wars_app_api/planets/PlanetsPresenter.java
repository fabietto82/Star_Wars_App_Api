package com.example.fyahbetz.star_wars_app_api.planets;

import com.example.fyahbetz.star_wars_app_api.models.Planet;
import com.example.fyahbetz.star_wars_app_api.models.PlanetsModel;
import com.example.fyahbetz.star_wars_app_api.network_utils.ApiRetrofit;
import com.example.fyahbetz.star_wars_app_api.network_utils.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlanetsPresenter implements ContractPlanets.PlanetsPresenter{

    private ContractPlanets.PlanetsView planetsView;

    private List<Planet> planets;




    @Override
    public void setView(ContractPlanets.PlanetsView planetsView) {
        this.planetsView=planetsView;
    }

    @Override
    public void loadPlanets() {
        ApiRetrofit apiRetrofit = RetrofitClientInstance.getRetrofitInstance()
                .create(ApiRetrofit.class);

        Call<PlanetsModel> planetsModelCall = apiRetrofit.getPlanets();

        planetsModelCall.enqueue(new Callback<PlanetsModel>() {
            @Override
            public void onResponse(Call<PlanetsModel> call, Response<PlanetsModel> response) {

                planets = response.body().getResults();
                planetsView.showPlanets(planets);
            }

            @Override
            public void onFailure(Call<PlanetsModel> call, Throwable t) {

            }
        });


    }


}
