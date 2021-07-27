package rp.edu.sg.c346.id20021576.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> versions;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        versions = new ArrayList<AndroidVersion>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow", "6.0 - 6.0.1");
        AndroidVersion item5 = new AndroidVersion("Lollipop", "5.0 - 5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat", "4.4 - 4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean", "4.1 - 4.3.1");

        versions.add(item1);
        versions.add(item2);
        versions.add(item3);
        versions.add(item4);
        versions.add(item5);
        versions.add(item6);
        versions.add(item7);

        adapter = new CustomAdapter(this, R.layout.row, versions);
        lv.setAdapter(adapter);

//        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, versions);
//        lv.setAdapter(aa);

    }
}