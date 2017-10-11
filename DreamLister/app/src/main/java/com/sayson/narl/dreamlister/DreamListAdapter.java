package com.sayson.narl.dreamlister;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lran on 10/11/2017.
 */

public class DreamListAdapter extends BaseAdapter {
    private Context context;
    private int dlayout;
    private ArrayList<Dream> dreamList;


    public DreamListAdapter(Context context,int dlayout ,ArrayList<Dream> dreamList) {
        this.context = context;
        this.dlayout = dlayout;
        this.dreamList= dreamList;
    }

    @Override
    public int getCount() {
        return dreamList.size();
    }

    @Override
    public Object getItem(int spot) {
        return dreamList.get(spot);
    }

    @Override
    public long getItemId(int spot) {
        return spot;
    }
private class ViewHolder{
   TextView  txtPrice,txtName,txtDescription;
    ImageView imageView;
}
    @Override
    public View getView(int spot, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder  holder = new ViewHolder();
        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(dlayout, null);

            holder.txtName = (TextView) row.findViewById(R.id.dreamName);
            holder.txtDescription = (TextView)row.findViewById(R.id.descript);
            holder.txtPrice= (TextView) row.findViewById(R.id.dreamPrice);
            holder.imageView = (ImageView) row.findViewById(R.id.dreamImage);
            row.setTag(holder);
        }
        else{
            holder = (ViewHolder) row.getTag();
        }

        Dream dream = dreamList.get(spot);

        holder.txtName.setText(dream.getName());
        holder.txtDescription.setText(dream.getDescription());
        holder.txtPrice.setText(dream.getPrice());

        byte[] dreamImage= dream.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(dreamImage, 0, dreamImage.length);
        holder.imageView.setImageBitmap(bitmap);
        return row;
    }
}
