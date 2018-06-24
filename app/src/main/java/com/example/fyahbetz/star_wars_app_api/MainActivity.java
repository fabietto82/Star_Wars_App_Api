package com.example.fyahbetz.star_wars_app_api;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.fyahbetz.star_wars_app_api.models.Result;
import com.example.fyahbetz.star_wars_app_api.people.DetailsPeopleFragment;
import com.example.fyahbetz.star_wars_app_api.people.PeopleFragment;

public class MainActivity extends AppCompatActivity implements ButtonFragment.OnFragmentInteractionListener
, PeopleFragment.OnFragmentInteractionListener , DetailsPeopleFragment.OnFragmentInteractionListener{

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

    }

    @Override
    public void onBtnStarshipsClicked() {

    }

    //people fragment
    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void navigateToCharactersDetails(Result character){

        Fragment fragment = DetailsPeopleFragment.newInstance(character);
        mFragmentManager.beginTransaction()
                .replace(R.id.btnsFrangment , fragment)
                .addToBackStack(null)
                .commit();

    }
}
