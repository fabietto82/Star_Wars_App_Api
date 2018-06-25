package com.example.fyahbetz.star_wars_app_api.planets;

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
import com.example.fyahbetz.star_wars_app_api.models.Planet;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailsPlanetFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailsPlanetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsPlanetFragment extends Fragment {

    private TextView mPlanetName;
    private TextView mPlanetRotation;
    private TextView mPlanetOrbital;
    private TextView mPlanetDiameter;
    private TextView mPlanetClimate;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String PLANET = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private Planet mPlanet;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DetailsPlanetFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param planet Parameter 1.
     * //@param param2 Parameter 2.
     * @return A new instance of fragment DetailsPlanetFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsPlanetFragment newInstance(Planet planet) {
        DetailsPlanetFragment fragment = new DetailsPlanetFragment();
        Bundle args = new Bundle();
        args.putParcelable(PLANET, planet);
        // args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPlanet = getArguments().getParcelable(PLANET);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details_planet, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Planet planet = mPlanet;

        mPlanetName = (TextView) view.findViewById(R.id.tv_planetName);
        mPlanetName.setText(planet.getName());

        mPlanetRotation = (TextView) view.findViewById(R.id.tv_rotation);
        mPlanetRotation.setText(planet.getRotationPeriod());

        mPlanetOrbital = (TextView)view.findViewById(R.id.tv_orbital);
        mPlanetOrbital.setText(planet.getOrbitalPeriod());

        mPlanetDiameter = (TextView)view.findViewById(R.id.tv_diameter);
        mPlanetDiameter.setText(planet.getDiameter());

        mPlanetClimate = (TextView)view.findViewById(R.id.tv_climate);
        mPlanetClimate.setText(planet.getClimate());




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
