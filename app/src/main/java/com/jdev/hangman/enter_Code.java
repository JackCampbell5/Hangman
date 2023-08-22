package com.jdev.hangman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class enter_Code extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String what_Level;
    private Button enter_Button;
    private EditText enter_Code;
    private Button back_Button;
    private String code_entered;
    private TextView code_for_witch_level;
    private Spinner spinner;
    private static final String[] paths = {"Menu","Home", "Level Select", "Help","Settings"};
    final String witch_level = "enter_code";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter__code);


        what_Level = level_select.what_level;

        code_for_witch_level  = (TextView) findViewById(R.id.code_for_witch_level);
        code_for_witch_level.setText("Code for level " +what_Level);

        enter_Button = (Button) findViewById(R.id.enter_Button);
        enter_Code = (EditText) findViewById(R.id.enter_Code);

        enter_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                code_entered = enter_Code.getText().toString();


                //todo change when second level is made
                if (what_Level.equals("two")) {
                    if (code_entered.equals("places")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }

                if (what_Level.equals("three")) {
                    if (code_entered.equals("movieandtv")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }

                if (what_Level.equals("four")) {
                    if (code_entered.equals("marvel")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("five")) {
                    if (code_entered.equals("sports")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("six")) {
                    if (code_entered.equals("companies")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("seven")) {
                    if (code_entered.equals("book")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("eight")) {
                    if (code_entered.equals("clothing")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("nine")) {
                    if (code_entered.equals("presidents")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("ten")) {
                    if (code_entered.equals("movietitles")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("eleven")) {
                    if (code_entered.equals("cartoons")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("twelve")) {
                    if (code_entered.equals("bourdgames")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("thirteen")) {
                    if (code_entered.equals("sports")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("fourteen")) {
                    if (code_entered.equals("superheros")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("fifteen")) {
                    if (code_entered.equals("emotions")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("sixteen")) {
                    if (code_entered.equals("schoolclasses")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("seventeen")) {
                    if (code_entered.equals("schoolsupplies")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("eighteen")) {
                    if (code_entered.equals("weather")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("nineteen")) {
                    if (code_entered.equals("vacationlocations")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("20")) {
                    if (code_entered.equals("emojis")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("21")) {
                    if (code_entered.equals("videogames")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("22")) {
                    if (code_entered.equals("animals")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("23")) {
                    if (code_entered.equals("states")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("24")) {
                    if (code_entered.equals("countries")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }
                if (what_Level.equals("25")) {
                    if (code_entered.equals("booktitles")) {
                        MainActivity.last_Screen = witch_level;
                        Intent intent = new Intent(enter_Code.this,first_level.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(enter_Code.this, "That is not the correct code for this level.", Toast.LENGTH_LONG).show();

                    }
                }




            }
        });
        MediaPlayer hangman_music  = MediaPlayer.create(this , R.raw.music_for_hangman);
        boolean music_swich_boolean = settings.music_swich_boolean;
        if (music_swich_boolean == true ){
            hangman_music.setLooping(true);
            hangman_music.setVolume(100,100);
            hangman_music.start();
        }else if (music_swich_boolean == false){
            hangman_music.setVolume(0,0);
            hangman_music.start();
        }
        //makes multiple choice menu
        spinner = (Spinner) findViewById(R.id.menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(enter_Code.this,
                android.R.layout.simple_spinner_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //Sets the title bar



        //the back button
        Button back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  last_Screen2 = MainActivity.last_Screen;

                if (last_Screen2.equals("home")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(enter_Code.this,MainActivity.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("level_select")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(enter_Code.this,level_select.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("enter_code")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(enter_Code.this,enter_Code.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("first_level")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(enter_Code.this,first_level.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("help")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(enter_Code.this,help_screen.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("settings")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(enter_Code.this,settings.class);
                    startActivity(intent);
                }
            }
        });

    }
    // What to do when THe button is cleack and each indevidual menu idem is clicked
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            //Home
            case 1:

                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the first item gets selected
                Intent intent = new Intent(enter_Code.this, MainActivity.class);
                startActivity(intent);

                break;
            //level Select
            case 2:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the second item gets selected
                Intent intent2 = new Intent(enter_Code.this, level_select.class);
                startActivity(intent2);
                break;
            //Help
            case 3:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent3 = new Intent(enter_Code.this, help_screen.class);
                startActivity(intent3);
                break;
            case 4:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent4 = new Intent(enter_Code.this, settings.class);
                startActivity(intent4);
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

}
