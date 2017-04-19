package example.codeclan.com.magazines;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopMagazinesAdapter extends ArrayAdapter<Magazine> {

        public topMagazinesAdapter(Context context, ArrayList<Magazine> magazines){
            super(context, 0, magazines);
        }

        @Override
        public View getView(int position, View listItemView, ViewGroup parent){

            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.magazines_item, parent, false);
            }

            Magazine currentMagazine = getItem(position);
        }
}
