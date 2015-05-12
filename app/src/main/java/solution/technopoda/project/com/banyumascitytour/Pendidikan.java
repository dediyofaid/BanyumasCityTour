package solution.technopoda.project.com.banyumascitytour;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.ExpandableListActivity;
import android.view.Gravity;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HabibDea on 29/04/2015.
 */
public class Pendidikan extends Activity {

    HashMap<String, List<String>> pendidikanHashMap;
    List<String> pendidikanHashMapKeys;
    ExpandableListView expandableListView;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendidikan);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableList);
        pendidikanHashMap = MyDataProvider.getDataHashMap();
        pendidikanHashMapKeys = new ArrayList<String>(pendidikanHashMap.keySet());

        adapter = new MyCustomAdapter(this, pendidikanHashMap, pendidikanHashMapKeys);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(Pendidikan.this,
                        pendidikanHashMapKeys.get(groupPosition)
                                + " expanded", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(Pendidikan.this, pendidikanHashMapKeys.get(groupPosition) + " collapsed", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View clickedView, int groupPosition, int childPosition, long id) {
                Toast.makeText(Pendidikan.this, "Selected " + pendidikanHashMap.get(pendidikanHashMapKeys.get(groupPosition)).get(childPosition)
                        + " from " + pendidikanHashMapKeys.get(groupPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }


}
