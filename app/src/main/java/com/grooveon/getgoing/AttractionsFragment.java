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


public class AttractionsFragment extends Fragment {


    private OnFragmentInteractionListener mListener;
    private int attraction[] = {R.string.nico_park,R.string.eden,R.string.howrah,R.string.museum,R.string.kalighat};
    private  int locations[] = {R.string.salt_lake,R.string.esplanade,R.string.howrah1,R.string.taltala,R.string.tolly};
    private int traveltime[] = {R.string.time1,R.string.time2,R.string.time3,R.string.time4,R.string.time5};
    private int contentImages[]= {R.drawable.nico_aprk,R.drawable.eden_gardens,R.drawable.howrah_bridge_1,R.drawable.indian_museum,R.drawable.kalighat};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of contentHandlers
        final ArrayList<ContentHandler> contentHandlers = new ArrayList<ContentHandler>();
        for(int i = 0; i < attraction.length; i++) {
            String s = (String) (getText(R.string.travel));
            s += getText(traveltime[i]);

            contentHandlers.add(new ContentHandler(getText(attraction[i])+"", ""+getText(locations[i]), ""+s, ""+getString(R.string.time),contentImages[i]));
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
        //implemented in AppActivity
    }
}
