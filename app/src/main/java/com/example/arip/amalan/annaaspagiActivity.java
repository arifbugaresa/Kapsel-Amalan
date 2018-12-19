package com.example.arip.amalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class annaaspagiActivity extends AppCompatActivity {

    private ImageButton klik;
    int qty=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annaaspagi);

        klik = (ImageButton)findViewById(R.id.ibikhlas);

        //fungsi Imagetombol
        klik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //padadang

                qty = qty + 1;
                display(qty);

                if (qty>=3)
                {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }


            }

            private void display(int number) {
                if(qty<=3){
                    TextView jumlah = (TextView) findViewById(R.id.tvinfo);
                    jumlah.setText(""+number+"/3");
                }
            }
        });
    }
}
