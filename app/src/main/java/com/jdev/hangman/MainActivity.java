package com.jdev.hangman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.jdev.hangman.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
public Button start_Button;
public static String last_Screen = "";
//add to each level
    private Spinner spinner;
    private static final String[] paths = {"Menu","Home", "Level Select", "Help","Settings"};
    final String witch_level = "home";
    final String page_title = "Home";
    private MediaPlayer hangman_music;

    private Spinner spinner_1;
    String[] settings_Spinner_Text={"Apple","Grapes","Mango","Pineapple","Strawberry"};
    //int setting_Spinner_Images[] = {R.drawable.audio_On};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Need to add to every Level

        //makes multiple choice menu
        spinner = (Spinner) findViewById(R.id.menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item, paths);



        spinner_1 = (Spinner) findViewById(R.id.menu);
        ArrayAdapter<String> adapter_1 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item, paths);

        adapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1.setAdapter(adapter_1);
        spinner_1.setOnItemSelectedListener(this);


        start_Button = (Button) findViewById(R.id.start_Button);
        start_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(MainActivity.this,level_select.class);
                startActivity(intent);
            }
        });



        //bellow if for every level




//        hangman_music  = MediaPlayer.create(this , R.raw.music_for_hangman);
//        boolean music_swich_boolean = settings.music_swich_boolean;
//        if (music_swich_boolean == true ){
//
//            hangman_music.setLooping(true);
//            hangman_music.setVolume(100,100);
//            hangman_music.start();
//        }else if (music_swich_boolean == false){
//            hangman_music.setVolume(0,0);
//            hangman_music.start();
//        }





//        //makes multiple choice menu
//        spinner = (Spinner) findViewById(R.id.menu);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_spinner_item, paths);


        //Sets the title bar
                TextView title_text = (TextView) findViewById(R.id.title_text);
        //title_text.setText(page_title);


        //the back button
        Button back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String  last_Screen2 = MainActivity.last_Screen;

                if (last_Screen2.equals("home")){
                        MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("level_select")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(MainActivity.this,level_select.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("enter_code")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(MainActivity.this,enter_Code.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("first_level")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(MainActivity.this,first_level.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("help")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(MainActivity.this,help_screen.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("settings")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(MainActivity.this,settings.class);
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
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);

                break;
            //level Select
                case 2:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the second item gets selected
                Intent intent2 = new Intent(MainActivity.this, level_select.class);
                startActivity(intent2);
                break;
                //Help
            case 3:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent3 = new Intent(MainActivity.this, help_screen.class);
                startActivity(intent3);
                break;
            case 4:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent4 = new Intent(MainActivity.this, settings.class);
                startActivity(intent4);
                break;
        }
    }

//    @Override
//    protected void onStop() {
//        if(hangman_music.isPlaying()){
//            hangman_music.stop();
//        }
//        super.onStop();
//    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }
}

