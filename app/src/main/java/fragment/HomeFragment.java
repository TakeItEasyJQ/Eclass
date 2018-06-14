package fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kaj.myapplication.R;

import org.xmlpull.v1.XmlPullParser;

/**
 * Created by kaj on 2018/6/11.
 */

public class HomeFragment extends Fragment implements View.OnClickListener{

    protected View mView;
    private TextView news;
    private TextView message;
    private ImageView image_view;
    private TextView details;
    private ListView list_item;
    private ListView list_item_two;
    private ListView list_item_three;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content_f1,container,false);
        news =  mView.findViewById(R.id.news);
        message = mView.findViewById(R.id.message);
        image_view = mView.findViewById(R.id.image_view);
        details = mView.findViewById(R.id.details);
        list_item = mView.findViewById(R.id.list_item);
        list_item_two = mView.findViewById(R.id.list_item_two);
        list_item_three = mView.findViewById(R.id.list_item_three);

    return mView;

    }

    @Override
    public void onClick(View v) {

    }
}
