package com.example.arip.amalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TasbihActivity extends AppCompatActivity {

    //deklarasi tombol
    private ImageButton Counter;
    int qty=0,putaran=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        //inisialisasi Imagetombol
        Counter = (ImageButton)findViewById(R.id.ibTambahTasbih);

        //fungsi Imagetombol
        Counter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

             //padadang

                qty = qty + 1;
                display(qty);

                if (qty>=33)
                {
                    qty=0;
                    putaran=putaran+1;
                }

                TextView kelipatan = (TextView) findViewById(R.id.tvTasbihkelipatan);
                kelipatan.setText(""+putaran);
            }

            private void display(int number) {
                TextView jumlah = (TextView) findViewById(R.id.tvTasbih);
                jumlah.setText(""+number);
            }
        });

    }
}
