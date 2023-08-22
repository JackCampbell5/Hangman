package com.jdev.hangman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.DialogInterface;


import java.util.Random;


public class first_level extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //All of teh letter keys start
    private Button a_Button;
    private Button b_Button;
    private Button c_Button;
    private Button d_Button;
    private Button e_Button;
    private Button f_Button;
    private Button g_Button;
    private Button h_Button;
    private Button i_Button;
    private Button j_Button;
    private Button k_Button;
    private Button l_Button;
    private Button m_Button;
    private Button n_Button;
    private Button o_Button;
    private Button p_Button;
    private Button q_Button;
    private Button r_Button;
    private Button s_Button;
    private Button t_Button;
    private Button u_Button;
    private Button v_Button;
    private Button w_Button;
    private Button x_Button;
    private Button y_Button;
    private Button z_Button;
    private ImageView hang_Thing;
    private TextView catgories_Text;
    private TextView word_To_Guess;
    private TextView what_Level;
    private Button back_Button;
    private TextView random_Catagory;
    private ImageView you_Won;
    private int count = 0;
    private String user_Clicked;
    boolean somthing_CLicked_Boolean = false;
    boolean a_selected = false;
    boolean b_selected = false;
    boolean c_selected = false;
    boolean d_selected = false;
    boolean e_selected = false;
    boolean f_selected = false;
    boolean g_selected = false;
    boolean h_selected = false;
    boolean i_selected = false;
    boolean j_selected = false;
    boolean k_selected = false;
    boolean l_selected = false;
    boolean m_selected = false;
    boolean n_selected = false;
    boolean o_selected = false;
    boolean p_selected = false;
    boolean q_selected = false;
    boolean r_selected = false;
    boolean s_selected = false;
    boolean t_selected = false;
    boolean u_selected = false;
    boolean v_selected = false;
    boolean w_selected = false;
    boolean x_selected = false;
    boolean y_selected = false;
    boolean z_selected = false;
    private Button guess_Button;
    private boolean another_selected = false;
    private int amount_of_letters;
    private int l;
    private String letter_1;
    private String letter_2;
    private String letter_3;
    private String letter_4;
    private String letter_5;
    private String letter_6;
    private String letter_7;
    private String letter_8;
    private String letter_9;
    private String letter_10;
    private String letter_11;
    private String letter_12;
    private String letter_13;
    private String letter_14;
    private String letter_15;
    private String letter_16;
    private String letter_17;
    private String letter_18;
    private String letter_19;
    private String letter_20;
    private String letter_21;
    private String letter_22;
    private String letter_23;
    private String letter_24;
    private String letter_25;
    private Character letter_1_Char;
    private Character letter_2_Char;
    private Character letter_3_Char;
    private Character letter_4_Char;
    private Character letter_5_Char;
    private Character letter_6_Char;
    private Character letter_7_Char;
    private Character letter_8_Char;
    private Character letter_9_Char;
    private Character letter_10_Char;
    private Character letter_11_Char;
    private Character letter_12_Char;
    private Character letter_13_Char;
    private Character letter_14_Char;
    private Character letter_15_Char;
    private Character letter_16_Char;
    private Character letter_17_Char;
    private Character letter_18_Char;
    private Character letter_19_Char;
    private Character letter_20_Char;
    private Character letter_21_Char;
    private Character letter_22_Char;
    private Character letter_23_Char;
    private Character letter_24_Char;
    private Character letter_25_Char;
    private TextView what_problom;
    private String blank_1;
    private String blank_2;
    private String blank_3;
    private String blank_4;
    private String blank_5;
    private String blank_6;
    private String blank_7;
    private String blank_8;
    private String blank_9;
    private String blank_10;
    private String blank_11;
    private String blank_12;
    private String blank_13;
    private String blank_14;
    private String blank_15;
    private String blank_16;
    private String blank_17;
    private String blank_18;
    private String blank_19;
    private String blank_20;
    private String blank_21;
    private String blank_22;
    private String blank_23;
    private String blank_24;
    private String blank_25;
    private String word_to_guess_Blanks;
    private int clicked_Correct = 0;
    private int lives;
    private AlertDialog.Builder alertDIalog;
    private AlertDialog.Builder alertDIalog2;
    private String user_clicked_1;
    private String user_clicked_2;
    private String user_clicked_3;
    private String user_clicked_4;
    private String user_clicked_5;
    private String user_clicked_6;
    private String user_clicked_7;
    private String user_clicked_8;
    private String user_clicked_9;
    private String user_clicked_10;
    private String user_clicked_11;
    private String user_clicked_12;
    private String user_clicked_13;
    private String user_clicked_14;
    private String user_clicked_15;
    private String user_clicked_16;
    private String user_clicked_17;
    private String user_clicked_18;
    private String user_clicked_19;
    private String user_clicked_20;
    private String user_clicked_21;
    private String user_clicked_22;
    private String user_clicked_23;
    private String user_clicked_24;
    private String user_clicked_25;
    private int how_many_times_clicked;
    private boolean clicked_same_number = false;
    private boolean next_Problom;
    private AlertDialog.Builder alertDialog3;
    static String back_button_First_Level = "";
    private Integer what_Problom_Int = 0;
    private boolean am_I_done;
    private int check_if_done;
    private String what_level;
    private String code_for_next_level = "";
    private Spinner spinner;
    private static final String[] paths = {"Menu","Home", "Level Select", "Help","Settings"};
    final String witch_level = "first_level";
    private String page_title = "First Level";

    private int jack  = 0;
    //Create music


    //End all of the letter keys

    private int[] word_donebefore = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_level);
        what_level = level_select.what_level;
        TextView title_text = (TextView) findViewById(R.id.title_text);


        //Start fining the alphabet buttons
        a_Button = (Button) findViewById(R.id.a_Button);
        b_Button = (Button) findViewById(R.id.b_Button);
        c_Button = (Button) findViewById(R.id.c_Button);
        d_Button = (Button) findViewById(R.id.d_Button);
        e_Button = (Button) findViewById(R.id.e_Button);
        f_Button = (Button) findViewById(R.id.f_Button);
        g_Button = (Button) findViewById(R.id.g_Button);
        h_Button = (Button) findViewById(R.id.h_Button);
        i_Button = (Button) findViewById(R.id.i_Button);
        j_Button = (Button) findViewById(R.id.j_Button);
        k_Button = (Button) findViewById(R.id.k_Button);
        l_Button = (Button) findViewById(R.id.l_Button);
        m_Button = (Button) findViewById(R.id.m_Button);
        n_Button = (Button) findViewById(R.id.n_Button);
        o_Button = (Button) findViewById(R.id.o_Button);
        p_Button = (Button) findViewById(R.id.p_Button);
        q_Button = (Button) findViewById(R.id.q_Button);
        r_Button = (Button) findViewById(R.id.r_Button);
        s_Button = (Button) findViewById(R.id.s_Button);
        t_Button = (Button) findViewById(R.id.t_Button);
        u_Button = (Button) findViewById(R.id.u_Button);
        v_Button = (Button) findViewById(R.id.v_Button);
        w_Button = (Button) findViewById(R.id.w_Button);
        x_Button = (Button) findViewById(R.id.x_Button);
        y_Button = (Button) findViewById(R.id.y_Button);
        z_Button = (Button) findViewById(R.id.z_Button);
        //end fining the alphabet buttons
        //find views by id
        hang_Thing = (ImageView) findViewById(R.id.hang_Thing);
        catgories_Text = (TextView) findViewById(R.id.catagories_Text);
        random_Catagory = (TextView) findViewById(R.id.random_Catagory_Text);
        word_To_Guess = (TextView) findViewById(R.id.word_To_Guess_Text);
        what_problom = (TextView) findViewById(R.id.what_Problom);
        // you_Won = (ImageView) findViewById(R.id.you_Won_Imege);
        guess_Button = (Button) findViewById(R.id.guess_Buttom);
        //end find views by id

        //Set id for buttons



        //Array to create the words / category's
        final StringBuilder[] word__To_Guess = new StringBuilder[]{new StringBuilder(), new StringBuilder(), new StringBuilder(),
                new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()};
        // ArrayList <String> categorys  =  new ArrayList();
        final String[] categorys;
        categorys = new String[200];

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

        if (what_level.equals("one")) {
            // todo change for each level
            code_for_next_level = getString(R.string.code_for_secound_level);
            catgories_Text.setText("Level 1's category is:");
            page_title = "First Level";


            word__To_Guess[0].append("car");
            categorys[0] = "Transportation";
            word__To_Guess[1].append("race car");
            word__To_Guess[2].append("airplane");
            word__To_Guess[3].append("trolley");
            word__To_Guess[4].append("helicopter");
            word__To_Guess[5].append("ferry");
            word__To_Guess[6].append("train");
            word__To_Guess[7].append("taxi");

        } else if (what_level.equals("two")) {
            code_for_next_level = getString(R.string.code_forThird_Level);
            catgories_Text.setText("Level 2's category is:");
            page_title = "Secound Level";

            word__To_Guess[0].append("paris");
            categorys[0] = "Places";
            word__To_Guess[1].append("london");
            word__To_Guess[2].append("rome");
            word__To_Guess[3].append("yosemite");
            word__To_Guess[4].append("grand canyon");
            word__To_Guess[5].append("sydney");
            word__To_Guess[6].append("florence");
            word__To_Guess[7].append("costa rica");

        } else if (what_level.equals("three")) {
            code_for_next_level = getString(R.string.code_for_forth_level);
            catgories_Text.setText("Level 3's category is:");
            page_title = "Third Level";

            word__To_Guess[0].append("captain kirk");
            categorys[0] = "Movie and Tv Characters";
            word__To_Guess[1].append("sherlock holmes");
            word__To_Guess[2].append("harry potter");
            word__To_Guess[3].append("james bond");
            word__To_Guess[4].append("marty mcfly");
            word__To_Guess[5].append("gandalf");
            word__To_Guess[6].append("luke skywalker");
            word__To_Guess[7].append("john mcclane");

        } else if (what_level.equals("four")) {
            code_for_next_level = getString(R.string.code_for_fifth_level);
            catgories_Text.setText("Level 4's category is:");
            page_title = "Fourth Level";

            word__To_Guess[0].append("thanos");
            categorys[0] = "Marvel";
            word__To_Guess[1].append("spider man");
            word__To_Guess[2].append("deadpool");
            word__To_Guess[3].append("wolverine");
            word__To_Guess[4].append("ant man");
            word__To_Guess[5].append("professor x");
            word__To_Guess[6].append("shield");
            word__To_Guess[7].append("stan lee");

        } else if (what_level.equals("five")) {
            code_for_next_level = getString(R.string.code_for_sixth_level);
            catgories_Text.setText("Level 5's category is:");
            page_title = "Fifth Level";

            word__To_Guess[0].append("boxing");
            categorys[0] = "Sports";
            word__To_Guess[1].append("soccer");
            word__To_Guess[2].append("tennis");
            word__To_Guess[3].append("volleyball");
            word__To_Guess[4].append("track and feild");
            word__To_Guess[5].append("basketball");
            word__To_Guess[6].append("pole vaulting");
            word__To_Guess[7].append("hockey");

        } else if (what_level.equals("six")) {
            code_for_next_level = getString(R.string.code_for_seventh_level);
            catgories_Text.setText("Level 6's category is:");
            page_title = "Sixth Level";

            word__To_Guess[0].append("amazon");
            categorys[0] = "Companies";
            word__To_Guess[1].append("google");
            word__To_Guess[2].append("apple");
            word__To_Guess[3].append("target");
            word__To_Guess[4].append("walmart");
            word__To_Guess[5].append("best buy");
            word__To_Guess[6].append("samsung");
            word__To_Guess[7].append("microsoft");

        } else if (what_level.equals("seven")) {

            code_for_next_level = getString(R.string.code_for_eigth_level);
            catgories_Text.setText("Level 7's category is:");
            page_title = "Seventh Level";

            word__To_Guess[0].append("harry potter");
            categorys[0] = "Childrens Book Characters";
            word__To_Guess[1].append("percey jackson");
            word__To_Guess[2].append("sherlock holmes");
            word__To_Guess[3].append("anne shirley");
            word__To_Guess[4].append("beatrice prior");
            word__To_Guess[5].append("katniss everdeen");
            word__To_Guess[6].append("ron weasley");
            word__To_Guess[7].append("hermione granger");
        } else if (what_level.equals("eight")) {
            code_for_next_level = getString(R.string.code_for_ninth_level);
            catgories_Text.setText("Level 8s category is:");
            page_title = "Eighth Level";

            word__To_Guess[0].append("sweater");
            categorys[0] = "Clothing";
            word__To_Guess[1].append("hoodie");
            word__To_Guess[2].append("jeans");
            word__To_Guess[3].append("suit");
            word__To_Guess[4].append("coat");
            word__To_Guess[5].append("dress shirts");
            word__To_Guess[6].append("vest");
            word__To_Guess[7].append("shoes");
        }else if (what_level.equals("nine")) {
            code_for_next_level = getString(R.string.code_for_tenth_level);
            catgories_Text.setText("Level 9's Category is:");
            page_title = "Ninth Level";

            word__To_Guess[0].append("	george washington");
            categorys[0] = "Presidents";
            word__To_Guess[1].append("john adams");
            word__To_Guess[2].append("james madison");
            word__To_Guess[3].append("abraham lincoln");
            word__To_Guess[4].append("ulysses s grant");
            word__To_Guess[5].append("john f kennedy");
            word__To_Guess[6].append("thomas jefferson");
            word__To_Guess[7].append("james madison");
        }else if (what_level.equals("ten")) {
            page_title = "Tenth Level";
            code_for_next_level = getString(R.string.code_for_eleventh_level);
            catgories_Text.setText("Level 10's Category is:");

            word__To_Guess[0].append("die hard	");
            categorys[0] = "Movie Titles";
            word__To_Guess[1].append("back to the future");
            word__To_Guess[2].append("mission impossible");
            word__To_Guess[3].append("air force one");
            word__To_Guess[4].append("avengers endgame");
            word__To_Guess[5].append("avatar");
            word__To_Guess[6].append("a new hope");
            word__To_Guess[7].append("batman begins");
        }else if (what_level.equals("eleven")) {
            page_title = "Eleventh Level";
            code_for_next_level = getString(R.string.code_for_twelfth_level);
            catgories_Text.setText("Level 11's Category is:");

            word__To_Guess[0].append("scooby doo");
            categorys[0] = "Cartoons";
            word__To_Guess[1].append("charlie brown");
            word__To_Guess[2].append("winnie the pooh");
            word__To_Guess[3].append("mickey mouse");
            word__To_Guess[4].append("donald duck");
            word__To_Guess[5].append("snoopy");
            word__To_Guess[6].append("bugs bunny");
            word__To_Guess[7].append("batman");
        }else if (what_level.equals("twelve")) {
            page_title = "Twelfth Level";
            code_for_next_level = getString(R.string.code_for_thirteenth_level);
            catgories_Text.setText("Level 12's Category is:");

            word__To_Guess[0].append("scrabble	");
            categorys[0] = "Board Games";
            word__To_Guess[1].append("chess");
            word__To_Guess[2].append("clue");
            word__To_Guess[3].append("apples to apples");
            word__To_Guess[4].append("battleship");
            word__To_Guess[5].append("yahtzee");
            word__To_Guess[6].append("checker");
            word__To_Guess[7].append("sorry");
        }else if (what_level.equals("thirteen")) {
            page_title = "	Thirteenth Level	";
            code_for_next_level = getString(R.string.code_for_fourteenth_level);
            catgories_Text.setText("Level 13's Category is:");

            word__To_Guess[0].append("ping pong");
            categorys[0] = "Sports";
            word__To_Guess[1].append("football");
            word__To_Guess[2].append("soccer");
            word__To_Guess[3].append("hockey");
            word__To_Guess[4].append("basketball");
            word__To_Guess[5].append("boxing");
            word__To_Guess[6].append("gymnastics");
            word__To_Guess[7].append("volleyball");
        }else if (what_level.equals("fourteen")) {
            page_title = "Fourteenth Level";
            code_for_next_level = getString(R.string.code_for_fifteenth_level);
            catgories_Text.setText("Level 14's Category is:");

            word__To_Guess[0].append("batman");
            categorys[0] = "Super Heroes";
            word__To_Guess[1].append("green lantern");
            word__To_Guess[2].append("super man");
            word__To_Guess[3].append("wonder women");
            word__To_Guess[4].append("aquaman");
            word__To_Guess[5].append("flash");
            word__To_Guess[6].append("green arrow");
            word__To_Guess[7].append("cyborg");
        }else if (what_level.equals("fifteen")) {
            page_title = "Fifteenth Level";
            code_for_next_level = getString(R.string.code_for_sixteenth_level);
            catgories_Text.setText("Level 	15's Category is:");

            word__To_Guess[0].append("happyness");
            categorys[0] = "Emotions";
            word__To_Guess[1].append("guilt");
            word__To_Guess[2].append("amusement");
            word__To_Guess[3].append("disappointment");
            word__To_Guess[4].append("confusion");
            word__To_Guess[5].append("sadness");
            word__To_Guess[6].append("boredom");
            word__To_Guess[7].append("surprise");
        }else if (what_level.equals("sixteen")) {
            page_title = "Sixteenth Level";
            code_for_next_level = getString(R.string.code_for_seventeenth_level);
            catgories_Text.setText("Level 	16's Category is:");

            word__To_Guess[0].append("physics");
            categorys[0] = "School Classes";
            word__To_Guess[1].append("lierature");
            word__To_Guess[2].append("geometry");
            word__To_Guess[3].append("algebra");
            word__To_Guess[4].append("chemistry");
            word__To_Guess[5].append("us history");
            word__To_Guess[6].append("spanish");
            word__To_Guess[7].append("physical education");
        }else if (what_level.equals("seventeen")) {
                page_title = "Seventeenth Level";
                code_for_next_level = getString(R.string.code_for_eighteenth_level);
                catgories_Text.setText("Level 17's Category is:");

            word__To_Guess[0].append("three ring binder");
            categorys[0] = "School Supplies";
            word__To_Guess[1].append("composition books");
            word__To_Guess[2].append("ballpoint pens");
            word__To_Guess[3].append("colored pencils");
            word__To_Guess[4].append("supply box");
            word__To_Guess[5].append("subject dividers");
            word__To_Guess[6].append("backpack");
            word__To_Guess[7].append("crayon");
        }else if (what_level.equals("eighteen")) {
            page_title = "Eighteenth Level";
            code_for_next_level = getString(R.string.code_for_nineteeth_level);
            catgories_Text.setText("Level 	18's Category is:");

            word__To_Guess[0].append("cyclone");
            categorys[0] = "weather	";
            word__To_Guess[1].append("thunderstorms");
            word__To_Guess[2].append("drought");
            word__To_Guess[3].append("heat wave");
            word__To_Guess[4].append("dust storm");
            word__To_Guess[5].append("wildfire");
            word__To_Guess[6].append("hurricane");
            word__To_Guess[7].append("earthquake");
        }else if (what_level.equals("nineteen")) {
            page_title = "Nineteenth Level";
            code_for_next_level = getString(R.string.code_for_20th_level);
            catgories_Text.setText("Level 19's Category is:");

            word__To_Guess[0].append("new york new york");
            categorys[0] = "Vacation Locations";
            word__To_Guess[1].append("london england");
            word__To_Guess[2].append("miami florida");
            word__To_Guess[3].append("las vegas nevada");
            word__To_Guess[4].append("san francisco california	");
            word__To_Guess[5].append("rome italy");
            word__To_Guess[6].append("honolulu hawaii");
            word__To_Guess[7].append("sydney australia");
        }else if (what_level.equals("20")) {
            page_title = "Twentieth Level";
            code_for_next_level = getString(R.string.code_for_21th_level);
            catgories_Text.setText("Level 20's Category is:");

            word__To_Guess[0].append("grinning face");
            categorys[0] = "emojies";
            word__To_Guess[1].append("kissing face");
            word__To_Guess[2].append("tears of Joy");
            word__To_Guess[3].append("unamused face");
            word__To_Guess[4].append("disappointed face");
            word__To_Guess[5].append("poo emoji");
            word__To_Guess[6].append("sleeping face");
            word__To_Guess[7].append("angry face");
        }else if (what_level.equals("21")) {
            page_title = "Twenty First Level";
            code_for_next_level = getString(R.string.code_for_22th_level);
            catgories_Text.setText("Level 	21's Category is:");

            word__To_Guess[0].append("pac man");
            categorys[0] = "Video Games";
            word__To_Guess[1].append("tetris");
            word__To_Guess[2].append("fortnight");
            word__To_Guess[3].append("minecraft");
            word__To_Guess[4].append("disappointed face");
            word__To_Guess[5].append("poo emoji");
            word__To_Guess[6].append("sleeping face");
            word__To_Guess[7].append("angry face");
        }else if (what_level.equals("22")) {
            page_title = "Twenty Second Level";
            code_for_next_level = getString(R.string.code_for_23th_level);
            catgories_Text.setText("Level 	22's Category is:");

            word__To_Guess[0].append("elephant");
            categorys[0] = "Animals";
            word__To_Guess[1].append("rabbit");
            word__To_Guess[2].append("grissly bear");
            word__To_Guess[3].append("hippopotamus");
            word__To_Guess[4].append("kangaroo");
            word__To_Guess[5].append("leopard");
            word__To_Guess[6].append("dolphin");
            word__To_Guess[7].append("squirrel");
        }else if (what_level.equals("23")) {
            page_title = "Twenty Third Level";
            code_for_next_level = getString(R.string.code_for_24th_level);
            catgories_Text.setText("Level 23's Category is:");

            word__To_Guess[0].append("connecticut");
            categorys[0] = "States";
            word__To_Guess[1].append("new mexico");
            word__To_Guess[2].append("new jersey");
            word__To_Guess[3].append("north carolina");
            word__To_Guess[4].append("south dakota");
            word__To_Guess[5].append("rhode island");
            word__To_Guess[6].append("oregon");
            word__To_Guess[7].append("wisconsin");
        }else if (what_level.equals("24")) {
            page_title = "Twenty Fourth Level";
            code_for_next_level = getString(R.string.code_for_25th_level);
            catgories_Text.setText("Level 24's Category is:");

            word__To_Guess[0].append("germany");
            categorys[0] = "Countries";
            word__To_Guess[1].append("greece");
            word__To_Guess[2].append("australia");
            word__To_Guess[3].append("egypt");
            word__To_Guess[4].append("brazil");
            word__To_Guess[5].append("united states");
            word__To_Guess[6].append("russia");
            word__To_Guess[7].append("canada");
        }else if (what_level.equals("25")) {
            page_title = "	Twenty Fifith Level	";
            code_for_next_level = getString(R.string.you_have_finished);
            catgories_Text.setText("Level 25's Category is:");

            word__To_Guess[0].append("curious george");
            categorys[0] = "Book Titles";
            word__To_Guess[1].append("cat in the hat");
            word__To_Guess[2].append("harry potter");
            word__To_Guess[3].append("percy jackson");
            word__To_Guess[4].append("hunger games");
            word__To_Guess[5].append("divergent");
            word__To_Guess[6].append("magic treehouse");
            word__To_Guess[7].append("charlotes web");
        }



