package com.example.fyahbetz.star_wars_app_api;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.fyahbetz.star_wars_app_api.models.Planet;
import com.example.fyahbetz.star_wars_app_api.models.Starship;
import com.example.fyahbetz.star_wars_app_api.people.DetailsPeopleFragment;
import com.example.fyahbetz.star_wars_app_api.people.PeopleFragment;
import com.example.fyahbetz.star_wars_app_api.planets.DetailsPlanetFragment;
import com.example.fyahbetz.star_wars_app_api.planets.PlanetsFragment;
import com.example.fyahbetz.star_wars_app_api.starships.StarshipFragment;

public class MainActivity extends AppCompatActivity implements ButtonFragment.OnFragmentInteractionListener
, PeopleFragment.OnFragmentInteractionListener , DetailsPeopleFragment.OnFragmentInteractionListener ,
PlanetsFragment.OnFragmentInteractionListener , DetailsPlanetFragment.OnFragmentInteractionListener ,
StarshipFragment.OnFragmentInteractionListener {

    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.btnsFrangment , new ButtonFragment())
                .addToBackStack(null)
                .commit();


    }


    @Override
    public void onBtnPeopleClicked() {
        Log.d("btnPeople" , "button clicked success");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.btnsFrangment , new PeopleFragment())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBtnPlanetsClicked() {

        Log.d("btnPlanets" , "planet button success");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.btnsFrangment , new PlanetsFragment())
                .addToBackStack(null)
                .commit();

    }

    @Override
    public void onBtnStarshipsClicked() {

        Log.d("btn starships" , "starships button clicked");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.btnsFrangment , new StarshipFragment())
                .addToBackStack(null)
                .commit();
    }

    //people fragment
    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void navigateToCharactersDetails(Starship character){

        Fragment fragment = DetailsPeopleFragment.newInstance(character);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.btnsFrangment , fragment)
                .addToBackStack(null)
                .commit();

    }

    public void navigateToPlanetsDetails (Planet planet){
        Fragment fragment = DetailsPlanetFragment.newInstance(planet);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.btnsFrangment ,fragment)
                .addToBackStack(null)
                .commit();



    }
}
