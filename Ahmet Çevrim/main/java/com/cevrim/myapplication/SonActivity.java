package com.cevrim.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;


public class SonActivity extends AppCompatActivity {

    TextView tvvaris;
    String hour,minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_son);
        tvvaris=findViewById(R.id.tvvaris);
        int saat = Calendar.getInstance().get(Calendar.HOUR);
        int dakika = Calendar.getInstance().get(Calendar.MINUTE);
        if((dakika+30)>=60){
            saat++;
            if(saat>=24){
                saat=0;
            }
        }
        if(saat<10){
            hour="0"+saat;
        }
        else
            hour=""+saat;
        if(((dakika+30)%60) <10){
            minute="0"+((dakika+30)%60);
        }
        else
            minute=""+((dakika+30)%60);

        tvvaris.setText("Tahmini Varış Zamanı: "+hour+":"+minute);

        Thread timerThread = new Thread(){
            public void run() {
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent bitti=new Intent(getApplicationContext(),SiparisActivity.class);
                    startActivity(bitti);
                }

            }
        };
        timerThread.start();

    }
}