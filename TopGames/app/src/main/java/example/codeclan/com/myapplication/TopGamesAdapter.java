package example.codeclan.com.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 24/01/2018.
 */

public class TopGamesAdapter extends ArrayAdapter<Game> {  /// put extends ArrayAdapter<Game>

    public TopGamesAdapter(Context context, ArrayList<Game> games) {
            super(context, 0, games);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.game_item, parent, false);
        }

        Game currentGame = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentGame.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentGame.getTitle().toString());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentGame.getYear().toString());


        return listItemView;
    }
}

//
//    In our constructor we call super to call the ```ArrayAdapter``` constructor takes three arguments:
//
//        * the context (TopGamesActivity)
//        * a resource int, which we are going to pass as 0, because we are not wanting to use a default resource.
//        * the data to be displayed. In our case this is the ```ArrayList``` of Game objects returned by the call to ```getList()```.
