package hoteljardinesarenal.jardinesarenal.ListAdapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import hoteljardinesarenal.jardinesarenal.Models.Room;
import hoteljardinesarenal.jardinesarenal.R;

public class RoomsAdapter extends ArrayAdapter<Room> {

    private final Activity context;
    private List<Room> rooms;


    public RoomsAdapter(Activity context, List<Room> rooms) {
        super(context, R.layout.fragment_rooms, rooms);
        this.context = context;
        this.rooms = rooms;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.room_item, null, true);
        TextView name = (TextView) rowView.findViewById(R.id.textViewName);
        TextView description = (TextView) rowView.findViewById(R.id.textViewDescription);
        RatingBar calificacion = (RatingBar) rowView.findViewById(R.id.ratingBar);
        calificacion.setNumStars(rooms.get(position).getMaxPersons());
        ImageView image = (ImageView) rowView.findViewById(R.id.imageViewRoom);
        image.setImageDrawable(rooms.get(position).getPhoto());
        //name.setText(String.valueOf(position));
        name.setText(rooms.get(position).getName());

        description.setText(rooms.get(position).getDescription());



        return rowView;
    }
}
