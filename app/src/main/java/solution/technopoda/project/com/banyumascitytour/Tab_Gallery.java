package solution.technopoda.project.com.banyumascitytour;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Dedi Yofaid on 06/05/2015.
 */
public class Tab_Gallery extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("Ini adalah tab Gallery");
        setContentView(textview);
    }
}