//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            public void run() {
//
//
//            }
//        }, 10000);

        if(what_level.equals("thirteen")||what_level.equals("fourteen")||what_level.equals("fifteen")||what_level.equals("sixteen")||what_level.equals("seventeen")||what_level.equals("eighteen")
        ||what_level.equals("nineteen")||what_level.equals("20")){
            title_text.setTextSize(25);
        }
        if (what_level.equals("21")||what_level.equals("22")||what_level.equals("23")||what_level.equals("24")||what_level.equals("25")){
            title_text.setTextSize(20);
        }


        // End Array to create the words / category's

        //Random
        final Random rand = new Random();
        //End Random

        //Terms for the program
        boolean keep_Going = true;
        //end terms for the program
         //Start the problom
        count++;

        hang_Thing.setImageResource(R.drawable.sixlivesleft);
        how_many_times_clicked = 0;
        //lays the foundation for teh first problem

//        a_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        b_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        c_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        d_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        e_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        f_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        g_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        h_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        i_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        j_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        k_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        l_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        m_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        n_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        o_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        p_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        q_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        r_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        s_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        t_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        u_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        v_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        w_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        x_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        y_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//        z_Button.setBackgroundColor(getResources().getColor(R.color.unselected));


        // Todo change all of teh 4s to a different number baaed on the number of questions

        boolean randomizer1 = true;
        while (randomizer1 == true) {
            l = rand.nextInt(8);
            // l +=1;
            check_if_done = 0;
            int x = 0;
            for (x = 0; x <= 8; ) {
                if (word_donebefore[x] == 1) {
                    check_if_done++;
                }
                if (x < 8) {
                    x++;
                } else {
                    break;
                }
            }

            if (word_donebefore[l] == 0) {
                word_donebefore[l] = 1;
                break;
            }
        }

        lives = 6;
        StringBuilder hello = word__To_Guess[l];
        String hello4 = hello.toString();
        int word_Langth_Int = hello4.length();
        String word_langth_String = Integer.toString(word_Langth_Int);
        amount_of_letters = word_Langth_Int;

        what_Problom_Int = what_Problom_Int + 1;
        what_problom.setText("Problem " + what_Problom_Int.toString()+"/4");
        next_Problom = false;

            //Todo turn on this when you are editing
