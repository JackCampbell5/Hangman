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


public class level_select extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    private Button level_One;
    private Button level_two;
    private Button level_three;
    private Button level_four;
    private Button level_five;
    private Button level_six;
    private Button level_seven;
    private Button level_eight;
    private Button level_nine;
    private Button level_ten;
    private Button level_elevem;
    private Button level_twelve;
    private Button level_therteen;
    private Button level_fourteen;
    private Button level_fifteen;
    private Button level_sixteen;
    private Button level_seventeen;
    private Button level_eighteen;
    private Button level_nineteen;
    private Button level_20;
    private Button level_21;
    private Button level_22;
    private Button level_23;
    private Button level_24;
    private Button level_25;


    private Button back_Button;
    static String what_level;
    private Spinner spinner;
    private static final String[] paths = {"Menu","Home", "Level Select", "Help","Settings"};
    final String witch_level = "level_select";
    final String page_title = "Level Select";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);


//        ActionBar actionBar = getSupportActionBar();
//        getSupportActionBar().setTitle("Level Select");

        level_One = (Button) findViewById(R.id.level_One);
        level_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "one";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,first_level.class);
                startActivity(intent);
            }
        });

        level_two = (Button) findViewById(R.id.level_Two);
        level_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "two";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });

        level_three = (Button) findViewById(R.id.level_three);
        level_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "three";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });

        level_four = (Button) findViewById(R.id.level_four);
        level_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "four";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_five = (Button) findViewById(R.id.level_five);
        level_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "five";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_six = (Button) findViewById(R.id.level_six);
        level_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                what_level = "six";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_seven = (Button) findViewById(R.id.level_seven);
        level_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "seven";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_eight = (Button) findViewById(R.id.level_eight);
        level_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "eight";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_nine = (Button) findViewById(R.id.level_nine);
        level_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "nine";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_ten = (Button) findViewById(R.id.level_ten);
        level_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "ten";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_elevem = (Button) findViewById(R.id.level_eleven);
        level_elevem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "eleven";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_twelve = (Button) findViewById(R.id.level_tweleve);
        level_twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "twelve";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_therteen = (Button) findViewById(R.id.level_thirteen);
        level_therteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "thirteen";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_fourteen= (Button) findViewById(R.id.level_fourteen);
        level_fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "fourteen";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_fifteen= (Button) findViewById(R.id.level_fifteen);
        level_fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "fifteen";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_sixteen= (Button) findViewById(R.id.level_sixteen);
        level_sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "sixteen";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_seventeen = (Button) findViewById(R.id.level_seventeen);
        level_seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "seventeen";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_eighteen = (Button) findViewById(R.id.level_eighteen);
        level_eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "eighteen";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_nineteen= (Button) findViewById(R.id.level_nineteen);
        level_nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "nineteen";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_20= (Button) findViewById(R.id.level_twenty);
        level_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "20";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_21= (Button) findViewById(R.id.level_twentyone);
        level_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "21";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_22= (Button) findViewById(R.id.level_twentytwo);
        level_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "22";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_23= (Button) findViewById(R.id.level_twentythree);
        level_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "23";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_24= (Button) findViewById(R.id.level_twentyfour);
        level_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "24";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });
        level_25= (Button) findViewById(R.id.level_twentyfive);
        level_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                what_level = "25";
                MainActivity.last_Screen = witch_level;
                Intent intent = new Intent(level_select.this,enter_Code.class);
                startActivity(intent);
            }
        });





        //makes multiple choice menu
        spinner = (Spinner) findViewById(R.id.menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(level_select.this,
                android.R.layout.simple_spinner_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //Sets the title bar
        TextView title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText(page_title);
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

        //the back button
        Button back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  last_Screen2 = MainActivity.last_Screen;

                if (last_Screen2.equals("home")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(level_select.this,MainActivity.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("level_select")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(level_select.this,level_select.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("enter_code")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(level_select.this,enter_Code.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("first_level")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(level_select.this,first_level.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("help")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(level_select.this,help_screen.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("settings")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(level_select.this,settings.class);
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
                Intent intent = new Intent(level_select.this, MainActivity.class);
                startActivity(intent);

                break;
            //level Select
            case 2:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the second item gets selected
                Intent intent2 = new Intent(level_select.this, level_select.class);
                startActivity(intent2);
                break;
            //Help
            case 3:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent3 = new Intent(level_select.this, help_screen.class);
                startActivity(intent3);
                break;
            case 4:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent4 = new Intent(level_select.this, settings.class);
                startActivity(intent4);
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }
}
