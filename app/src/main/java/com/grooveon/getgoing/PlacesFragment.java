package com.grooveon.getgoing;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PlacesFragment extends Fragment {


    private OnFragmentInteractionListener mListener;
    private int names[] = {R.string.sciencity, R.string.ghat,R.string.victorial,R.string.park,R.string.maidan};
    private  int locations[] = {R.string.kolkata, R.string.kolkata,R.string.koli,R.string.newtown, R.string.kolkata};
    private int traveltime[] = {R.string.time1,R.string.time2,R.string.time3,R.string.time4,R.string.time5};
    private  int contentImages[]= {R.drawable.sciencity,R.drawable.princep_ghat,R.drawable.victoria_memorial,R.drawable.eco_park,R.drawable.maidan};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an arrayList of objects
        final ArrayList<ContentHandler> contentHandlers = new ArrayList<ContentHandler>();
        //creating objects
        for(int i = 0; i < names.length; i++) {
            String s = (String) (getText(R.string.travel));
            s += getText(traveltime[i]);

            contentHandlers.add(new ContentHandler(getText(names[i])+"", ""+getText(locations[i]), ""+s, ""+getString(R.string.time),contentImages[i]));
        }

        ContentAdapter adapter = new ContentAdapter(getActivity(), contentHandlers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    +getString(R.string.error_message));
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
