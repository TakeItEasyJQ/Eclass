package fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kaj.myapplication.R;

/**
 * Created by kaj on 2018/6/12.
 */

public class CurriculumFragment extends android.app.Fragment implements View.OnClickListener{

    protected View mView;
    private TextView line1_1;
    private TextView line1_2;
    private TextView line1_3;
    private TextView line1_4;
    private TextView line1_5;
    private TextView line1_6;

    private TextView line2_1;
    private TextView line2_2;
    private TextView line2_3;
    private TextView line2_4;
    private TextView line2_5;
    private TextView line2_6;

    private TextView line3_1;
    private TextView line3_2;
    private TextView line3_3;
    private TextView line3_4;
    private TextView line3_5;
    private TextView line3_6;

    private TextView line4_1;
    private TextView line4_2;
    private TextView line4_3;
    private TextView line4_4;
    private TextView line4_5;
    private TextView line4_6;

    private TextView line5_1;
    private TextView line5_2;
    private TextView line5_3;
    private TextView line5_4;
    private TextView line5_5;

    private TextView line6_1;
    private TextView line6_2;
    private TextView line6_3;
    private TextView line6_4;
    private TextView line6_5;

    private TextView line7_1;
    private TextView line7_2;
    private TextView line7_3;
    private TextView line7_4;
    private TextView line7_5;

    private TextView name;
    private TextView time;
    private TextView course;
    private ImageView img_teacher_f4;

    public int re[] = new int[1];

