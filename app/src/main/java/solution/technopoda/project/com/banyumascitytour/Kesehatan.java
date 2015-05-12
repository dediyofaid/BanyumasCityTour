package solution.technopoda.project.com.banyumascitytour;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by HabibDea on 29/04/2015.
 */
public class Kesehatan extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.kesehatan,container,false);
        ImageButton kesehatan = (ImageButton)rootview.findViewById(R.id.btnKesehatan);
        kesehatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ExpandKesehatan.class);
                startActivity(i);
            }
        });
        return rootview;
    }
}
