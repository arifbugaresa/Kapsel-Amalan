package com.example.arip.amalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    //deklaraasi tombol
    private ImageButton pindahTasbih;
    private ImageButton pindahZikirPagi;
    private ImageButton pindahzikirpetang;
    private ImageButton pindahzikirsebelumtidur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //inisialisasi Imagetombol
        pindahTasbih = (ImageButton)findViewById(R.id.ibTasbih);
        pindahZikirPagi = (ImageButton)findViewById(R.id.ibZikirpagi);
        pindahzikirpetang= (ImageButton)findViewById(R.id.ibZikirpetang);

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

        //fungsi Imagetombol
        pindahZikirPagi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), ZikirpagiActivity.class);
                startActivity(intent);
            }
        });

        pindahzikirpetang.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), ZikirpetangActivity.class);
                startActivity(intent);
            }
        });

    }
}
