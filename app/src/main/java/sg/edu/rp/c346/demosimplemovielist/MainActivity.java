package sg.edu.rp.c346.demosimplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<String> movieList;
    ArrayAdapter<String> aaMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView
        lvMovie = findViewById(R.id.listViewMovie);

        //arrayList
        movieList = new ArrayList<>();
        movieList.add("Avengers Infinity War Release Date: 2018.04");
        movieList.add("Justice League Date: 2017.11");

        //arrayAdapter
        aaMovie = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,movieList);
        lvMovie.setAdapter(aaMovie);

    }
}
