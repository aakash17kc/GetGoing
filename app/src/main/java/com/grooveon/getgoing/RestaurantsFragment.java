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

public class RestaurantsFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private int restaurants[] = {R.string.barbeque,R.string.hard,R.string.peter,R.string.baan,R.string.arsalan};
    private  int locations[] = {R.string.park_street,R.string.taltala,R.string.park_street,R.string.esplanade,R.string.hati};
    private int traveltime[] = {R.string.time1,R.string.time2,R.string.time3,R.string.time4,R.string.time5};
    private int contentImages[]= {R.drawable.bbq,R.drawable.harc_rcok_cafe,R.drawable.peter_cat,R.drawable.baan_thai,R.drawable.arsalan};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of contentHandlers
        final ArrayList<ContentHandler> contentHandlers = new ArrayList<ContentHandler>();
        for(int i = 0; i < restaurants.length; i++) {
            String s = (String) (getText(R.string.travel));
            s += getText(traveltime[i]);

            contentHandlers.add(new ContentHandler(getText(restaurants[i])+"", ""+getText(locations[i]), ""+s, ""+getString(R.string.time),contentImages[i]));
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
                    + getString(R.string.error_message));
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
