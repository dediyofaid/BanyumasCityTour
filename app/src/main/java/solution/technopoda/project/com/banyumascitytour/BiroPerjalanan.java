package solution.technopoda.project.com.banyumascitytour;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class BiroPerjalanan extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_biro_perjalanan, container, false);
        ImageButton perjalanan = (ImageButton)rootview.findViewById(R.id.btnPerjalanan);
        perjalanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ExpandBiroPerjalanan.class);
                startActivity(i);
            }
        });
        return rootview;
    }
}
