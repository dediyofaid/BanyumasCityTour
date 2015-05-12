package solution.technopoda.project.com.banyumascitytour;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.Timer;
import java.util.TimerTask;


public class Gallery extends ActionBarActivity {
    private ImageSwitcher imageSwitcher;
    private int[] gallery = {R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3, R.drawable.gambar4};
    private int position = 0;
    private Timer timer = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(Gallery.this);
            }
        });
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.slide_in);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.slide_out);
        imageSwitcher.setInAnimation(fadeIn);
        imageSwitcher.setOutAnimation(fadeOut);
    }
    public void start(View button)
    {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // avoid exception: "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {
                        imageSwitcher.setImageResource(gallery[position]);
                        position++;
                        if (position == 4)
                        {
                            position = 0;
                        }
                    }
                });
            }

        }, 0, 2500);

    }
    public void stop(View button)
    {
        timer.cancel();
    }
}
