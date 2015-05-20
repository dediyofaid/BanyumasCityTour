package solution.technopoda.project.com.banyumascitytour;

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


public class ExpandKuliner extends Activity {
    HashMap<String, List<String>> kulinerHashMap;
    List<String> kulinerHashMapKeys;
    ExpandableListView expandableListView;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_kuliner);
        overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_fade_out);
        ImageButton btnbackkuli = (ImageButton)findViewById(R.id.btnbacpk);
        btnbackkuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(ExpandKuliner.this, Menunavutama.class);
                startActivity(start);
                finish();
                overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_fade_out);
            }
        });
        expandableListView = (ExpandableListView) findViewById(R.id.expandableList);
        kulinerHashMap = MyDataProvider.kulinerDataHashMap();
        kulinerHashMapKeys = new ArrayList<String>(kulinerHashMap.keySet());

        adapter = new MyCustomAdapter(this, kulinerHashMap, kulinerHashMapKeys);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(ExpandKuliner.this,
                        kulinerHashMapKeys.get(groupPosition)
                                + " expanded", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(ExpandKuliner.this, kulinerHashMapKeys.get(groupPosition) + " collapsed", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View clickedView, int groupPosition, int childPosition, long id) {
                Toast.makeText(ExpandKuliner.this, "Selected " + kulinerHashMap.get(kulinerHashMapKeys.get(groupPosition)).get(childPosition)
                        + " from " + kulinerHashMapKeys.get(groupPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
}
