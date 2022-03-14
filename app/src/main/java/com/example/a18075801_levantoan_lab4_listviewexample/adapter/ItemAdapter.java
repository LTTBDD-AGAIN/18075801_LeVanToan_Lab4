package com.example.a18075801_levantoan_lab4_listviewexample.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a18075801_levantoan_lab4_listviewexample.R;
import com.example.a18075801_levantoan_lab4_listviewexample.model.Item;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context mContext;
    private int mIdLayout;
    private List<Item> mListItem;
    private int positionSelect = -1;

    public ItemAdapter(Context context, int idLayout, List<Item> listItem){
        this.mContext = context;
        this.mIdLayout = idLayout;
        this.mListItem = listItem;
    }

    @Override
    public int getCount() {
        if(mListItem.size() !=0 && !mListItem.isEmpty()){
            return mListItem.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(mIdLayout,parent,false);
        }

        ImageView mImgView = (ImageView) convertView.findViewById(R.id.imgView);
        TextView mTvName = (TextView) convertView.findViewById((R.id.tvTitle));
        TextView mTvShopName = (TextView) convertView.findViewById((R.id.tvShop));
        Button mBtnChat = (Button) convertView.findViewById(R.id.btnChat);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
        final Item item = mListItem.get(position);

        if (mListItem != null && !mListItem.isEmpty()) {
            mTvName.setText(item.getName());
            int idItem = item.getId();
            switch (idItem) {
                case 1:
                    mImgView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                case 2:
                    mImgView.setImageResource(R.drawable.ga_bo_toi);
                    break;
                case 3:
                    mImgView.setImageResource(R.drawable.xa_can_cau);
                    break;
                case 4:
                    mImgView.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                    break;
                case 5:
                    mImgView.setImageResource(R.drawable.lanh_dao_gian_don);
                    break;
                case 6:
                    mImgView.setImageResource(R.drawable.hieu_long_con_tre);
                    break;
                case 7:
                    mImgView.setImageResource(R.drawable.trump);
                    break;
                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, item.getName(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}
