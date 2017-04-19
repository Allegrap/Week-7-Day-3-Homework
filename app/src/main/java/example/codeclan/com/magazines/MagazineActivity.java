package example.codeclan.com.magazines;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MagazineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magazines_list);

        TopMagazines topMagazines = new TopMagazines();
        ArrayList<Magazine> list = topMagazines.getList();

        TopMagazinesAdapter magazinesAdapter = new TopMagazinesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(magazinesAdapter);
    }
}
