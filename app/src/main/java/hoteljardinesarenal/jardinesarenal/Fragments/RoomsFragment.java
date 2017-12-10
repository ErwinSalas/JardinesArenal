package hoteljardinesarenal.jardinesarenal.Fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import hoteljardinesarenal.jardinesarenal.ListAdapters.RoomsAdapter;
import hoteljardinesarenal.jardinesarenal.Models.Room;
import hoteljardinesarenal.jardinesarenal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RoomsFragment extends Fragment {

    public ArrayList<Room> rooms;
    public RoomsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_rooms, container, false);
        ListView list = (ListView) rootView.findViewById(R.id.listView);
        rooms=new ArrayList<>();
        Room room1=new Room("FAMILY ROOM","Equipped with a/c, private bath, cable TV, hot water, " +
                "coffee maker and overlooking the Arenal Volcano is located on the...",5,80,
                getResources().getDrawable(getResources().getIdentifier("@drawable/family", null, getActivity().getPackageName())));
        rooms.add(room1);
        Room room2=new Room("SUPERIOR ROOM","Equipped with a/c, private bath, cable TV, hot water, " +
                "coffee maker and overlooking the Arenal Volcano is located on the...",3,60,
                getResources().getDrawable(getResources().getIdentifier("@drawable/superior", null, getActivity().getPackageName())));
        rooms.add(room2);
        Room room3=new Room("STANDAR ROOM","Equipped with a/c, private bath, cable TV, hot water, " +
                "coffee maker and overlooking the Arenal Volcano is located on the...",3,50,
                getResources().getDrawable(getResources().getIdentifier("@drawable/standar", null, getActivity().getPackageName())));
        rooms.add(room3);

        RoomsAdapter listAdapter=new RoomsAdapter(this.getActivity(), rooms);
        list.setAdapter(listAdapter);




        return rootView;
    }

}
