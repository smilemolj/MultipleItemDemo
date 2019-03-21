package com.smilemolj.multipleitemdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<MtestEntity> list;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMultiContent();
        MultiItemAdapter adapter = new MultiItemAdapter(list);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemChildClickListener(new MultiItemAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "onItemChildClick" + position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }

    private void initMultiContent() {
        MtestEntity item = new MtestEntity();
        item.name = "yang";
        item.type = 1;
        MtestEntity item1 = new MtestEntity();
        item1.name = "yangxixi";
        item1.type = 3;
        MtestEntity item2 = new MtestEntity();
        item2.name = "fangfeizi";
        item2.type = 2;
        list = new ArrayList<>();
        list.add(item);
        list.add(item1);
        list.add(item2);
        list.add(item2);
        list.add(item2);
        list.add(item);
        list.add(item1);
        list.add(item1);
        list.add(item2);
        list.add(item1);
        list.add(item2);
        list.add(item);
        list.add(item1);
        list.add(item2);
        list.add(item);
        list.add(item2);
        list.add(item1);
        list.add(item2);
        list.add(item2);
        list.add(item1);

    }
}
