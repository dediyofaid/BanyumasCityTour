package solution.technopoda.project.com.banyumascitytour;

<<<<<<< HEAD
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
=======
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
>>>>>>> UPdate bejaddd, mantafff
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.ExpandableListAdapter;
=======
>>>>>>> UPdate bejaddd, mantafff
import android.widget.ExpandableListView;
import android.widget.TextView;


/**
 * Created by HabibDea on 29/04/2015.
 */
public class Pendidikan extends Fragment {
<<<<<<< HEAD
=======

>>>>>>> UPdate bejaddd, mantafff
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.pendidikan,container,false);
<<<<<<< HEAD
        Button pendidikan = (Button)rootview.findViewById(R.id.btnPendidikan);
        pendidikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ExpandPendidikan.class);
                startActivity(i);
            }
        });
=======

>>>>>>> UPdate bejaddd, mantafff
        return rootview;
    }
}


