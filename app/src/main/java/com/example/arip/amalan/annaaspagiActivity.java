package com.example.arip.amalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class annaaspagiActivity extends AppCompatActivity {

    //deklaraasi tombol
    private Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annaaspagi);

        //inisialisasi Imagetombol
        lanjut = (Button)findViewById(R.id.mulai);
        //fungsi tombol
        lanjut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
