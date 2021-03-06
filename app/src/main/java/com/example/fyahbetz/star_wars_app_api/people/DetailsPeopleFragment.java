package com.example.fyahbetz.star_wars_app_api.people;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fyahbetz.star_wars_app_api.R;
import com.example.fyahbetz.star_wars_app_api.models.Result;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailsPeopleFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailsPeopleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsPeopleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String CHARACTER = "character";
    private static final String ARG_PARAM2 = "param2";

    private TextView mCharName;
    private TextView mCharHeight;
    private TextView mCharMass;
    private TextView mCharHairColor;
    private TextView mCharSkinColor;


    // TODO: Rename and change types of parameters
    private Result mCharacter;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DetailsPeopleFragment() {
        // Required empty public constructor
    }



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param character Parameter 1.
     * //@param param2 Parameter 2.
     * @return A new instance of fragment DetailsPeopleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsPeopleFragment newInstance(Result character) {
        DetailsPeopleFragment fragment = new DetailsPeopleFragment();
        Bundle args = new Bundle();
        args.putParcelable(CHARACTER, character);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mCharacter = getArguments().getParcelable(CHARACTER);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details_people, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Result character = mCharacter;
        mCharName =(TextView)view.findViewById(R.id.tv_charName);
        mCharName.setText(character.getName());

        mCharHeight = (TextView) view.findViewById(R.id.tv_height);
        mCharHeight.setText(mCharacter.getHeight());

        mCharMass = (TextView) view.findViewById(R.id.tv_mass);
        mCharMass.setText(mCharacter.getMass());

        mCharHairColor = (TextView)view.findViewById(R.id.tv_hair_color);
        mCharHairColor.setText(mCharacter.getHairColor());

        mCharSkinColor = (TextView)view.findViewById(R.id.tv_skin_color);
        mCharSkinColor.setText(mCharacter.getSkinColor());

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
