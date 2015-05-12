package solution.technopoda.project.com.banyumascitytour;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ExpandPendidikan extends Activity {
    HashMap<String, List<String>> pendidikanHashMap;
    List<String> pendidikanHashMapKeys;
    ExpandableListView expandableListView;
    MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_pendidikan);

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
                Toast.makeText(ExpandPendidikan.this, "Selected " + pendidikanHashMap.get(pendidikanHashMapKeys.get(groupPosition)).get(childPosition)
                        + " from " + pendidikanHashMapKeys.get(groupPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });



    }
}
