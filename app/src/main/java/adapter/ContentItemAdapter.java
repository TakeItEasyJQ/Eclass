package adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kaj.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaj on 2018/6/13.
 */

public class ContentItemAdapter extends RecyclerView.Adapter<ContentItemAdapter.ViewHolder>{
    View view;
    List<Teachers> teachers=new ArrayList<>();
    @Override
    public ContentItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_f2_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
//        ViewGroup group=(ViewGroup) parent.getParent();
//        if (parent != null) {
//            group.removeAllViews();
//            parent.addView(view);
//        }
        return holder;
    }
    public ContentItemAdapter (){
        teachers.add(new Teachers("123","123"));
        teachers.add(new Teachers("456","456"));
        teachers.add(new Teachers("123","123"));
        teachers.add(new Teachers("456","456"));
        teachers.add(new Teachers("123","123"));
        teachers.add(new Teachers("456","456"));
        teachers.add(new Teachers("123","123"));
        teachers.add(new Teachers("456","456"));
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView photo_num;
        public TextView text2;

        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            photo_num = itemView.findViewById(R.id.photo_num);
            text2 = itemView.findViewById(R.id.text2);

        }
    }

    @Override
    public void onBindViewHolder(ContentItemAdapter.ViewHolder holder, int position) {

            Glide.with(view.getContext()).load(R.drawable.img_teacher).into(holder.image);
            holder.text2.setText(teachers.get(position).name);
            holder.photo_num.setText(teachers.get(position).num);



    }

    @Override
    public int getItemCount() {
        return teachers.size();
    }

}
