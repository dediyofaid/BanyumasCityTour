package solution.technopoda.project.com.banyumascitytour;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class Info extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, What.class);
        spec = tabhost.newTabSpec("What").setIndicator("What", null).setContent(intent);
        tabhost.addTab(spec);

        intent = new Intent().setClass(this, How.class);
        spec = tabhost.newTabSpec("How").setIndicator("How", null).setContent(intent);
        tabhost.addTab(spec);

        intent = new Intent().setClass(this, Why.class);
        spec = tabhost.newTabSpec("Why").setIndicator("Why", null).setContent(intent);
        tabhost.addTab(spec);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
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
