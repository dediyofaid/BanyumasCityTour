package solution.technopoda.project.com.banyumascitytour;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by HabibDea on 29/04/2015.
 */
public class Kuliner extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.kuliner,container,false);
        Button kuliner = (Button)rootview.findViewById(R.id.btnKuliner);
        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ExpandKuliner.class);
                startActivity(i);
            }
        });
        return rootview;
    }
}
