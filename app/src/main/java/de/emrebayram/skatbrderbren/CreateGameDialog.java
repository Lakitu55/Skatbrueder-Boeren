package de.emrebayram.skatbrderbren;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

import java.util.ArrayList;

import de.emrebayram.skatbrderbren.model.Player;

/**
 * Custom dialog for starting a game. This dialog must be provided with the participating players to create a game.
 */

public class CreateGameDialog extends DialogFragment {

    private ArrayList<Player> mPlayers;
    private AlertDialog mAlertDialog;

    public CreateGameDialog() {
        // init fields
        mPlayers = new ArrayList<Player>();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        final View content = inflater.inflate(R.layout.dialog_create_game, null);
        (content.findViewById(R.id.btn_start)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO create player and add them to the list. Notify the mainactivity to start a game.
                EditText etPlayer1 = mAlertDialog.findViewById(R.id.et_player1);
                EditText etPlayer2 = mAlertDialog.findViewById(R.id.et_player2);
                EditText etPlayer3 = mAlertDialog.findViewById(R.id.et_player3);
                if (etPlayer1 != null && etPlayer2 != null && etPlayer3 != null) {
                    if (etPlayer1.getText().toString().isEmpty()) {
                        // TODO show error that player 1 must have a name
                        etPlayer1.setError(getString(R.string.error_player1_no_name));
                    } else if (etPlayer2.getText().toString().isEmpty()) {
                        // TODO show error that player 2 must have a name
                        etPlayer2.setError(getString(R.string.error_player2_no_name));
                    } else if (etPlayer3.getText().toString().isEmpty()) {
                        // TODO show error that player 3 must have a name
                        etPlayer3.setError(getString(R.string.error_player3_no_name));
                    } else {
                        // all players have a name, create them now and notifiy main activty
                        mPlayers.add(new Player(etPlayer1.getText().toString()));
                        mPlayers.add(new Player(etPlayer2.getText().toString()));
                        mPlayers.add(new Player(etPlayer3.getText().toString()));
                    }
                } else {
                    // TODO show error, that something went wrong
                }
            }
        });
        content.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // dismiss the dialog
                mAlertDialog.dismiss();
            }
        });
        builder.setView(content);
        builder.setTitle(R.string.create_game);

        // keep a reference so that the dialog can be dismissed in the click clistener
        mAlertDialog = builder.create();
        return mAlertDialog;
    }
}