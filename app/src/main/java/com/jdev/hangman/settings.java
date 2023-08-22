package com.jdev.hangman;

import android.content.Intent;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;


public class settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private static final String[] paths = {"Menu", "Home", "Level Select", "Help", "Settings"};
    final String witch_level = "settings";
    final String page_title = "Settings";
    private Switch music_Switch;
    private Button home_Button;
    private Button save_Button;
//    private MediaPlayer hangman_music;
//    private MediaPlayer blank_music;
    static boolean music_swich_boolean = false;
    private boolean switched_Switch = false;

    private SoundPool soundPool;
    private int hangman_Music;
    private int hangman_music_Stream;
    private Button stop_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);



                //makes multiple choice menu
                spinner = (Spinner) findViewById(R.id.menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(settings.this,
                android.R.layout.simple_spinner_item, paths);
        music_Switch = (Switch) findViewById(R.id.music_switch);


        home_Button = (Button) findViewById(R.id.home_button_Settings);
        home_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        //Sets the title bar
        TextView title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText(page_title);
        //title_text.setText(page_title);


        //the back button
        Button back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String last_Screen2 = MainActivity.last_Screen;

                if (last_Screen2.equals("home")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(settings.this, MainActivity.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("level_select")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(settings.this, level_select.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("enter_code")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(settings.this, enter_Code.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("first_level")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(settings.this, first_level.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("help")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(settings.this, help_screen.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("settings")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(settings.this, settings.class);
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
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);

                break;
            //level Select
            case 2:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the second item gets selected
                Intent intent2 = new Intent(settings.this, level_select.class);
                startActivity(intent2);
                break;
            //Help
            case 3:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent3 = new Intent(settings.this, help_screen.class);
                startActivity(intent3);
                break;
            case 4:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent4 = new Intent(settings.this, settings.class);
                startActivity(intent4);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }
}
