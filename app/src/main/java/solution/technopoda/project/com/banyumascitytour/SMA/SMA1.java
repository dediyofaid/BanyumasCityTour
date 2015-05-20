package solution.technopoda.project.com.banyumascitytour.SMA;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import solution.technopoda.project.com.banyumascitytour.R;

/**
 * Created by HabibDea on 19/05/2015.
 */
public class SMA1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.sma_1_purwokerto);
    }
}
