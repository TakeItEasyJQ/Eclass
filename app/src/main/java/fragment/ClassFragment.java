package fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kaj.myapplication.R;

/**
 * Created by kaj on 2018/6/11.
 */

public class ClassFragment extends android.app.Fragment implements View.OnClickListener{

    protected View mView;
    private RelativeLayout left_icons1;
    private RelativeLayout left_icons2;
    private RelativeLayout left_icons3;
    private RelativeLayout left_icons4;
    private RelativeLayout moral_education;

    private FragmentManager fragmentManager;
    private DescriptionFragment descriptionFragment;
    private PhotoFragment photoFragment;
    private HonorFragment honorFragment;
    private ContentItemFragment contentItemFragment;
    private EducationFragment educationFragment;
    private TextView tv_f2_title;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content_f2,container,false);
        initView();
        return mView;

    }


    private void initView() {

        left_icons1 = mView.findViewById(R.id.left_icons1);
        left_icons2 = mView.findViewById(R.id.left_icons2);
        left_icons3 = mView.findViewById(R.id.left_icons3);
        left_icons4 = mView.findViewById(R.id.left_icons4);
        moral_education = mView.findViewById(R.id.moral_education);
        tv_f2_title = mView.findViewById(R.id.tv_f2_title);

        left_icons1.setOnClickListener(this);
        left_icons2.setOnClickListener(this);
        left_icons3.setOnClickListener(this);
        left_icons4.setOnClickListener(this);
        moral_education.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager fm=getChildFragmentManager();
        FragmentTransaction transaction=fm.beginTransaction();
        switch (v.getId()){

            case R.id.left_icons1:
                descriptionFragment = new DescriptionFragment();
                transaction.replace(R.id.main_framelayout_1,descriptionFragment);
                transaction.commit();
                tv_f2_title.setText("班级简介");
                break;

            case R.id.left_icons2:
                photoFragment = new PhotoFragment();
                transaction.replace(R.id.main_framelayout_1,photoFragment);
                transaction.commit();
                tv_f2_title.setText("班级相册");
                break;

            case R.id.left_icons3:
                honorFragment = new HonorFragment();
                transaction.replace(R.id.main_framelayout_1,honorFragment);
                transaction.commit();
                tv_f2_title.setText("班级荣誉");
                break;

            case R.id.left_icons4:
                contentItemFragment = new ContentItemFragment();
                transaction.replace(R.id.main_framelayout_1,contentItemFragment);
                transaction.commit();
                tv_f2_title.setText("科任老师");
                break;

            case R.id.moral_education:
                educationFragment = new EducationFragment();
                transaction.replace(R.id.main_framelayout_1,educationFragment);
                transaction.commit();
                tv_f2_title.setText("今日德育");
                break;


        }

    }
}
