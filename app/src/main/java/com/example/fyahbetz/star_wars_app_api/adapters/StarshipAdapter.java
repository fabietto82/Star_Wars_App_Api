package com.example.fyahbetz.star_wars_app_api.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.fyahbetz.star_wars_app_api.models.Starship;

import java.util.List;

public class StarshipAdapter extends RecyclerView.Adapter<StarshipAdapter.Holder> {


    private Activity mActivity;
    private List<Starship> starships;

    public StarshipAdapter(Activity mActivity, List<Starship> starships) {
        this.mActivity = mActivity;
        this.starships = starships;
    }




    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return starships.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        public Holder(View itemView) {
            super(itemView);
        }
    }
}
