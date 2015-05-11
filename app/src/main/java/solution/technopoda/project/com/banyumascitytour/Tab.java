package solution.technopoda.project.com.banyumascitytour;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class Tab extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        Resources res = getResources();

        intent = new Intent().setClass(this, Home.class);
        spec = tabhost.newTabSpec("Home").setIndicator("Home", null).setContent(intent);
        tabhost.addTab(spec);

        intent = new Intent().setClass(this, Gallery.class);
        spec = tabhost.newTabSpec("Gallery").setIndicator("Gallery", null).setContent(intent);
        tabhost.addTab(spec);

        intent = new Intent().setClass(this, Info.class);
        spec = tabhost.newTabSpec("Info").setIndicator("Info", null).setContent(intent);
        tabhost.addTab(spec);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tab, menu);
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
}
