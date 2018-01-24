package example.codeclan.com.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/01/2018.
 */

public class TopGamesTest {

    @Test
    public void getListTest() {
        TopGames topGames = new TopGames();
        assertEquals(10, topGames.getList().size());
    }
}
