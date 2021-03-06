package solution.technopoda.project.com.banyumascitytour;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Dedi Yofaid on 11/05/2015.
 */
public class MyCustomAdapter extends BaseExpandableListAdapter {
    private Context context;
    private HashMap<String, List<String>> technopodaHashMap;
    private List<String> ExpandList;

    public MyCustomAdapter(Context context,
                           HashMap<String, List<String>> hashMap,
                           List<String> list) {
        technopodaHashMap = hashMap;
        this.context = context;
        this.technopodaHashMap = hashMap;
        this.ExpandList = list;
    }

    @Override
    public int getGroupCount() {
        return technopodaHashMap.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return technopodaHashMap.get(ExpandList.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return ExpandList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return technopodaHashMap.get(ExpandList.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String groupTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_layout, parent, false);
        }
        TextView parentTextView = (TextView) convertView.findViewById(R.id.textViewParent);
        parentTextView.setText(groupTitle);
        return convertView;
    }

   @Override
    public View getChildView(int groupPosition,
                             int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        Log.i("test", "parent view: " + parent.getTag());

        String childTitle = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_layout, parent, false);
        }
        TextView childTextView = (TextView) convertView.findViewById(R.id.textViewChild);
        childTextView.setText(childTitle);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
