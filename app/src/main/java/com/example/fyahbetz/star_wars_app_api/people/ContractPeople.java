package com.example.fyahbetz.star_wars_app_api.people;

import com.example.fyahbetz.star_wars_app_api.models.Result;

import java.util.List;

public interface ContractPeople {


    interface PeopleView {

        // metodo per settare il presenter... lego la view al presenter
        void setPresenter();

        void showCharacters(List<Result> characters);

    }

    interface PeoplePresenter{

        //metodo per settare la view ... lego il presenter alla view...
        void setView(PeopleView peopleView);

        void loadCharacters();

    }


}
