package com.example.fyahbetz.star_wars_app_api.planets;

import com.example.fyahbetz.star_wars_app_api.models.Planet;

import java.util.List;

public interface ContractPlanets  {

    interface PlanetsView {

        void setPresenter();

        void showPlanets(List<Planet> planets);
    }

    interface PlanetsPresenter {

        void setView(PlanetsView planetsView);

        void loadPlanets();


    }
}
