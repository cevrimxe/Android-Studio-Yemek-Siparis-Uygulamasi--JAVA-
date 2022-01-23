package com.cevrim.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SiparisActivity extends AppCompatActivity {
    TextView tvtoplamtutar;
    Integer toplamtutar=0,urun2adet=0,urun3adet=0,urun4adet=0,urun5adet=0,urun6adet=0,urun7adet=0;
    String toplam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siparis);
        tvtoplamtutar=findViewById(R.id.tvtoplamtutar);

    }

    public int btnurun2(View view) {
        urun2adet++;
        toplam="Toplam Tutar: "+ ((urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35))+" TL";
        tvtoplamtutar.setText(toplam);
        return urun2adet;
    }

    public int btnurun3(View view) {
        urun3adet++;
        toplam="Toplam Tutar: "+ ((urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35))+" TL";
        tvtoplamtutar.setText(toplam);
        return urun3adet;
    }

    public int btnurun4(View view) {
        urun4adet++;
        toplam="Toplam Tutar: "+ ((urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35))+" TL";
        tvtoplamtutar.setText(toplam);
        return urun4adet;
    }

    public int btnurun5(View view) {
        urun5adet++;
        toplam="Toplam Tutar: "+ ((urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35))+" TL";
        tvtoplamtutar.setText(toplam);
        return urun5adet;
    }

    public int btnurun6(View view) {
        urun6adet++;
        toplam="Toplam Tutar: "+ ((urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35))+" TL";
        tvtoplamtutar.setText(toplam);
        return urun6adet;
    }

    public int btnurun7(View view) {
        urun7adet++;
        toplam="Toplam Tutar: "+ ((urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35))+" TL";
        tvtoplamtutar.setText(toplam);
        return urun7adet;
    }

    public void btnsepetegit(View view) {
        Intent detayagit= new Intent(getApplicationContext(),DetayActivity.class);
        detayagit.putExtra("urun2adet",urun2adet);
        detayagit.putExtra("urun3adet",urun3adet);
        detayagit.putExtra("urun4adet",urun4adet);
        detayagit.putExtra("urun5adet",urun5adet);
        detayagit.putExtra("urun6adet",urun6adet);
        detayagit.putExtra("urun7adet",urun7adet);
        startActivity(detayagit);
    }


}