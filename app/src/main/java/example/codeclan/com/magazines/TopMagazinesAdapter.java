package example.codeclan.com.magazines;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopMagazinesAdapter extends ArrayAdapter<Magazine> {

        public TopMagazinesAdapter(Context context, ArrayList<Magazine> magazines){
            super(context, 0, magazines);
        }

        @Override
        public View getView(int position, View listItemView, ViewGroup parent){

            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.magazines_item, parent, false);
            }

            Magazine currentMagazine = getItem(position);

            TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
            ranking.setText(currentMagazine.getRanking().toString());

            TextView name = (TextView) listItemView.findViewById(R.id.name);
            name.setText(currentMagazine.getName());

            TextView year = (TextView) listItemView.findViewById(R.id.year);
            year.setText(currentMagazine.getYear().toString());

            listItemView.setTag(currentMagazine);

            return listItemView;
        }
}

