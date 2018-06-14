package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kaj.myapplication.R;

/**
 * Created by kaj on 2018/6/11.
 */

public class HomeworkFragment extends android.app.Fragment implements View.OnClickListener{

    protected View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content_f6,container,false);
        return mView;

    }

    @Override
    public void onClick(View v) {

    }
}
