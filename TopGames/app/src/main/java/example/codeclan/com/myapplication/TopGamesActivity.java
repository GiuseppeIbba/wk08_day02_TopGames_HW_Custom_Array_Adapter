package example.codeclan.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_list);

        TopGames topGames = new TopGames();   //new instance of TopGames
        ArrayList<Game> list = topGames.getList(); ////call the getList() method

        //create a new TopGamesAdapter that pass two arguments, this activity's context and the ArrayList of games
        TopGamesAdapter  gameAdapter = new TopGamesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(gameAdapter);
    }

    public void onListItemClick(View listItem) {
        Game game = (Game) listItem.getTag();
        Log.d("Game Title: ", game.getTitle());
    }
}
