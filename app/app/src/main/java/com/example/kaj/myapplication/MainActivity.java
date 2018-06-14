package com.example.kaj.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fragment.ActivityFragment;
import fragment.AttendanceFragment;
import fragment.ClassFragment;
import fragment.CurriculumFragment;
import fragment.HomeFragment;
import fragment.HomeworkFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private FragmentManager fragmentManager;
    private HomeFragment homeFragment;//首页
    private ClassFragment classFragment;//班级
    private CurriculumFragment curriculumFragment;//课程表
    private AttendanceFragment attendanceFragment;//考勤
    private ActivityFragment activityFragment;//活动
    private HomeworkFragment homeworkFragment;//作业

    private ImageView nav_01;
    private ImageView nav_02;
    private ImageView nav_03;
    private ImageView nav_04;
    private ImageView nav_05;
    private ImageView nav_06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        nav_01 = findViewById(R.id.nav_01);
        nav_02 = findViewById(R.id.nav_02);
        nav_03 = findViewById(R.id.nav_03);
        nav_04 = findViewById(R.id.nav_04);
        nav_05 = findViewById(R.id.nav_05);
        nav_06 = findViewById(R.id.nav_06);

        nav_01.setOnClickListener(this);
        nav_02.setOnClickListener(this);
        nav_03.setOnClickListener(this);
        nav_04.setOnClickListener(this);
        nav_05.setOnClickListener(this);
        nav_06.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (v.getId()){
            case R.id.nav_01:
                homeFragment = new HomeFragment();
                transaction.replace(R.id.main_framelayout, homeFragment);
                transaction.commit();
                break;

            case R.id.nav_02:
               classFragment = new ClassFragment();
               transaction.replace(R.id.main_framelayout,classFragment);
               transaction.commit();
                break;

            case R.id.nav_03:
                curriculumFragment = new CurriculumFragment();
                transaction.replace(R.id.main_framelayout,curriculumFragment);
                transaction.commit();
                break;

            case R.id.nav_04:
                attendanceFragment = new AttendanceFragment();
                transaction.replace(R.id.main_framelayout,attendanceFragment);
                transaction.commit();
                break;

            case R.id.nav_05:
                activityFragment = new ActivityFragment();
                transaction.replace(R.id.main_framelayout,activityFragment);
                transaction.commit();
                break;

            case R.id.nav_06:
                homeworkFragment = new HomeworkFragment();
                transaction.replace(R.id.main_framelayout,homeworkFragment);
                transaction.commit();
                break;

        }
    }
}
