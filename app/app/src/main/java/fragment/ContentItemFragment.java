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

public class ContentItemFragment extends Fragment implements View.OnClickListener{

    private ContentItemAdapter contentItemAdapter;
    protected View mView;
    RecyclerView recyclerView;
    ContentItemAdapter adapter;
    LinearLayoutManager manager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        mView = inflater.inflate(R.layout.content_f2_list,container,false);


        recyclerView=(RecyclerView)mView.findViewById(R.id.recyclerView);
        adapter=new ContentItemAdapter();
        manager=new LinearLayoutManager(mView.getContext());
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        return mView;

    }

    @Override
    public void onClick(View v) {



    }
}
