package de.emrebayram.skatbrderbren;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import de.emrebayram.skatbrderbren.dummy.DummyContent;
import de.emrebayram.skatbrderbren.model.Game;

public class MainActivity extends AppCompatActivity implements CreateGameDialog.GameStartListener, ScoreTableFragment.OnListFragmentInteractionListener {

    private static final String TAG_CREATE_GAME_DIALOG = "create_game_dialog";
    private Game mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO create dialog for new game
                CreateGameDialog createGameDialog = new CreateGameDialog();
                createGameDialog.show(getSupportFragmentManager(), TAG_CREATE_GAME_DIALOG);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onGameCreated(Game game) {
        mGame = game;
    }


    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
