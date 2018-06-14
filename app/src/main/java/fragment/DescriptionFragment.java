package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kaj.myapplication.R;

/**班级简介
 * Created by kaj on 2018/6/12.
 */

public class DescriptionFragment  extends Fragment implements View.OnClickListener{

    protected View mView;
    private TextView content;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content_f2_1, container, false);
//        content = mView.findViewById(R.id.content);

        return mView;
    }


    @Override
    public void onClick(View v) {

    }
}
