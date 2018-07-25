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

public class EventsFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private int attraction[] = {R.string.book_fair,R.string.fashion,R.string.kids_fair,R.string.food_tech,R.string.indplas};
    private  int locations[] = {R.string.salt_lake,R.string.eco_park,R.string.gariahat,R.string.sciencity,R.string.newtown};
    private int date[] = {R.string.date1,R.string.date2,R.string.date3,R.string.date4,R.string.date5};
    private int contentImages[]= {R.drawable.book_fair,R.drawable.fashion,R.drawable.kids_fair,R.drawable.food_tech,R.drawable.indplas};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of contentHandlers
        final ArrayList<ContentHandler> contentHandlers = new ArrayList<ContentHandler>();
        for(int i = 0; i < attraction.length; i++) {
            String s = (String) (getText(R.string.date));
            s += getText(date[i]);

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
    }
}
