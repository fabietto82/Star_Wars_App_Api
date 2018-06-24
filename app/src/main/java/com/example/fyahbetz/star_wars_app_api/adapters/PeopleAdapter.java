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
import com.example.fyahbetz.star_wars_app_api.models.Result;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.Holder> {

    private Activity mActivity;

    private MainActivity mmActivity;
    private List<Result> characters;

    public PeopleAdapter(Activity activity, List<Result> characters) {
        this.mActivity = activity;
        this.characters = characters;
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

        Result character = characters.get(position);

        holder.textViewCharName.setText(character.getName());

        holder.container.setTag(position);

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //TODO crea metodo on click dove mi faccio dare l'item cliccato da passare a detail people fragment
                Log.d("onclick" , "on clicklistener funziona");

                ((MainActivity)mActivity).navigateToCharactersDetails(characters.get((Integer) v.getTag()));

            }
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        private LinearLayout container;
        private TextView textViewCharName;

        public Holder(View itemView) {
            super(itemView);

            container = (LinearLayout) itemView.findViewById(R.id.container);
            textViewCharName = (TextView) itemView.findViewById(R.id.tv_single_peple);




        }
    }

}
