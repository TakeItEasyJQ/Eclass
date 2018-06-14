package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kaj.myapplication.R;

import adapter.ContentItemAdapter;

/**
 * Created by kaj on 2018/6/14.
 */

public class EducationFragment extends Fragment implements View.OnClickListener{

    protected View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        mView = inflater.inflate(R.layout.content_f2_5,container,false);


       return mView;

    }

    @Override
    public void onClick(View v) {

    }
}
