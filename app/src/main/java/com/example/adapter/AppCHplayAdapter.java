package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.hoclistviewnangcaochplay.MainActivity;
import com.example.hoclistviewnangcaochplay.R;
import com.example.model.AppCHplay;

import java.util.zip.Inflater;

public class AppCHplayAdapter extends ArrayAdapter<AppCHplay> {
    Activity context;
    int resource;
    public AppCHplayAdapter(@NonNull Activity context, int resource) {
        super(context, resource);

        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {//biến item trong view thành item trong dữ liệu
        LayoutInflater inflater = LayoutInflater.from(this.context); //main
        View customView = inflater.inflate(this.resource, null, false); //item.xml

        //ánh xạ
        TextView tvID =  (TextView) customView.findViewById(R.id.tvID);
        ImageView imgApp = customView.findViewById(R.id.imgApp);
        TextView tvAppname = customView.findViewById(R.id.tvAppname);
        TextView tvCompany = customView.findViewById(R.id.tvCompany);
        TextView tvRating = customView.findViewById(R.id.tvRating);

        //set item từ view lấy đc
        AppCHplay appCHplay = getItem(position);
        tvID.setText(appCHplay.getId() + "");
        imgApp.setImageResource(appCHplay.getAppImg());
        //dữ liệu kiểu int -> view (trong AppCHplay img lưu trữ kiểu int của R.drawble.img)
        tvAppname.setText(appCHplay.getAppName());
        tvCompany.setText(appCHplay.getAppCompany());
        tvRating.setText(appCHplay.getRating() + "");

        return customView;
    }
}
