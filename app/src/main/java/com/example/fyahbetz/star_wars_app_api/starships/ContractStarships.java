package com.example.fyahbetz.star_wars_app_api.starships;

import com.example.fyahbetz.star_wars_app_api.models.Starship;

import java.util.List;

public interface ContractStarships {

    interface StarshipsView {

        void setPresenter();

        void showStarchips(List<Starship> starships);



    }

    interface StarshipsPresenter {

        void setView(StarshipsView starshipsView);

        void loadStarships();

    }
}
