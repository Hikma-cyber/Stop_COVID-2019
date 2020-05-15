package com.example.stopcovid_19;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stopcovid_19.Adapter.ListLangkah;
import com.example.stopcovid_19.Adapter.OnItemClickCallback;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView r_langkah;
    private ArrayList<Langkah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_langkah = findViewById(R.id.r_langkah);
        r_langkah.setHasFixedSize(true);

        list.addAll(DataLangkah.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        r_langkah.setLayoutManager(new LinearLayoutManager(this));
        ListLangkah listLangkah = new ListLangkah(list);
        r_langkah.setAdapter(listLangkah);

        listLangkah.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Langkah langkah) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailLangkah.class);
                moveIntent1.putExtra(DetailLangkah.ITEM_EXTRA, langkah);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, ActivityTentang.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