    public void changeColor(int id){
        if (id!=0){

           TextView textView = (TextView)mView.findViewById(id);
           textView.setTextColor(Color.WHITE);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content_f3,container,false);
        line1_1 = mView.findViewById(R.id.line1_1);
        line1_2 = mView.findViewById(R.id.line1_2);
        line1_3 = mView.findViewById(R.id.line1_3);
        line1_4 = mView.findViewById(R.id.line1_4);
        line1_5 = mView.findViewById(R.id.line1_5);
        line1_6 = mView.findViewById(R.id.line1_6);

        line2_1 = mView.findViewById(R.id.line2_1);
        line2_2 = mView.findViewById(R.id.line2_2);
        line2_3 = mView.findViewById(R.id.line2_3);
        line2_4 = mView.findViewById(R.id.line2_4);
        line2_5 = mView.findViewById(R.id.line2_5);
        line2_6 = mView.findViewById(R.id.line2_6);

        line3_1 = mView.findViewById(R.id.line3_1);
        line3_2 = mView.findViewById(R.id.line3_2);
        line3_3 = mView.findViewById(R.id.line3_3);
        line3_4 = mView.findViewById(R.id.line3_4);
        line3_5 = mView.findViewById(R.id.line3_5);
        line3_6 = mView.findViewById(R.id.line3_6);

        line4_1 = mView.findViewById(R.id.line4_1);
        line4_2 = mView.findViewById(R.id.line4_2);
        line4_3 = mView.findViewById(R.id.line4_3);
        line4_4 = mView.findViewById(R.id.line4_4);
        line4_5 = mView.findViewById(R.id.line4_5);
        line4_6 = mView.findViewById(R.id.line4_6);

        line5_1 = mView.findViewById(R.id.line5_1);
        line5_2 = mView.findViewById(R.id.line5_2);
        line5_3 = mView.findViewById(R.id.line5_3);
        line5_4 = mView.findViewById(R.id.line5_4);
        line5_5 = mView.findViewById(R.id.line5_5);

        line6_1 = mView.findViewById(R.id.line6_1);
        line6_2 = mView.findViewById(R.id.line6_2);
        line6_3 = mView.findViewById(R.id.line6_3);
        line6_4 = mView.findViewById(R.id.line6_4);
        line6_5 = mView.findViewById(R.id.line6_5);

        line7_1 = mView.findViewById(R.id.line7_1);
        line7_2 = mView.findViewById(R.id.line7_2);
        line7_3 = mView.findViewById(R.id.line7_3);
        line7_4 = mView.findViewById(R.id.line7_4);
        line7_5 = mView.findViewById(R.id.line7_5);

        name = mView.findViewById(R.id.name);//姓名
        time = mView.findViewById(R.id.time);//时间
        course = mView.findViewById(R.id.course);//课程
        img_teacher_f4 = mView.findViewById(R.id.img_teacher_f4);//照片

        line1_1.setOnClickListener(this);
        line1_2.setOnClickListener(this);
        line1_3.setOnClickListener(this);
        line1_4.setOnClickListener(this);
        line1_5.setOnClickListener(this);
        line1_6.setOnClickListener(this);

        line2_1.setOnClickListener(this);
        line2_2.setOnClickListener(this);
        line2_3.setOnClickListener(this);
        line2_4.setOnClickListener(this);
        line2_5.setOnClickListener(this);
        line2_6.setOnClickListener(this);

        line3_1.setOnClickListener(this);
        line3_2.setOnClickListener(this);
        line3_3.setOnClickListener(this);
        line3_4.setOnClickListener(this);
        line3_5.setOnClickListener(this);
        line3_6.setOnClickListener(this);

        line4_1.setOnClickListener(this);
        line4_2.setOnClickListener(this);
        line4_3.setOnClickListener(this);
        line4_4.setOnClickListener(this);
        line4_5.setOnClickListener(this);
        line4_6.setOnClickListener(this);

        line5_1.setOnClickListener(this);
        line5_2.setOnClickListener(this);
        line5_3.setOnClickListener(this);
        line5_4.setOnClickListener(this);
        line5_5.setOnClickListener(this);

        line6_1.setOnClickListener(this);
        line6_2.setOnClickListener(this);
        line6_3.setOnClickListener(this);
        line6_4.setOnClickListener(this);
        line6_5.setOnClickListener(this);

        line7_1.setOnClickListener(this);
        line7_2.setOnClickListener(this);
        line7_3.setOnClickListener(this);
        line7_4.setOnClickListener(this);
        line7_5.setOnClickListener(this);

        return mView;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.line1_1:
                changeColor(re[0]);
                re[0] = R.id.line1_1;
                TextView textView=(TextView)mView.findViewById(R.id.line1_1);
                textView.setTextColor(Color.RED);
                name.setText("巴根那老师");
                time.setText("15134857805");
                course.setText("07:40-08:20");
                break;

            case R.id.line1_2:
                changeColor(re[0]);
                re[0] = R.id.line1_2;
                textView = (TextView) mView.findViewById(R.id.line1_2);
                textView.setTextColor(Color.RED);
                name.setText("乌雅恒老师");
                time.setText("14747171175");
                course.setText("07:40-08:20");
                break;

            case R.id.line1_3:
                changeColor(re[0]);
                re[0] = R.id.line1_3;
                textView = (TextView) mView.findViewById(R.id.line1_3);
                textView.setTextColor(Color.RED);
                name.setText("杭盖老师");
                time.setText("18847771711");
                course.setText("07:40-08:20");
                break;

            case R.id.line1_4:
                changeColor(re[0]);
                re[0] = R.id.line1_4;
                textView = (TextView) mView.findViewById(R.id.line1_4);
                textView.setTextColor(Color.RED);
                name.setText("曹晶晶老师");
                time.setText("15947376373");
                course.setText("07:40-08:20");
                break;

            case R.id.line1_5:
                changeColor(re[0]);
                re[0] = R.id.line1_5;
                textView = (TextView) mView.findViewById(R.id.line1_5);
                textView.setTextColor(Color.RED);
                name.setText("乌兰托亚老师");
                time.setText("13087180898");
                course.setText("07:40-08:20");
                break;

            case R.id.line1_6:
                changeColor(re[0]);
                re[0] = R.id.line1_6;
                textView = (TextView) mView.findViewById(R.id.line1_6);
                textView.setTextColor(Color.RED);
                name.setText("乌雅恒老师");
                time.setText("14747171175");
                course.setText("07:40-08:20");
                break;

            case R.id.line2_1:
                changeColor(re[0]);
                re[0] = R.id.line2_1;
                textView = (TextView) mView.findViewById(R.id.line2_1);
                textView.setTextColor(Color.RED);
                name.setText("萨日娜（英语）老师");
                time.setText("13614778904");
                course.setText("08:30-09:10");
                break;

            case R.id.line2_2:
                changeColor(re[0]);
                re[0] = R.id.line2_2;
                textView = (TextView) mView.findViewById(R.id.line2_2);
                textView.setTextColor(Color.RED);
                name.setText("巴根那老师");
                time.setText("15134857805");
                course.setText("08:30-09:10");
                break;

            case R.id.line2_3:
                changeColor(re[0]);
                re[0] = R.id.line2_3;
                textView = (TextView) mView.findViewById(R.id.line2_3);
                textView.setTextColor(Color.RED);
                name.setText("乌雅恒老师");
                time.setText("14747171175");
                course.setText("08:30-09:10");
                break;

            case R.id.line2_4:
                changeColor(re[0]);
                re[0] = R.id.line2_4;
                textView = (TextView) mView.findViewById(R.id.line2_4);
                textView.setTextColor(Color.RED);
                name.setText("嘎如迪老师");
                time.setText("15047349383");
                course.setText("08:30-09:10");
                break;

            case R.id.line2_5:
                changeColor(re[0]);
                re[0] = R.id.line2_5;
                textView = (TextView) mView.findViewById(R.id.line2_5);
                textView.setTextColor(Color.RED);
                name.setText("乌雅恒老师");
                time.setText("14747171175");
                course.setText("08:30-09:10");
                break;

            case R.id.line2_6:
                changeColor(re[0]);
                re[0] = R.id.line2_6;
                textView = (TextView) mView.findViewById(R.id.line2_6);
                textView.setTextColor(Color.RED);
                name.setText("乌兰托亚老师");
                time.setText("13087180898");
                course.setText("08:30-09:10");
                break;

            case R.id.line3_1:
                changeColor(re[0]);
                re[0] = R.id.line3_1;
                textView = (TextView) mView.findViewById(R.id.line3_1);
                textView.setTextColor(Color.RED);
                name.setText("乌雅恒老师");
                time.setText("14747171175");
                course.setText("10:25-11:05");
                break;

            case R.id.line3_2:
                changeColor(re[0]);
                re[0] = R.id.line3_2;
                textView = (TextView) mView.findViewById(R.id.line3_2);
                textView.setTextColor(Color.RED);
                name.setText("萨日娜（英语）老师");
                time.setText("13614778904");
                course.setText("10:25-11:05");
                break;

            case R.id.line3_3:
                changeColor(re[0]);
                re[0] = R.id.line3_3;
                textView = (TextView) mView.findViewById(R.id.line3_3);
                textView.setTextColor(Color.RED);
                name.setText("萨日娜（英语）老师");
                time.setText("13614778904");
                course.setText("10:25-11:05");
                break;

            case R.id.line3_4:
                changeColor(re[0]);
                re[0] = R.id.line3_4;
                textView = (TextView) mView.findViewById(R.id.line3_4);
                textView.setTextColor(Color.RED);
                name.setText("巴根那老师");
                time.setText("15134857805");
                course.setText("10:25-11:05");
                break;

            case R.id.line3_5:
                changeColor(re[0]);
                re[0] = R.id.line3_5;
                textView = (TextView) mView.findViewById(R.id.line3_5);
                textView.setTextColor(Color.RED);
                name.setText("巴根那老师");
                time.setText("15134857805");
                course.setText("10:25-11:05");
                break;

            case R.id.line3_6:
                changeColor(re[0]);
                re[0] = R.id.line3_6;
                textView = (TextView) mView.findViewById(R.id.line3_6);
                textView.setTextColor(Color.RED);
                name.setText("杭盖老师");
                time.setText("18847771711");
                course.setText("10:25-11:05");
                break;

            case R.id.line4_1:
                changeColor(re[0]);
                re[0] = R.id.line4_1;
                textView = (TextView) mView.findViewById(R.id.line4_1);
                textView.setTextColor(Color.RED);
                name.setText("乌兰托亚老师");
                time.setText("13087180898");
                course.setText("11:15-11:55");
                break;

            case R.id.line4_2:
                changeColor(re[0]);
                re[0] = R.id.line4_2;
                textView = (TextView) mView.findViewById(R.id.line4_2);
                textView.setTextColor(Color.RED);
                name.setText("乌兰托亚老师");
                time.setText("13087180898");
                course.setText("11:15-11:55");
                break;

            case R.id.line4_3:
                changeColor(re[0]);
                re[0] = R.id.line4_3;
                textView = (TextView) mView.findViewById(R.id.line4_3);
                textView.setTextColor(Color.RED);
                break;

            case R.id.line4_4:
                changeColor(re[0]);
                re[0] = R.id.line4_4;
                textView = (TextView) mView.findViewById(R.id.line4_4);
                textView.setTextColor(Color.RED);
                name.setText("乌雅恒老师");
                time.setText("14747171175");
                course.setText("11:15-11:55");
                break;

            case R.id.line4_5:
                changeColor(re[0]);
                re[0] = R.id.line4_5;
                textView = (TextView) mView.findViewById(R.id.line4_5);
                textView.setTextColor(Color.RED);
                name.setText("乌雅恒老师");
                time.setText("14747171175");
                course.setText("11:15-11:55");
                break;

            case R.id.line4_6:
                changeColor(re[0]);
                re[0] = R.id.line4_6;
                textView = (TextView) mView.findViewById(R.id.line4_6);
                textView.setTextColor(Color.RED);
                name.setText("春梅老师");
                time.setText("18647710477");
                course.setText("11:15-11:55");
                break;

            case R.id.line5_1:
                changeColor(re[0]);
                re[0] = R.id.line5_1;
                textView = (TextView) mView.findViewById(R.id.line5_1);
                textView.setTextColor(Color.RED);
                name.setText("曹晶晶老师");
                time.setText("15947376373");
                course.setText("14:40-15:20");
                break;

            case R.id.line5_2:
                changeColor(re[0]);
                re[0] = R.id.line5_2;
                textView = (TextView) mView.findViewById(R.id.line5_2);
                textView.setTextColor(Color.RED);
                name.setText("杭盖老师");
                time.setText("18847771711");
                course.setText("14:40-15:20");
                break;

            case R.id.line5_3:
                changeColor(re[0]);
                re[0] = R.id.line5_3;
                textView = (TextView) mView.findViewById(R.id.line5_3);
                textView.setTextColor(Color.RED);

                break;

            case R.id.line5_4:
                changeColor(re[0]);
                re[0] = R.id.line5_4;
                textView = (TextView) mView.findViewById(R.id.line5_4);
                textView.setTextColor(Color.RED);
                name.setText("乌兰托亚老师");
                time.setText("13087180898");
                course.setText("14:40-15:20");
                break;

            case R.id.line5_5:
                changeColor(re[0]);
                re[0] = R.id.line5_5;
                textView = (TextView) mView.findViewById(R.id.line5_5);
                textView.setTextColor(Color.RED);

                break;

            case R.id.line6_1:
                changeColor(re[0]);
                re[0] = R.id.line6_1;
                textView = (TextView) mView.findViewById(R.id.line6_1);
                textView.setTextColor(Color.RED);
                course.setText("15:30-16:10");
                break;

            case R.id.line6_2:
                changeColor(re[0]);
                re[0] = R.id.line6_2;
                textView = (TextView) mView.findViewById(R.id.line6_2);
                textView.setTextColor(Color.RED);
                name.setText("嘎如迪老师");
                time.setText("15047349383");
                course.setText("15:30-16:10");
                break;

            case R.id.line6_3:
                changeColor(re[0]);
                re[0] = R.id.line6_3;
                textView = (TextView) mView.findViewById(R.id.line6_3);
                textView.setTextColor(Color.RED);
                name.setText("乌兰托亚老师");
                time.setText("13087180898");
                course.setText("15:30-16:10");
                break;

            case R.id.line6_4:
                changeColor(re[0]);
                re[0] = R.id.line6_4;
                textView = (TextView) mView.findViewById(R.id.line6_4);
                textView.setTextColor(Color.RED);
                name.setText("春梅老师");
                time.setText("18647710477");
                course.setText("15:30-16:10");
                break;

            case R.id.line6_5:
                changeColor(re[0]);
                re[0] = R.id.line6_5;
                textView = (TextView) mView.findViewById(R.id.line6_5);
                textView.setTextColor(Color.RED);
                name.setText("萨日娜（英语）老师");
                time.setText("13614778904");
                course.setText("15:30-16:10");
                break;

            case R.id.line7_1:
                changeColor(re[0]);
                re[0] = R.id.line7_1;
                textView = (TextView) mView.findViewById(R.id.line7_1);
                textView.setTextColor(Color.RED);

                course.setText("17:05-17:45");
                break;

            case R.id.line7_2:
                changeColor(re[0]);
                re[0] = R.id.line6_5;
                textView = (TextView) mView.findViewById(R.id.line6_5);
                textView.setTextColor(Color.RED);
                name.setText("春梅老师");
                time.setText("18647710477");
                course.setText("17:05-17:45");
                break;

            case R.id.line7_3:
                changeColor(re[0]);
                re[0] = R.id.line7_3;
                textView = (TextView) mView.findViewById(R.id.line7_3);
                textView.setTextColor(Color.RED);
                name.setText("春梅老师");
                time.setText("18647710477");
                course.setText("17:05-17:45");
                break;

            case R.id.line7_5:
                changeColor(re[0]);
                re[0] = R.id.line7_5;
                textView = (TextView) mView.findViewById(R.id.line7_5);
                textView.setTextColor(Color.RED);
                name.setText("杭盖老师");
                time.setText("18847771711");
                course.setText("17:05-17:45");
                break;


        }

    }
}
