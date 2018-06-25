package com.example.fyahbetz.star_wars_app_api.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fyahbetz.star_wars_app_api.MainActivity;
import com.example.fyahbetz.star_wars_app_api.R;
import com.example.fyahbetz.star_wars_app_api.models.Planet;

import java.util.List;

public class PlanetsAdapter extends RecyclerView.Adapter<PlanetsAdapter.Holder> {

    private List<Planet> mPlanet;
    private Activity mActivity;

    public PlanetsAdapter(Activity mActivity , List<Planet> mPlanet ) {
        this.mPlanet = mPlanet;
        this.mActivity = mActivity;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list_people , parent , false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Planet planet = mPlanet.get(position);

        holder.textViewPlanetName.setText(planet.getName());

        holder.container.setTag(position);

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("planet clicklistener" , "planets click listener");
                ((MainActivity)mActivity).navigateToPlanetsDetails(mPlanet.get((Integer) view.getTag()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPlanet.size();
    }


    class Holder extends RecyclerView.ViewHolder {

        private LinearLayout container;
        private TextView textViewPlanetName;
        public Holder(View itemView) {
            super(itemView);

            // sto riciclando le res di People ... il container e la sua textview
            container = (LinearLayout) itemView.findViewById(R.id.container);
            textViewPlanetName = (TextView)itemView.findViewById(R.id.tv_single_peple);
        }


    }
}