//        what_problom.setText(word__To_Guess[l]);
//        guess_Button.setText("JAck"+word_langth_String);

        user_clicked_1 = " ";
        user_clicked_2 = " ";
        user_clicked_3 = " ";
        user_clicked_4 = " ";
        user_clicked_5 = " ";
        user_clicked_6 = " ";
        user_clicked_7 = " ";
        user_clicked_8 = " ";
        user_clicked_9 = " ";
        user_clicked_10 = " ";
        user_clicked_11 = " ";
        user_clicked_12 = " ";
        user_clicked_13 = " ";
        user_clicked_14 = " ";
        user_clicked_15 = " ";
        user_clicked_16 = " ";
        user_clicked_17 = " ";
        user_clicked_18 = " ";
        user_clicked_19 = " ";
        user_clicked_20 = " ";
        user_clicked_21 = " ";
        user_clicked_22 = " ";
        user_clicked_23 = " ";
        user_clicked_24 = " ";
        user_clicked_25 = " ";


        if (amount_of_letters >= 1) {
            blank_1 = "-";
            letter_1_Char = word__To_Guess[l].charAt(0);
            letter_1 = letter_1_Char.toString();
            if (letter_1.equals(" ")) {
                blank_1 = " ";
            }
        }
        if (amount_of_letters >= 2) {
            blank_2 = "-";
            letter_2_Char = word__To_Guess[l].charAt(1);
            letter_2 = letter_2_Char.toString();
            if (letter_2.equals(" ")) {
                blank_2 = " ";
            }
        }
        if (amount_of_letters >= 3) {
            blank_3 = "-";
            letter_3_Char = word__To_Guess[l].charAt(2);
            letter_3 = letter_3_Char.toString();
            if (letter_3.equals(" ")) {
                blank_3 = " ";
            }
        }
        if (amount_of_letters >= 4) {
            blank_4 = "-";
            letter_4_Char = word__To_Guess[l].charAt(3);
            letter_4 = letter_4_Char.toString();
            if (letter_4.equals(" ")) {
                blank_4 = " ";
            }
        }
        if (amount_of_letters >= 5) {
            blank_5 = "-";
            letter_5_Char = word__To_Guess[l].charAt(4);
            letter_5 = letter_5_Char.toString();
            if (letter_5.equals(" ")) {
                blank_5 = " ";
            }
        }
        if (amount_of_letters >= 6) {
            blank_6 = "-";
            letter_6_Char = word__To_Guess[l].charAt(5);
            letter_6 = letter_6_Char.toString();
            if (letter_6.equals(" ")) {
                blank_6 = " ";
            }
        }
        if (amount_of_letters >= 7) {
            blank_7 = "-";
            letter_7_Char = word__To_Guess[l].charAt(6);
            letter_7 = letter_7_Char.toString();
            if (letter_7.equals(" ")) {
                blank_7 = " ";
            }
        }
        if (amount_of_letters >= 8) {
            blank_8 = "-";
            letter_8_Char = word__To_Guess[l].charAt(7);
            letter_8 = letter_8_Char.toString();
            if (letter_8.equals(" ")) {
                blank_8 = " ";
            }
        }
        if (amount_of_letters >= 9) {
            blank_9 = "-";
            letter_9_Char = word__To_Guess[l].charAt(8);
            letter_9 = letter_9_Char.toString();
            if (letter_9.equals(" ")) {
                blank_9 = " ";
            }
        }
        if (amount_of_letters >= 10) {
            blank_10 = "-";
            letter_10_Char = word__To_Guess[l].charAt(9);
            letter_10 = letter_10_Char.toString();
            if (letter_10.equals(" ")) {
                blank_10 = " ";
            }
        }
        if (amount_of_letters >= 11) {
            blank_11 = "-";
            letter_11_Char = word__To_Guess[l].charAt(10);
            letter_11 = letter_11_Char.toString();
            if (letter_11.equals(" ")) {
                blank_11 = " ";
            }
        }
        if (amount_of_letters >= 12) {
            blank_12 = "-";
            letter_12_Char = word__To_Guess[l].charAt(11);
            letter_12 = letter_12_Char.toString();
            if (letter_12.equals(" ")) {
                blank_12 = " ";
            }
        }
        if (amount_of_letters >= 13) {
            blank_13 = "-";
            letter_13_Char = word__To_Guess[l].charAt(12);
            letter_13 = letter_13_Char.toString();
            if (letter_13.equals(" ")) {
                blank_13 = " ";
            }
        }
        if (amount_of_letters >= 14) {
            blank_14 = "-";
            letter_14_Char = word__To_Guess[l].charAt(13);
            letter_14 = letter_14_Char.toString();
            if (letter_14.equals(" ")) {
                blank_14 = " ";
            }
        }
        if (amount_of_letters >= 15) {
            blank_15 = "-";
            letter_15_Char = word__To_Guess[l].charAt(14);
            letter_15 = letter_15_Char.toString();
            if (letter_15.equals(" ")) {
                blank_15 = " ";
            }
        }
        if (amount_of_letters >= 16) {
            blank_16 = "-";
            letter_16_Char = word__To_Guess[l].charAt(15);
            letter_16 = letter_16_Char.toString();
            if (letter_16.equals(" ")) {
                blank_16 = " ";
            }
        }
        if (amount_of_letters >= 17) {
            blank_17 = "-";
            letter_17_Char = word__To_Guess[l].charAt(16);
            letter_17 = letter_17_Char.toString();
            if (letter_17.equals(" ")) {
                blank_17 = " ";
            }
        }
        if (amount_of_letters >= 18) {
            blank_18 = "-";
            letter_18_Char = word__To_Guess[l].charAt(17);
            letter_18 = letter_18_Char.toString();
            if (letter_18.equals(" ")) {
                blank_18 = " ";
            }
        }
        if (amount_of_letters >= 19) {
            blank_19 = "-";
            letter_19_Char = word__To_Guess[l].charAt(18);
            letter_19 = letter_19_Char.toString();
            if (letter_19.equals(" ")) {
                blank_19 = " ";
            }
        }
        if (amount_of_letters >= 20) {
            blank_20 = "-";
            letter_20_Char = word__To_Guess[l].charAt(19);
            letter_20 = letter_20_Char.toString();
            if (letter_20.equals(" ")) {
                blank_20 = " ";
            }
        }
        if (amount_of_letters >= 21) {
            blank_21 = "-";
            letter_21_Char = word__To_Guess[l].charAt(20);
            letter_21 = letter_21_Char.toString();
            if (letter_21.equals(" ")) {
                blank_21 = " ";
            }
        }
        if (amount_of_letters >= 22) {
            blank_22 = "-";
            letter_22_Char = word__To_Guess[l].charAt(21);
            letter_22 = letter_22_Char.toString();
            if (letter_22.equals(" ")) {
                blank_22 = " ";
            }
        }
        if (amount_of_letters >= 23) {
            blank_24 = "-";
            letter_23_Char = word__To_Guess[l].charAt(22);
            letter_23 = letter_23_Char.toString();
            if (letter_23.equals(" ")) {
                blank_23 = " ";
            }
        }
        if (amount_of_letters >= 24) {
            blank_24 = "-";
            letter_24_Char = word__To_Guess[l].charAt(23);
            letter_24 = letter_24_Char.toString();
            if (letter_24.equals(" ")) {
                blank_24 = " ";
            }
        }
        if (amount_of_letters >= 25) {
            blank_25 = "-";
            letter_25_Char = word__To_Guess[l].charAt(25);
            letter_25 = letter_25_Char.toString();
            if (letter_25.equals(" ")) {
                blank_25 = " ";
            }
        }

        switch (amount_of_letters) {
            case 1:
                word_to_guess_Blanks = blank_1;
                break;
            case 2:
                word_to_guess_Blanks = blank_1 + blank_2;
                break;
            case 3:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3;
                break;
            case 4:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4;
                break;
            case 5:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5;
                break;
            case 6:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6;
                break;
            case 7:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7;
                break;
            case 8:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8;
                break;
            case 9:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9;
                break;
            case 10:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10;

                break;
            case 11:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11;
                break;
            case 12:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12;
                break;
            case 13:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13;
                break;
            case 14:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14;
                break;
            case 15:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15;
                break;
            case 16:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16;
                break;
            case 17:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17;
                break;
            case 18:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18;
                break;
            case 19:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19;
                break;
            case 20:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20;
                break;
            case 21:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21;
                break;
            case 22:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22;
                break;
            case 23:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23;
                break;
            case 24:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23 + blank_24;
                break;
            case 25:
                word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                        + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23 + blank_24 + blank_25;
                break;
        }
        a_Button.setVisibility(View.VISIBLE);
        b_Button.setVisibility(View.VISIBLE);
        c_Button.setVisibility(View.VISIBLE);
        d_Button.setVisibility(View.VISIBLE);
        e_Button.setVisibility(View.VISIBLE);
        f_Button.setVisibility(View.VISIBLE);
        g_Button.setVisibility(View.VISIBLE);
        h_Button.setVisibility(View.VISIBLE);
        i_Button.setVisibility(View.VISIBLE);
        j_Button.setVisibility(View.VISIBLE);
        k_Button.setVisibility(View.VISIBLE);
        l_Button.setVisibility(View.VISIBLE);
        m_Button.setVisibility(View.VISIBLE);
        n_Button.setVisibility(View.VISIBLE);
        o_Button.setVisibility(View.VISIBLE);
        p_Button.setVisibility(View.VISIBLE);
        q_Button.setVisibility(View.VISIBLE);
        r_Button.setVisibility(View.VISIBLE);
        s_Button.setVisibility(View.VISIBLE);
        t_Button.setVisibility(View.VISIBLE);
        u_Button.setVisibility(View.VISIBLE);
        v_Button.setVisibility(View.VISIBLE);
        w_Button.setVisibility(View.VISIBLE);
        x_Button.setVisibility(View.VISIBLE);
        y_Button.setVisibility(View.VISIBLE);
        z_Button.setVisibility(View.VISIBLE);
        word_To_Guess.setText(word_to_guess_Blanks);
        //12

        //Make teh button invisible to change probloms

        //todo change to tell what word is being done when testing
        //what_problom.setText(Integer.toString(l));
        //what_Level.setText(Integer.toString(check_if_done)+"" +Integer.toString(word_donebefore[0])+Integer.toString(word_donebefore[1])+Integer.toString(word_donebefore[2])+Integer.toString(word_donebefore[3])+Integer.toString(word_donebefore[4])+Integer.toString(word_donebefore[5])+Integer.toString(word_donebefore[6])+Integer.toString(word_donebefore[7]));


        //CHang size baaed on category
        if (categorys[0].equals("Movie and Tv Characters") || categorys[0].equals("Book Characters")) {
            random_Catagory.setTextSize(16);
        } else random_Catagory.setTextSize(24);

        //Set category
        random_Catagory.setText(categorys[0]);
        //end the foundasion code for teh problom


        a_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("a",l );

            }
        });
        b_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("b",l );


            }
        });
        c_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("c",l );


            }
        });
        d_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("d",l );


            }
        });
        e_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("e",l );


            }
        });
        f_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("f",l );


            }
        });
        g_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("g",l );


            }
        });
        h_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("h",l );


            }
        });
        i_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("i",l );


            }
        });
        j_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("j",l );


            }
        });
        k_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("k",l );


            }
        });
        l_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("l",l );


            }
        });
        m_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("m",l );


            }
        });
        n_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("n",l );


            }
        });
        o_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("o",l );


            }
        });
        p_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("p",l );

            }
        });
        q_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("q",l );


            }
        });
        r_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("r",l );


            }
        });
        s_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("s",l );


            }
        });
        t_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("t",l );


            }
        });
        u_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("u",l );


            }
        });
        v_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("v",l );


            }
        });
        w_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w_Button.setVisibility(View.INVISIBLE);
                l =   after_letter_Clicked("w",l );


            }
        });
        x_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("x",l );


            }
        });
        y_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y_Button.setVisibility(View.INVISIBLE);
                l =  after_letter_Clicked("y",l );

            }
        });
        z_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z_Button.setVisibility(View.INVISIBLE);
                  l =  after_letter_Clicked("z",l );
            }
        });


        ///amount_of_letters = word__To_Guess[l].length();


