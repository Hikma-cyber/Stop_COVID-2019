package com.example.stopcovid_19;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailLangkah extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_langkah);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);

        Langkah langkah = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (langkah != null) {
            Glide.with(this)
                    .load(langkah.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(langkah.getNama_langkah());
            tvDeskripsi.setText(langkah.getDetail_langkah());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Langkah");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
