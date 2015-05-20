package solution.technopoda.project.com.banyumascitytour;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import solution.technopoda.project.com.banyumascitytour.SMA.SMA1;
import solution.technopoda.project.com.banyumascitytour.SMA.SMA2;


public class ExpandPendidikan extends Activity {
    HashMap<String, List<String>> pendidikanHashMap;
    List<String> pendidikanHashMapKeys;
    ExpandableListView expandableListView;
    MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_pendidikan);
        ImageButton btnbackp = (ImageButton)findViewById(R.id.btnbackp);
        btnbackp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(ExpandPendidikan.this, Menunavutama.class);
                startActivity(start);
                finish();
                overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_fade_out);
            }
        });
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableList);
        pendidikanHashMap = MyDataProvider.getDataHashMap();
        pendidikanHashMapKeys = new ArrayList<String>(pendidikanHashMap.keySet());

        adapter = new MyCustomAdapter(this, pendidikanHashMap, pendidikanHashMapKeys);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(ExpandPendidikan.this,
                        pendidikanHashMapKeys.get(groupPosition)
                                + " expanded", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(ExpandPendidikan.this, pendidikanHashMapKeys.get(groupPosition) + " collapsed", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View clickedView, int groupPosition, int childPosition, long id) {
                if(groupPosition==0) {
                    if(childPosition==0) {
                        Intent intent0 = new Intent(getApplicationContext(), SMA1.class);
                        startActivity(intent0);}
                        else if(childPosition==1) {
                            Intent intent1 = new Intent(getApplicationContext(), SMA2.class);
                            startActivity(intent1);
                        }
                            else
                        {
                                Intent intent1 = new Intent(getApplicationContext(), BiroPerjalanan.class);
                                startActivity(intent1);}
                    }


                return false;
            }
        });



    }
}
