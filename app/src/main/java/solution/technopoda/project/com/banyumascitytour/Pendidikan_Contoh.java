package solution.technopoda.project.com.banyumascitytour;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Pendidikan_Contoh extends ActionBarActivity {
    HashMap<String, List<String>> pendidikanHashMap;
    List<String> pendidikanHashMapKeys;
    ExpandableListView expandableListView;
    MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendidikan__contoh);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }



        expandableListView = (ExpandableListView) findViewById(R.id.expandableList);
        pendidikanHashMap = MyDataProvider.getDataHashMap();
        pendidikanHashMapKeys = new ArrayList<String>(pendidikanHashMap.keySet());

        adapter = new MyCustomAdapter(this, pendidikanHashMap, pendidikanHashMapKeys);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(Pendidikan_Contoh.this,
                        pendidikanHashMapKeys.get(groupPosition)
                                + " expanded", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(Pendidikan_Contoh.this, pendidikanHashMapKeys.get(groupPosition) + " collapsed", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View clickedView, int groupPosition, int childPosition, long id) {
                Toast.makeText(Pendidikan_Contoh.this, "Selected " + pendidikanHashMap.get(pendidikanHashMapKeys.get(groupPosition)).get(childPosition)
                        + " from " + pendidikanHashMapKeys.get(groupPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pendidikan__contoh, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_pendidikan__contoh, container, false);
            return rootView;
        }
    }
}
