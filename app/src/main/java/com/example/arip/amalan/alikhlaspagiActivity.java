package com.example.arip.amalan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class alikhlaspagiActivity extends AppCompatActivity {

    //deklaraasi tombol
    private Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alikhlaspagi);

        //inisialisasi Imagetombol
        lanjut = (Button)findViewById(R.id.mulai);
        //fungsi tombol
        lanjut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), alfalaqpagiActivity.class);
                startActivity(intent);
            }
        });
    }
}
