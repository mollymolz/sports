package com.example.codetribe.anotherone;

import android.os.health.TimerStat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnHome,btnVisitor,btnReset;
    private TextView txthome,txtVisitor;
    private int countHome=0;
    private int countVisitor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome=(Button)findViewById(R.id.btnHome);
        btnVisitor=(Button)findViewById(R.id.btnVisitor);
        btnReset=(Button)findViewById(R.id.btnReset);
        txthome=(TextView)findViewById(R.id.txthome);
        txtVisitor=(TextView)findViewById(R.id.txtvisitor);


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                countHome=countHome+1;

                txthome.setText(String.valueOf(countHome));


            }
        });


        btnVisitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countVisitor=countVisitor+1;

                txtVisitor.setText(String.valueOf(countVisitor));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txthome.setText("0");
                txtVisitor.setText("0");
            }
        });


    }
}
