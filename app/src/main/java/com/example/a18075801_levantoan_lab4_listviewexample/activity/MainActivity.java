package com.example.a18075801_levantoan_lab4_listviewexample.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.a18075801_levantoan_lab4_listviewexample.R;
import com.example.a18075801_levantoan_lab4_listviewexample.adapter.ItemAdapter;
import com.example.a18075801_levantoan_lab4_listviewexample.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Item> mListItem;
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);
        mListItem = new ArrayList<>();
        mListItem.add(new Item(1, "Cá nấu lẩu, nấu mì...","Devang"));
        mListItem.add(new Item(2, "1KG KHÔ GÀ, BƠ TỎI...","LTD Food"));
        mListItem.add(new Item(3, "Xe cần cẩu đa năng...","Thế giới đồ chơi"));
        mListItem.add(new Item(4, "Đồ chơi dạng mô hình","Thế giới đồ chơi"));
        mListItem.add(new Item(5, "Lãnh đạo giản đơn","Minh Long Book"));
        mListItem.add(new Item(6, "Hiểu lòng con trẻ","Minh Long Book"));
        mListItem.add(new Item(7, "Donal Trump Thiên tài lãnh đạo",""));

        ItemAdapter adapter = new ItemAdapter(this, R.layout.item_custom_listview, mListItem);
        mListView.setAdapter(adapter);

    }
}