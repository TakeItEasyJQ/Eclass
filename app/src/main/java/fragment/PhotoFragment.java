package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kaj.myapplication.R;

/**
 * Created by kaj on 2018/6/12.
 */

public class PhotoFragment extends Fragment implements View.OnClickListener{

    protected View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content_f2_2, container, false);
        return mView;
    }

    @Override
    public void onClick(View v) {

    }
}