//        guess_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//              else {
//                    Toast.makeText(first_level.this, "Please select a letter.", Toast.LENGTH_LONG).show();
//
//                }
//            }
//        });


        //makes multiple choice menu
        spinner = (Spinner) findViewById(R.id.menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(first_level.this,
                android.R.layout.simple_spinner_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //Sets the title bar
        title_text.setText(page_title);


        //the back button
        Button back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String last_Screen2 = MainActivity.last_Screen;

                if (last_Screen2.equals("home")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(first_level.this, MainActivity.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("level_select")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(first_level.this, level_select.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("enter_code")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(first_level.this, enter_Code.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("first_level")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(first_level.this, first_level.class);
                    startActivity(intent);
                } else if (last_Screen2.equals("help")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(first_level.this, help_screen.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("settings")) {
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(first_level.this, help_screen.class);
                    startActivity(intent);
                }else if (last_Screen2.equals("settings")){
                    MainActivity.last_Screen = witch_level;
                    Intent intent = new Intent(first_level.this,settings.class);
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
                Intent intent = new Intent(first_level.this, MainActivity.class);
                startActivity(intent);

                break;
            //level Select
            case 2:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the second item gets selected
                Intent intent2 = new Intent(first_level.this, level_select.class);
                startActivity(intent2);
                break;
            //Help
            case 3:

                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent3 = new Intent(first_level.this, help_screen.class);
                startActivity(intent3);
                break;
            case 4:
                MainActivity.last_Screen = witch_level;
                // Whatever you want to happen when the thrid item gets selected
                Intent intent4 = new Intent(first_level.this, settings.class);
                startActivity(intent4);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onBackPressed() {

    }
    public void onHomePressed(){

    }









     int after_letter_Clicked(String user_Clicked, int l){
        String what_level;

         TextView catgories_Text;
         final Random rand = new Random();

        //Array to create the words / category's
        final StringBuilder[] word__To_Guess = new StringBuilder[]{new StringBuilder(), new StringBuilder(), new StringBuilder(),
                new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()
                , new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()};
        // ArrayList <String> categorys  =  new ArrayList();
        final String[] categorys;
        categorys = new String[200];
        what_level = level_select.what_level;
         String code_for_next_level = "";
         //Start fining the alphabet buttons
         a_Button = (Button) findViewById(R.id.a_Button);
         b_Button = (Button) findViewById(R.id.b_Button);
         c_Button = (Button) findViewById(R.id.c_Button);
         d_Button = (Button) findViewById(R.id.d_Button);
         e_Button = (Button) findViewById(R.id.e_Button);
         f_Button = (Button) findViewById(R.id.f_Button);
         g_Button = (Button) findViewById(R.id.g_Button);
         h_Button = (Button) findViewById(R.id.h_Button);
         i_Button = (Button) findViewById(R.id.i_Button);
         j_Button = (Button) findViewById(R.id.j_Button);
         k_Button = (Button) findViewById(R.id.k_Button);
         l_Button = (Button) findViewById(R.id.l_Button);
         m_Button = (Button) findViewById(R.id.m_Button);
         n_Button = (Button) findViewById(R.id.n_Button);
         o_Button = (Button) findViewById(R.id.o_Button);
         p_Button = (Button) findViewById(R.id.p_Button);
         q_Button = (Button) findViewById(R.id.q_Button);
         r_Button = (Button) findViewById(R.id.r_Button);
         s_Button = (Button) findViewById(R.id.s_Button);
         t_Button = (Button) findViewById(R.id.t_Button);
         u_Button = (Button) findViewById(R.id.u_Button);
         v_Button = (Button) findViewById(R.id.v_Button);
         w_Button = (Button) findViewById(R.id.w_Button);
         x_Button = (Button) findViewById(R.id.x_Button);
         y_Button = (Button) findViewById(R.id.y_Button);
         z_Button = (Button) findViewById(R.id.z_Button);
         //end fining the alphabet buttons
         //find views by id
         hang_Thing = (ImageView) findViewById(R.id.hang_Thing);
         catgories_Text = (TextView) findViewById(R.id.catagories_Text);
         random_Catagory = (TextView) findViewById(R.id.random_Catagory_Text);
         word_To_Guess = (TextView) findViewById(R.id.word_To_Guess_Text);
         what_problom = (TextView) findViewById(R.id.what_Problom);
         // you_Won = (ImageView) findViewById(R.id.you_Won_Imege);
         guess_Button = (Button) findViewById(R.id.guess_Buttom);

        if (what_level.equals("one")) {

            // todo change for each level
            code_for_next_level = getString(R.string.code_for_secound_level);
            catgories_Text.setText("Level 1's category is:");
            page_title = "First Level";


            word__To_Guess[0].append("car");
            categorys[0] = "Transportation";
            word__To_Guess[1].append("race car");
            word__To_Guess[2].append("airplane");
            word__To_Guess[3].append("trolley");
            word__To_Guess[4].append("helicopter");
            word__To_Guess[5].append("ferry");
            word__To_Guess[6].append("train");
            word__To_Guess[7].append("taxi");

        } else if (what_level.equals("two")) {
            code_for_next_level = getString(R.string.code_forThird_Level);
            catgories_Text.setText("Level 2's category is:");
            page_title = "Secound Level";

            word__To_Guess[0].append("paris");
            categorys[0] = "Places";
            word__To_Guess[1].append("london");
            word__To_Guess[2].append("rome");
            word__To_Guess[3].append("yosemite");
            word__To_Guess[4].append("grand canyon");
            word__To_Guess[5].append("sydney");
            word__To_Guess[6].append("florence");
            word__To_Guess[7].append("costa rica");

        } else if (what_level.equals("three")) {
            code_for_next_level = getString(R.string.code_for_forth_level);
            catgories_Text.setText("Level 3's category is:");
            page_title = "Third Level";

            word__To_Guess[0].append("captain kirk");
            categorys[0] = "Movie and Tv Characters";
            word__To_Guess[1].append("sherlock holmes");
            word__To_Guess[2].append("harry potter");
            word__To_Guess[3].append("james bond");
            word__To_Guess[4].append("marty mcfly");
            word__To_Guess[5].append("gandalf");
            word__To_Guess[6].append("luke skywalker");
            word__To_Guess[7].append("john mcclane");

        } else if (what_level.equals("four")) {
            code_for_next_level = getString(R.string.code_for_fifth_level);
            catgories_Text.setText("Level 4's category is:");
            page_title = "Fourth Level";

            word__To_Guess[0].append("thanos");
            categorys[0] = "Marvel";
            word__To_Guess[1].append("spider man");
            word__To_Guess[2].append("deadpool");
            word__To_Guess[3].append("wolverine");
            word__To_Guess[4].append("ant man");
            word__To_Guess[5].append("professor x");
            word__To_Guess[6].append("shield");
            word__To_Guess[7].append("stan lee");

        } else if (what_level.equals("five")) {
            code_for_next_level = getString(R.string.code_for_sixth_level);
            catgories_Text.setText("Level 5's category is:");
            page_title = "Fifth Level";

            word__To_Guess[0].append("boxing");
            categorys[0] = "Sports";
            word__To_Guess[1].append("soccer");
            word__To_Guess[2].append("tennis");
            word__To_Guess[3].append("volleyball");
            word__To_Guess[4].append("track and feild");
            word__To_Guess[5].append("basketball");
            word__To_Guess[6].append("pole vaulting");
            word__To_Guess[7].append("hockey");

        } else if (what_level.equals("six")) {
            code_for_next_level = getString(R.string.code_for_seventh_level);
            catgories_Text.setText("Level 6's category is:");
            page_title = "Sixth Level";

            word__To_Guess[0].append("amazon");
            categorys[0] = "Companies";
            word__To_Guess[1].append("google");
            word__To_Guess[2].append("apple");
            word__To_Guess[3].append("target");
            word__To_Guess[4].append("walmart");
            word__To_Guess[5].append("best buy");
            word__To_Guess[6].append("samsung");
            word__To_Guess[7].append("microsoft");

        } else if (what_level.equals("seven")) {

            code_for_next_level = getString(R.string.code_for_eigth_level);
            catgories_Text.setText("Level 7's category is:");
            page_title = "Seventh Level";

            word__To_Guess[0].append("harry potter");
            categorys[0] = "Childrens Book Characters";
            word__To_Guess[1].append("percey jackson");
            word__To_Guess[2].append("sherlock holmes");
            word__To_Guess[3].append("anne shirley");
            word__To_Guess[4].append("beatrice prior");
            word__To_Guess[5].append("katniss everdeen");
            word__To_Guess[6].append("ron weasley");
            word__To_Guess[7].append("hermione granger");
        } else if (what_level.equals("eight")) {
            code_for_next_level = getString(R.string.code_for_ninth_level);
            catgories_Text.setText("Level 8s category is:");
            page_title = "Eighth Level";

            word__To_Guess[0].append("sweater");
            categorys[0] = "Clothing";
            word__To_Guess[1].append("hoodie");
            word__To_Guess[2].append("jeans");
            word__To_Guess[3].append("suit");
            word__To_Guess[4].append("coat");
            word__To_Guess[5].append("dress shirts");
            word__To_Guess[6].append("vest");
            word__To_Guess[7].append("shoes");
        }else if (what_level.equals("nine")) {
            code_for_next_level = getString(R.string.code_for_tenth_level);
            catgories_Text.setText("Level 9's Category is:");
            page_title = "Ninth Level";

            word__To_Guess[0].append("	george washington");
            categorys[0] = "Presidents";
            word__To_Guess[1].append("john adams");
            word__To_Guess[2].append("james madison");
            word__To_Guess[3].append("abraham lincoln");
            word__To_Guess[4].append("ulysses s grant");
            word__To_Guess[5].append("john f kennedy");
            word__To_Guess[6].append("thomas jefferson");
            word__To_Guess[7].append("james madison");
        }else if (what_level.equals("ten")) {
            page_title = "Tenth Level";
            code_for_next_level = getString(R.string.code_for_eleventh_level);
            catgories_Text.setText("Level 10's Category is:");

            word__To_Guess[0].append("die hard	");
            categorys[0] = "Movie Titles";
            word__To_Guess[1].append("back to the future");
            word__To_Guess[2].append("mission impossible");
            word__To_Guess[3].append("air force one");
            word__To_Guess[4].append("avengers endgame");
            word__To_Guess[5].append("avatar");
            word__To_Guess[6].append("a new hope");
            word__To_Guess[7].append("batman begins");
        }else if (what_level.equals("eleven")) {
            page_title = "Eleventh Level";
            code_for_next_level = getString(R.string.code_for_twelfth_level);
            catgories_Text.setText("Level 11's Category is:");

            word__To_Guess[0].append("scooby doo");
            categorys[0] = "Cartoons";
            word__To_Guess[1].append("charlie brown");
            word__To_Guess[2].append("winnie the pooh");
            word__To_Guess[3].append("mickey mouse");
            word__To_Guess[4].append("donald duck");
            word__To_Guess[5].append("snoopy");
            word__To_Guess[6].append("bugs bunny");
            word__To_Guess[7].append("batman");
        }else if (what_level.equals("twelve")) {
            page_title = "Twelfth Level";
            code_for_next_level = getString(R.string.code_for_thirteenth_level);
            catgories_Text.setText("Level 12's Category is:");

            word__To_Guess[0].append("scrabble	");
            categorys[0] = "Board Games";
            word__To_Guess[1].append("chess");
            word__To_Guess[2].append("clue");
            word__To_Guess[3].append("apples to apples");
            word__To_Guess[4].append("battleship");
            word__To_Guess[5].append("yahtzee");
            word__To_Guess[6].append("checker");
            word__To_Guess[7].append("sorry");
        }else if (what_level.equals("thirteen")) {
            page_title = "	Thirteenth Level	";
            code_for_next_level = getString(R.string.code_for_fourteenth_level);
            catgories_Text.setText("Level 13's Category is:");

            word__To_Guess[0].append("ping pong");
            categorys[0] = "Sports";
            word__To_Guess[1].append("football");
            word__To_Guess[2].append("soccer");
            word__To_Guess[3].append("hockey");
            word__To_Guess[4].append("basketball");
            word__To_Guess[5].append("boxing");
            word__To_Guess[6].append("gymnastics");
            word__To_Guess[7].append("volleyball");
        }else if (what_level.equals("fourteen")) {
            page_title = "Fourteenth Level";
            code_for_next_level = getString(R.string.code_for_fifteenth_level);
            catgories_Text.setText("Level 14's Category is:");

            word__To_Guess[0].append("batman");
            categorys[0] = "Super Heroes";
            word__To_Guess[1].append("green lantern");
            word__To_Guess[2].append("super man");
            word__To_Guess[3].append("wonder women");
            word__To_Guess[4].append("aquaman");
            word__To_Guess[5].append("flash");
            word__To_Guess[6].append("green arrow");
            word__To_Guess[7].append("cyborg");
        }else if (what_level.equals("fifteen")) {
            page_title = "Fifteenth Level";
            code_for_next_level = getString(R.string.code_for_sixteenth_level);
            catgories_Text.setText("Level 	15's Category is:");

            word__To_Guess[0].append("happyness");
            categorys[0] = "Emotions";
            word__To_Guess[1].append("guilt");
            word__To_Guess[2].append("amusement");
            word__To_Guess[3].append("disappointment");
            word__To_Guess[4].append("confusion");
            word__To_Guess[5].append("sadness");
            word__To_Guess[6].append("boredom");
            word__To_Guess[7].append("surprise");
        }else if (what_level.equals("sixteen")) {
            page_title = "Sixteenth Level";
            code_for_next_level = getString(R.string.code_for_seventeenth_level);
            catgories_Text.setText("Level 	16's Category is:");

            word__To_Guess[0].append("physics");
            categorys[0] = "School Classes";
            word__To_Guess[1].append("lierature");
            word__To_Guess[2].append("geometry");
            word__To_Guess[3].append("algebra");
            word__To_Guess[4].append("chemistry");
            word__To_Guess[5].append("us history");
            word__To_Guess[6].append("spanish");
            word__To_Guess[7].append("physical education");
        }else if (what_level.equals("seventeen")) {
            page_title = "Seventeenth Level";
            code_for_next_level = getString(R.string.code_for_eighteenth_level);
            catgories_Text.setText("Level 17's Category is:");

            word__To_Guess[0].append("three ring binder");
            categorys[0] = "School Supplies";
            word__To_Guess[1].append("composition books");
            word__To_Guess[2].append("ballpoint pens");
            word__To_Guess[3].append("colored pencils");
            word__To_Guess[4].append("supply box");
            word__To_Guess[5].append("subject dividers");
            word__To_Guess[6].append("backpack");
            word__To_Guess[7].append("crayon");
        }else if (what_level.equals("eighteen")) {
            page_title = "Eighteenth Level";
            code_for_next_level = getString(R.string.code_for_nineteeth_level);
            catgories_Text.setText("Level 	18's Category is:");

            word__To_Guess[0].append("cyclone");
            categorys[0] = "weather	";
            word__To_Guess[1].append("thunderstorms");
            word__To_Guess[2].append("drought");
            word__To_Guess[3].append("heat wave");
            word__To_Guess[4].append("dust storm");
            word__To_Guess[5].append("wildfire");
            word__To_Guess[6].append("hurricane");
            word__To_Guess[7].append("earthquake");
        }else if (what_level.equals("nineteen")) {
            page_title = "Nineteenth Level";
            code_for_next_level = getString(R.string.code_for_20th_level);
            catgories_Text.setText("Level 19's Category is:");

            word__To_Guess[0].append("new york new york");
            categorys[0] = "Vacation Locations";
            word__To_Guess[1].append("london england");
            word__To_Guess[2].append("miami florida");
            word__To_Guess[3].append("las vegas nevada");
            word__To_Guess[4].append("san francisco california	");
            word__To_Guess[5].append("rome italy");
            word__To_Guess[6].append("honolulu hawaii");
            word__To_Guess[7].append("sydney australia");
        }else if (what_level.equals("20")) {
            page_title = "Twentieth Level";
            code_for_next_level = getString(R.string.code_for_21th_level);
            catgories_Text.setText("Level 20's Category is:");

            word__To_Guess[0].append("grinning face");
            categorys[0] = "emojies";
            word__To_Guess[1].append("kissing face");
            word__To_Guess[2].append("tears of Joy");
            word__To_Guess[3].append("unamused face");
            word__To_Guess[4].append("disappointed face");
            word__To_Guess[5].append("poo emoji");
            word__To_Guess[6].append("sleeping face");
            word__To_Guess[7].append("angry face");
        }else if (what_level.equals("21")) {
            page_title = "Twenty First Level";
            code_for_next_level = getString(R.string.code_for_22th_level);
            catgories_Text.setText("Level 	21's Category is:");

            word__To_Guess[0].append("pac man");
            categorys[0] = "Video Games";
            word__To_Guess[1].append("tetris");
            word__To_Guess[2].append("fortnight");
            word__To_Guess[3].append("minecraft");
            word__To_Guess[4].append("disappointed face");
            word__To_Guess[5].append("poo emoji");
            word__To_Guess[6].append("sleeping face");
            word__To_Guess[7].append("angry face");
        }else if (what_level.equals("22")) {
            page_title = "Twenty Second Level";
            code_for_next_level = getString(R.string.code_for_23th_level);
            catgories_Text.setText("Level 	22's Category is:");

            word__To_Guess[0].append("elephant");
            categorys[0] = "Animals";
            word__To_Guess[1].append("rabbit");
            word__To_Guess[2].append("grissly bear");
            word__To_Guess[3].append("hippopotamus");
            word__To_Guess[4].append("kangaroo");
            word__To_Guess[5].append("leopard");
            word__To_Guess[6].append("dolphin");
            word__To_Guess[7].append("squirrel");
        }else if (what_level.equals("23")) {
            page_title = "Twenty Third Level";
            code_for_next_level = getString(R.string.code_for_24th_level);
            catgories_Text.setText("Level 23's Category is:");

            word__To_Guess[0].append("connecticut");
            categorys[0] = "States";
            word__To_Guess[1].append("new mexico");
            word__To_Guess[2].append("new jersey");
            word__To_Guess[3].append("north carolina");
            word__To_Guess[4].append("south dakota");
            word__To_Guess[5].append("rhode island");
            word__To_Guess[6].append("oregon");
            word__To_Guess[7].append("wisconsin");
        }else if (what_level.equals("24")) {
            page_title = "Twenty Fourth Level";
            code_for_next_level = getString(R.string.code_for_25th_level);
            catgories_Text.setText("Level 24's Category is:");

            word__To_Guess[0].append("germany");
            categorys[0] = "Countries";
            word__To_Guess[1].append("greece");
            word__To_Guess[2].append("australia");
            word__To_Guess[3].append("egypt");
            word__To_Guess[4].append("brazil");
            word__To_Guess[5].append("united states");
            word__To_Guess[6].append("russia");
            word__To_Guess[7].append("canada");
        }else if (what_level.equals("25")) {
            page_title = "	Twenty Fifith Level	";
            code_for_next_level = getString(R.string.you_have_finished);
            catgories_Text.setText("Level 25's Category is:");

            word__To_Guess[0].append("curious george");
            categorys[0] = "Book Titles";
            word__To_Guess[1].append("cat in the hat");
            word__To_Guess[2].append("harry potter");
            word__To_Guess[3].append("percy jackson");
            word__To_Guess[4].append("hunger games");
            word__To_Guess[5].append("divergent");
            word__To_Guess[6].append("magic treehouse");
            word__To_Guess[7].append("charlotes web");
        }
        StringBuilder hello = word__To_Guess[l];
        String hello4 = hello.toString();
        int word_Langth_Int = hello4.length();
        String word_langth_String = Integer.toString(word_Langth_Int);
        int amount_of_letters;
        amount_of_letters = word_Langth_Int;
        boolean clicked_something_Loop = true;
        int clicked_Correct = 0;

            while (clicked_something_Loop == true) {

                if (amount_of_letters >= 1) {
                    if (user_Clicked.equals(letter_1)) {
                        blank_1 = user_Clicked;
                    } else clicked_Correct += 1;
                }
                if (amount_of_letters >= 2) {
                    if (user_Clicked.equals(letter_2)) {
                        blank_2 = user_Clicked;
                    } else clicked_Correct += 1;
                }
                if (amount_of_letters >= 3) {
                    if (user_Clicked.equals(letter_3)) {
                        blank_3 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 4) {
                    if (user_Clicked.equals(letter_4)) {
                        blank_4 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 5) {
                    if (user_Clicked.equals(letter_5)) {
                        blank_5 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 6) {
                    if (user_Clicked.equals(letter_6)) {
                        blank_6 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 7) {
                    if (user_Clicked.equals(letter_7)) {
                        blank_7 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 8) {
                    if (user_Clicked.equals(letter_8)) {
                        blank_8 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 9) {
                    if (user_Clicked.equals(letter_9)) {
                        blank_9 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 10) {
                    if (user_Clicked.equals(letter_10)) {
                        blank_10 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 11) {
                    if (user_Clicked.equals(letter_11)) {
                        blank_11 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 12) {
                    if (user_Clicked.equals(letter_12)) {
                        blank_12 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 13) {
                    if (user_Clicked.equals(letter_13)) {
                        blank_13 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 14) {
                    if (user_Clicked.equals(letter_14)) {
                        blank_14 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 15) {
                    if (user_Clicked.equals(letter_15)) {
                        blank_15 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 16) {
                    if (user_Clicked.equals(letter_16)) {
                        blank_16 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 17) {
                    if (user_Clicked.equals(letter_17)) {
                        blank_17 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 18) {
                    if (user_Clicked.equals(letter_18)) {
                        blank_18 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 19) {
                    if (user_Clicked.equals(letter_19)) {
                        blank_19 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 20) {
                    if (user_Clicked.equals(letter_20)) {
                        blank_20 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 21) {
                    if (user_Clicked.equals(letter_21)) {
                        blank_21 = user_Clicked;
                    } else clicked_Correct += 1;

                }

                if (amount_of_letters >= 23) {
                    if (user_Clicked.equals(letter_23)) {
                        blank_23 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 24) {
                    if (user_Clicked.equals(letter_24)) {
                        blank_24 = user_Clicked;
                    } else clicked_Correct += 1;
                }

                if (amount_of_letters >= 25) {
                    if (user_Clicked.equals(letter_25)) {
                        blank_25 = user_Clicked;
                    } else clicked_Correct += 1;
                }


                switch (amount_of_letters) {
                    case 1:
                        word_to_guess_Blanks = blank_1;
                        break;
                    case 2:
                        word_to_guess_Blanks = blank_1 + blank_2;
                        break;
                    case 3:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3;
                        break;
                    case 4:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4;
                        break;
                    case 5:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5;
                        break;
                    case 6:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6;
                        break;
                    case 7:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7;
                        break;
                    case 8:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8;
                        break;
                    case 9:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9;
                        break;
                    case 10:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10;
                        break;
                    case 11:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11;
                        break;
                    case 12:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12;
                        break;
                    case 13:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13;
                        break;
                    case 14:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14;
                        break;
                    case 15:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15;
                        break;
                    case 16:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16;
                        break;
                    case 17:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17;
                        break;
                    case 18:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18;
                        break;
                    case 19:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19;
                        break;
                    case 20:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20;
                        break;
                    case 21:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21;
                        break;
                    case 22:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22;
                        break;
                    case 23:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23;
                        break;
                    case 24:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23 + blank_24;
                        break;
                    case 25:
                        word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23 + blank_24 + blank_25;
                        break;

                }
                word_To_Guess.setText(word_to_guess_Blanks);


                switch (amount_of_letters) {
                    case 1:
                        if (letter_1.equals(blank_1)) {
                            next_Problom = true;
                        }
                        break;
                    case 2:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2)) {
                            next_Problom = true;
                        }
                        break;
                    case 3:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3)) {
                            next_Problom = true;
                        }
                        break;
                    case 4:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4)) {
                            next_Problom = true;
                        }
                        break;
                    case 5:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5)) {
                            next_Problom = true;
                        }
                        break;
                    case 6:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)) {
                            next_Problom = true;
                        }
                        break;
                    case 7:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7)) {
                            next_Problom = true;
                        }
                        break;
                    case 8:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8)) {
                            next_Problom = true;
                        }
                        break;
                    case 9:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9)) {
                            next_Problom = true;
                        }
                        break;
                    case 10:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10)) {
                            next_Problom = true;
                        }
                        break;
                    case 11:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11)) {
                            next_Problom = true;
                        }
                        break;
                    case 12:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)) {
                            next_Problom = true;
                        }
                        break;
                    case 13:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13)) {
                            next_Problom = true;
                        }
                        break;
                    case 14:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14)) {
                            next_Problom = true;
                        }
                        break;
                    case 15:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15)) {
                            next_Problom = true;
                        }
                        break;
                    case 16:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16)) {
                            next_Problom = true;
                        }
                        break;
                    case 17:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17)) {
                            next_Problom = true;
                        }
                        break;
                    case 18:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)) {
                            next_Problom = true;
                        }
                        break;
                    case 19:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)
                                && letter_19.equals(blank_19)) {
                            next_Problom = true;
                        }
                        break;
                    case 20:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)
                                && letter_19.equals(blank_19) && letter_20.equals(blank_20)) {
                            next_Problom = true;
                        }
                        break;
                    case 21:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)
                                && letter_19.equals(blank_19) && letter_20.equals(blank_20) && letter_21.equals(blank_21)) {
                            next_Problom = true;
                        }
                        break;
                    case 22:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)
                                && letter_19.equals(blank_19) && letter_20.equals(blank_20) && letter_21.equals(blank_21) && letter_22.equals(blank_22)) {
                            next_Problom = true;
                        }
                        break;
                    case 23:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)
                                && letter_19.equals(blank_19) && letter_20.equals(blank_20) && letter_21.equals(blank_21) && letter_22.equals(blank_22) && letter_23.equals(blank_23)) {
                            next_Problom = true;
                        }
                        break;
                    case 24:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)
                                && letter_19.equals(blank_19) && letter_20.equals(blank_20) && letter_21.equals(blank_21) && letter_22.equals(blank_22) && letter_23.equals(blank_23) && letter_24.equals(blank_24)) {
                            next_Problom = true;
                        }
                        break;
                    case 25:
                        if (letter_1.equals(blank_1) && letter_2.equals(blank_2) && letter_3.equals(blank_3) && letter_4.equals(blank_4) && letter_5.equals(blank_5) && letter_6.equals(blank_6)
                                && letter_7.equals(blank_7) && letter_8.equals(blank_8) && letter_9.equals(blank_9) && letter_10.equals(blank_10) && letter_11.equals(blank_11) && letter_12.equals(blank_12)
                                && letter_13.equals(blank_13) && letter_14.equals(blank_14) && letter_15.equals(blank_15) && letter_16.equals(blank_16) && letter_17.equals(blank_17) && letter_18.equals(blank_18)
                                && letter_19.equals(blank_19) && letter_20.equals(blank_20) && letter_21.equals(blank_21) && letter_22.equals(blank_22) && letter_23.equals(blank_23) && letter_24.equals(blank_24)
                                && letter_25.equals(blank_25)) {
                            next_Problom = true;
                        }
                        break;

                }
                am_I_done = false;




                if (amount_of_letters == clicked_Correct) {
                    lives = lives - 1;
                    if (lives == 5) {
                        hang_Thing.setImageResource(R.drawable.fivelivesleft);
                    }
                    if (lives == 4) {
                        hang_Thing.setImageResource(R.drawable.fourlivesleft);
                    }
                    if (lives == 3) {
                        hang_Thing.setImageResource(R.drawable.threelivesleft);
                    }
                    if (lives == 2) {
                        hang_Thing.setImageResource(R.drawable.twolivesleft);
                    }
                    if (lives == 1) {
                        hang_Thing.setImageResource(R.drawable.onelifeleft);
                    }

                    if (lives == 0) {
                        alertDIalog = new AlertDialog.Builder(first_level.this);

                        //Set up title
                        alertDIalog.setTitle(getResources().getString(R.string.title2));
                        //set messege
                        alertDIalog.setMessage("The word was " + word__To_Guess[l] + " Try Again");

                        //set cancelable

                        alertDIalog.setCancelable(false);
                        //user can not cancel dialog

                        //set buttons

                        //possitive
                        alertDIalog.setPositiveButton(getResources().getString(R.string.yes),
                                new DialogInterface.OnClickListener() {
                                    @Override

                                    public void onClick(DialogInterface dialog, int which) {
                                        //ecit our window activity
                                        first_level.this.finish();
                                        //code you want tor un when teh suer says yes
                                    }
                                });
                        //set negitive

                        alertDIalog.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.exit(0);
                            }
                        });

                        //create actual dialog
                        AlertDialog dialog = alertDIalog.create();

                        //show teh dialog
                        dialog.show();

                    }
                }
                clicked_Correct = 0;



                break;
            }

            if (next_Problom == true) {


                if ((check_if_done == 3)) {
                    //to see if you won
                    alertDIalog = new AlertDialog.Builder(first_level.this);

                    //Set up title
                    alertDIalog.setTitle(getResources().getString(R.string.level_Compleate));
                    //set messege


                    alertDIalog.setMessage(code_for_next_level);
                    //set cancelable

                    alertDIalog.setCancelable(false);
                    //user can not cancel dialog

                    //set buttons

                    //possitive
                    alertDIalog.setPositiveButton(getResources().getString(R.string.yes),
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //ecit our window activity

                                    Intent intent = new Intent(first_level.this, level_select.class);
                                    startActivity(intent);
                                    dialog.cancel();
                                    //code you want tor un when teh suer says yes
                                }
                            });
                    //set negitive

                    alertDIalog.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            first_level.this.finish();
                        }
                    });

                    //create actual dialog
                    AlertDialog dialog = alertDIalog.create();

                    //show teh dialog
                    a_Button.setVisibility(View.INVISIBLE);
                    b_Button.setVisibility(View.INVISIBLE);
                    c_Button.setVisibility(View.INVISIBLE);
                    d_Button.setVisibility(View.INVISIBLE);
                    e_Button.setVisibility(View.INVISIBLE);
                    f_Button.setVisibility(View.INVISIBLE);
                    g_Button.setVisibility(View.INVISIBLE);
                    h_Button.setVisibility(View.INVISIBLE);
                    i_Button.setVisibility(View.INVISIBLE);
                    j_Button.setVisibility(View.INVISIBLE);
                    k_Button.setVisibility(View.INVISIBLE);
                    l_Button.setVisibility(View.INVISIBLE);
                    m_Button.setVisibility(View.INVISIBLE);
                    n_Button.setVisibility(View.INVISIBLE);
                    o_Button.setVisibility(View.INVISIBLE);
                    p_Button.setVisibility(View.INVISIBLE);
                    q_Button.setVisibility(View.INVISIBLE);
                    r_Button.setVisibility(View.INVISIBLE);
                    s_Button.setVisibility(View.INVISIBLE);
                    t_Button.setVisibility(View.INVISIBLE);
                    u_Button.setVisibility(View.INVISIBLE);
                    v_Button.setVisibility(View.INVISIBLE);
                    w_Button.setVisibility(View.INVISIBLE);
                    x_Button.setVisibility(View.INVISIBLE);
                    y_Button.setVisibility(View.INVISIBLE);
                    z_Button.setVisibility(View.INVISIBLE);
                    hang_Thing.setVisibility(View.INVISIBLE);
                    catgories_Text.setVisibility(View.INVISIBLE);
                    random_Catagory.setVisibility(View.INVISIBLE);
                    guess_Button.setVisibility(View.INVISIBLE);
                    what_problom.setVisibility(View.INVISIBLE);
                    word_To_Guess.setVisibility(View.INVISIBLE);
                    dialog.show();

                } else {
                    //reset the problom start
                    count++;

                    hang_Thing.setImageResource(R.drawable.sixlivesleft);
//                            how_many_times_clicked = 0;
//                            lays the foundation for teh first problem
//                            a_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            b_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            c_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            d_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            e_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            f_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            g_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            h_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            i_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            j_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            k_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            l_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            m_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            n_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            o_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            p_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            q_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            r_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            s_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            t_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            u_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            v_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            w_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            x_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            y_Button.setBackgroundColor(getResources().getColor(R.color.unselected));
//                            z_Button.setBackgroundColor(getResources().getColor(R.color.unselected));


                    // Todo change all of teh 4s to a different number baaed on the number of questions

                    boolean randomizer1 = true;
                    while (randomizer1 == true) {
                        l = rand.nextInt(8);
                        // l +=1;
                        check_if_done = 0;
                        int x = 0;
                        for (x = 0; x <= 8; ) {
                            if (word_donebefore[x] == 1) {
                                check_if_done++;
                            }
                            if (x < 8) {
                                x++;
                            } else {
                                break;
                            }
                        }

                        if (word_donebefore[l] == 0) {
                            word_donebefore[l] = 1;
                            break;
                        }
                    }

                    lives = 6;
                     hello = word__To_Guess[l];
                     hello4 = hello.toString();
                     word_Langth_Int = hello4.length();
                     word_langth_String = Integer.toString(word_Langth_Int);
                    amount_of_letters = word_Langth_Int;

                    //Todo turn on this when you are editing
//                    what_problom.setText(word__To_Guess[l]);
//                    guess_Button.setText("JAck"+word_langth_String);


                    what_Problom_Int = what_Problom_Int + 1;
                    what_problom.setText("Problem " + what_Problom_Int.toString()+"/4");
                    next_Problom = false;
//
//
//                            user_clicked_1 = " ";
//                            user_clicked_2 = " ";
//                            user_clicked_3 = " ";
//                            user_clicked_4 = " ";
//                            user_clicked_5 = " ";
//                            user_clicked_6 = " ";
//                            user_clicked_7 = " ";
//                            user_clicked_8 = " ";
//                            user_clicked_9 = " ";
//                            user_clicked_10 = " ";
//                            user_clicked_11 = " ";
//                            user_clicked_12 = " ";
//                            user_clicked_13 = " ";
//                            user_clicked_14 = " ";
//                            user_clicked_15 = " ";
//                            user_clicked_16 = " ";
//                            user_clicked_17 = " ";
//                            user_clicked_18 = " ";
//                            user_clicked_19 = " ";
//                            user_clicked_20 = " ";
//                            user_clicked_21 = " ";
//                            user_clicked_22 = " ";
//                            user_clicked_23 = " ";
//                            user_clicked_24 = " ";
//                            user_clicked_25 = " ";


                    if (amount_of_letters >= 1) {
                        blank_1 = "-";
                        letter_1_Char = word__To_Guess[l].charAt(0);
                        letter_1 = letter_1_Char.toString();
                        if (letter_1.equals(" ")) {
                            blank_1 = " ";
                        }
                    }
                    if (amount_of_letters >= 2) {
                        blank_2 = "-";
                        letter_2_Char = word__To_Guess[l].charAt(1);
                        letter_2 = letter_2_Char.toString();
                        if (letter_2.equals(" ")) {
                            blank_2 = " ";
                        }
                    }
                    if (amount_of_letters >= 3) {
                        blank_3 = "-";
                        letter_3_Char = word__To_Guess[l].charAt(2);
                        letter_3 = letter_3_Char.toString();
                        if (letter_3.equals(" ")) {
                            blank_3 = " ";
                        }
                    }
                    if (amount_of_letters >= 4) {
                        blank_4 = "-";
                        letter_4_Char = word__To_Guess[l].charAt(3);
                        letter_4 = letter_4_Char.toString();
                        if (letter_4.equals(" ")) {
                            blank_4 = " ";
                        }
                    }
                    if (amount_of_letters >= 5) {
                        blank_5 = "-";
                        letter_5_Char = word__To_Guess[l].charAt(4);
                        letter_5 = letter_5_Char.toString();
                        if (letter_5.equals(" ")) {
                            blank_5 = " ";
                        }
                    }
                    if (amount_of_letters >= 6) {
                        blank_6 = "-";
                        letter_6_Char = word__To_Guess[l].charAt(5);
                        letter_6 = letter_6_Char.toString();
                        if (letter_6.equals(" ")) {
                            blank_6 = " ";
                        }
                    }
                    if (amount_of_letters >= 7) {
                        blank_7 = "-";
                        letter_7_Char = word__To_Guess[l].charAt(6);
                        letter_7 = letter_7_Char.toString();
                        if (letter_7.equals(" ")) {
                            blank_7 = " ";
                        }
                    }
                    if (amount_of_letters >= 8) {
                        blank_8 = "-";
                        letter_8_Char = word__To_Guess[l].charAt(7);
                        letter_8 = letter_8_Char.toString();
                        if (letter_8.equals(" ")) {
                            blank_8 = " ";
                        }
                    }
                    if (amount_of_letters >= 9) {
                        blank_9 = "-";
                        letter_9_Char = word__To_Guess[l].charAt(8);
                        letter_9 = letter_9_Char.toString();
                        if (letter_9.equals(" ")) {
                            blank_9 = " ";
                        }
                    }
                    if (amount_of_letters >= 10) {
                        blank_10 = "-";
                        letter_10_Char = word__To_Guess[l].charAt(9);
                        letter_10 = letter_10_Char.toString();
                        if (letter_10.equals(" ")) {
                            blank_10 = " ";
                        }
                    }
                    if (amount_of_letters >= 11) {
                        blank_11 = "-";
                        letter_11_Char = word__To_Guess[l].charAt(10);
                        letter_11 = letter_11_Char.toString();
                        if (letter_11.equals(" ")) {
                            blank_11 = " ";
                        }
                    }
                    if (amount_of_letters >= 12) {
                        blank_12 = "-";
                        letter_12_Char = word__To_Guess[l].charAt(11);
                        letter_12 = letter_12_Char.toString();
                        if (letter_12.equals(" ")) {
                            blank_12 = " ";
                        }
                    }
                    if (amount_of_letters >= 13) {
                        blank_13 = "-";
                        letter_13_Char = word__To_Guess[l].charAt(12);
                        letter_13 = letter_13_Char.toString();
                        if (letter_13.equals(" ")) {
                            blank_13 = " ";
                        }
                    }
                    if (amount_of_letters >= 14) {
                        blank_14 = "-";
                        letter_14_Char = word__To_Guess[l].charAt(13);
                        letter_14 = letter_14_Char.toString();
                        if (letter_14.equals(" ")) {
                            blank_14 = " ";
                        }
                    }
                    if (amount_of_letters >= 15) {
                        blank_15 = "-";
                        letter_15_Char = word__To_Guess[l].charAt(14);
                        letter_15 = letter_15_Char.toString();
                        if (letter_15.equals(" ")) {
                            blank_15 = " ";
                        }
                    }
                    if (amount_of_letters >= 16) {
                        blank_16 = "-";
                        letter_16_Char = word__To_Guess[l].charAt(15);
                        letter_16 = letter_16_Char.toString();
                        if (letter_16.equals(" ")) {
                            blank_16 = " ";
                        }
                    }
                    if (amount_of_letters >= 17) {
                        blank_17 = "-";
                        letter_17_Char = word__To_Guess[l].charAt(16);
                        letter_17 = letter_17_Char.toString();
                        if (letter_17.equals(" ")) {
                            blank_17 = " ";
                        }
                    }
                    if (amount_of_letters >= 18) {
                        blank_18 = "-";
                        letter_18_Char = word__To_Guess[l].charAt(17);
                        letter_18 = letter_18_Char.toString();
                        if (letter_18.equals(" ")) {
                            blank_18 = " ";
                        }
                    }
                    if (amount_of_letters >= 19) {
                        blank_19 = "-";
                        letter_19_Char = word__To_Guess[l].charAt(18);
                        letter_19 = letter_19_Char.toString();
                        if (letter_19.equals(" ")) {
                            blank_19 = " ";
                        }
                    }
                    if (amount_of_letters >= 20) {
                        blank_20 = "-";
                        letter_20_Char = word__To_Guess[l].charAt(19);
                        letter_20 = letter_20_Char.toString();
                        if (letter_20.equals(" ")) {
                            blank_20 = " ";
                        }
                    }
                    if (amount_of_letters >= 21) {
                        blank_21 = "-";
                        letter_21_Char = word__To_Guess[l].charAt(20);
                        letter_21 = letter_21_Char.toString();
                        if (letter_21.equals(" ")) {
                            blank_21 = " ";
                        }
                    }
                    if (amount_of_letters >= 22) {
                        blank_22 = "-";
                        letter_22_Char = word__To_Guess[l].charAt(21);
                        letter_22 = letter_22_Char.toString();
                        if (letter_22.equals(" ")) {
                            blank_22 = " ";
                        }
                    }
                    if (amount_of_letters >= 23) {
                        blank_24 = "-";
                        letter_23_Char = word__To_Guess[l].charAt(22);
                        letter_23 = letter_23_Char.toString();
                        if (letter_23.equals(" ")) {
                            blank_23 = " ";
                        }
                    }
                    if (amount_of_letters >= 24) {
                        blank_24 = "-";
                        letter_24_Char = word__To_Guess[l].charAt(23);
                        letter_24 = letter_24_Char.toString();
                        if (letter_24.equals(" ")) {
                            blank_24 = " ";
                        }
                    }
                    if (amount_of_letters >= 25) {
                        blank_25 = "-";
                        letter_25_Char = word__To_Guess[l].charAt(25);
                        letter_25 = letter_25_Char.toString();
                        if (letter_25.equals(" ")) {
                            blank_25 = " ";
                        }
                    }

                    switch (amount_of_letters) {
                        case 1:
                            word_to_guess_Blanks = blank_1;
                            break;
                        case 2:
                            word_to_guess_Blanks = blank_1 + blank_2;
                            break;
                        case 3:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3;
                            break;
                        case 4:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4;
                            break;
                        case 5:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5;
                            break;
                        case 6:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6;
                            break;
                        case 7:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7;
                            break;
                        case 8:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8;
                            break;
                        case 9:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9;
                            break;
                        case 10:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10;

                            break;
                        case 11:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11;
                            break;
                        case 12:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12;
                            break;
                        case 13:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13;
                            break;
                        case 14:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14;
                            break;
                        case 15:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15;
                            break;
                        case 16:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16;
                            break;
                        case 17:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17;
                            break;
                        case 18:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18;
                            break;
                        case 19:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19;
                            break;
                        case 20:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20;
                            break;
                        case 21:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21;
                            break;
                        case 22:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22;
                            break;
                        case 23:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23;
                            break;
                        case 24:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23 + blank_24;
                            break;
                        case 25:
                            word_to_guess_Blanks = blank_1 + blank_2 + blank_3 + blank_4 + blank_5 + blank_6 + blank_7 + blank_8 + blank_9 + blank_10 + blank_11 + blank_12
                                    + blank_13 + blank_14 + blank_15 + blank_16 + blank_17 + blank_18 + blank_19 + blank_20 + blank_21 + blank_22 + blank_23 + blank_24 + blank_25;
                            break;
                    }
                    word_To_Guess.setText(word_to_guess_Blanks);
                    //12

                    //Make teh button invisible to change probloms

                    //todo change to tell what word is being done when testing
                    //what_problom.setText(Integer.toString(l));
                    //what_Level.setText(Integer.toString(check_if_done)+"" +Integer.toString(word_donebefore[0])+Integer.toString(word_donebefore[1])+Integer.toString(word_donebefore[2])+Integer.toString(word_donebefore[3])+Integer.toString(word_donebefore[4])+Integer.toString(word_donebefore[5])+Integer.toString(word_donebefore[6])+Integer.toString(word_donebefore[7]));


                    //CHang size baaed on category
                    if (categorys[0].equals("Movie and Tv Characters") || categorys[0].equals("Book Characters")) {
                        random_Catagory.setTextSize(16);
                    } else random_Catagory.setTextSize(24);

                    //Set category
                    random_Catagory.setText(categorys[0]);
                    //reset the problom end
                    a_Button.setVisibility(View.VISIBLE);
                    b_Button.setVisibility(View.VISIBLE);
                    c_Button.setVisibility(View.VISIBLE);
                    d_Button.setVisibility(View.VISIBLE);
                    e_Button.setVisibility(View.VISIBLE);
                    f_Button.setVisibility(View.VISIBLE);
                    g_Button.setVisibility(View.VISIBLE);
                    h_Button.setVisibility(View.VISIBLE);
                    i_Button.setVisibility(View.VISIBLE);
                    j_Button.setVisibility(View.VISIBLE);
                    k_Button.setVisibility(View.VISIBLE);
                    l_Button.setVisibility(View.VISIBLE);
                    m_Button.setVisibility(View.VISIBLE);
                    n_Button.setVisibility(View.VISIBLE);
                    o_Button.setVisibility(View.VISIBLE);
                    p_Button.setVisibility(View.VISIBLE);
                    q_Button.setVisibility(View.VISIBLE);
                    r_Button.setVisibility(View.VISIBLE);
                    s_Button.setVisibility(View.VISIBLE);
                    t_Button.setVisibility(View.VISIBLE);
                    u_Button.setVisibility(View.VISIBLE);
                    v_Button.setVisibility(View.VISIBLE);
                    w_Button.setVisibility(View.VISIBLE);
                    x_Button.setVisibility(View.VISIBLE);
                    y_Button.setVisibility(View.VISIBLE);
                    z_Button.setVisibility(View.VISIBLE);
                }


            }

//                    a_selected = false;
//                    b_selected = false;
//                    c_selected = false;
//                    d_selected = false;
//                    e_selected = false;
//                    f_selected = false;
//                    g_selected = false;
//                    h_selected = false;
//                    i_selected = false;
//                    j_selected = false;
//                    k_selected = false;
//                    l_selected = false;
//                    m_selected = false;
//                    n_selected = false;
//                    o_selected = false;
//                    p_selected = false;
//                    q_selected = false;
//                    r_selected = false;
//                    s_selected = false;
//                    t_selected = false;
//                    u_selected = false;
//                    v_selected = false;
//                    w_selected = false;
//                    x_selected = false;
//                    y_selected = false;
//                    z_selected = false;
//                    somthing_CLicked_Boolean = false;
//                    another_selected = false;
//                    user_Clicked = "";


        return l;
    }
}


