package com.example.arip.amalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    //deklaraasi tombol
    private ImageButton pindahTasbih;
    private ImageButton pindahZikir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //inisialisasi Imagetombol
        pindahTasbih = (ImageButton)findViewById(R.id.ibTasbih);
        pindahZikir = (ImageButton)findViewById(R.id.ibZikirpagi);

        //fungsi Imagetombol
        pindahTasbih.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), TasbihActivity.class);
                startActivity(intent);
            }
        });

    }
}
