package com.example.arip.amalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class TasbihActivity extends AppCompatActivity {

    //deklarasi tombol
    private ImageButton Counter;
    private Button reset;

    int qty=0,putaran=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        //inisialisasi Imagetombol
        Counter = (ImageButton)findViewById(R.id.ibTambahTasbih);

        //inisialisasi button
        reset = (Button)findViewById(R.id.btnReset);

        //fungsi Imagetombol
        Counter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

             //padadang

                if (qty==0)
                {
                    putaran=putaran+1;
                }

                qty = qty + 1;

                display(qty);


                if (qty>=33)
                {
                    qty=0;
                }



                TextView kelipatan = (TextView) findViewById(R.id.tvTasbihkelipatan);
                kelipatan.setText(""+putaran);
            }

            private void display(int number) {
                TextView jumlah = (TextView) findViewById(R.id.tvTasbih);
                jumlah.setText(""+number);
            }
        });

        //tombol reset diklik
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qty = 0;
                putaran = -1;

                //ngebuat tampilkan putaran 0
                TextView kelipatan = (TextView) findViewById(R.id.tvTasbihkelipatan);
                kelipatan.setText("0");

                //buat tampilan jumlahnya 0
                TextView jumlah = (TextView) findViewById(R.id.tvTasbih);
                jumlah.setText("0");
            }
        });

    }
}
