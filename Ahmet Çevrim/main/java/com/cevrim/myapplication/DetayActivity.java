package com.cevrim.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DetayActivity extends AppCompatActivity {

    Integer urun2adet,urun3adet,urun4adet,urun5adet,urun6adet,urun7adet,toplamfiyat;
    Integer seciliekstramalzeme=0,secili6tl=0,secili5tl=0,secili12tl=0,secilibeyin=0;
    ListView siparisler;
    TextView tvtoplamson;
    Spinner icecekspinner;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    RadioGroup rg1;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        tvtoplamson=findViewById(R.id.tvtoplamson);
        icecekspinner=findViewById(R.id.icecekspinner);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
        cb6=findViewById(R.id.cb6);
        rg1=findViewById(R.id.rg1);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        urun2adet=getIntent().getIntExtra("urun2adet",0);
        urun3adet=getIntent().getIntExtra("urun3adet",0);
        urun4adet=getIntent().getIntExtra("urun4adet",0);
        urun5adet=getIntent().getIntExtra("urun5adet",0);
        urun6adet=getIntent().getIntExtra("urun6adet",0);
        urun7adet=getIntent().getIntExtra("urun7adet",0);
        siparisler=findViewById(R.id.siparisler);
        toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
        tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
        listeyidoldur();

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb1.isChecked()) {
                    seciliekstramalzeme++;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");

                }
                else if(!(cb1.isChecked())){
                    seciliekstramalzeme--;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
                }
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb2.isChecked()) {
                    seciliekstramalzeme++;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");

                }
                else if(!(cb2.isChecked())){
                    seciliekstramalzeme--;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
                }
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb3.isChecked()) {
                    seciliekstramalzeme++;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");

                }
                else if(!(cb3.isChecked())){
                    seciliekstramalzeme--;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
                }
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()) {
                    seciliekstramalzeme++;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");

                }
                else if(!(cb4.isChecked())){
                    seciliekstramalzeme--;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
                }
            }
        });
        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb5.isChecked()) {
                    seciliekstramalzeme++;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");

                }
                else if(!(cb5.isChecked())){
                    seciliekstramalzeme--;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
                }
            }
        });
        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb6.isChecked()) {
                    seciliekstramalzeme++;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");

                }
                else if(!(cb6.isChecked())){
                    seciliekstramalzeme--;
                    toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                            (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                    tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
                }
            }
        });

        icecekspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                secili6tl=0;
                secili5tl=0;
                secili12tl=0;
                secilibeyin=0;
                if(i>=1 && i<=4){
                    secili6tl++;
                }
                else if(i>=5 && i<=6){
                    secili5tl++;
                }
                else if(i==7){
                    secili12tl++;
                }
                else if(i==8){
                    secilibeyin++;
                }
                else if(i==0){
                }
                toplamfiyat=(urun2adet*15)+(urun3adet*17)+(urun4adet*30)+(urun5adet*27)+(urun6adet*33)+(urun7adet*35)+
                        (seciliekstramalzeme*3) +(secili6tl*6)+(secili5tl*5)+(secili12tl*12)+(secilibeyin*9994);
                tvtoplamson.setText("Toplam Tutar: "+toplamfiyat+" TL");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    private void listeyidoldur() {
        ArrayList<String> cliste=new ArrayList<String>();
        if(urun2adet>0 && urun2adet<10){
            cliste.add(urun2adet+ " adet Big Çevo®----------------------------------"+urun2adet*15+" TL");
        }
        if(urun2adet>=10){
            cliste.add(urun2adet+ " adet Big Çevo®--------------------------------"+urun2adet*15+" TL");
        }
        if(urun3adet>0 && urun3adet<10){
            cliste.add(urun3adet+ " adet Double Çevo Chicken®---------------"+urun3adet*17+" TL");
        }
        if(urun3adet>=10){
            cliste.add(urun3adet+ " adet Double Çevo Chicken®-------------"+urun3adet*17+" TL");
        }
        if(urun4adet>0 && urun4adet<10){
            cliste.add(urun4adet+ " adet Acısız Sucuklu Pizza------------------"+urun4adet*30+" TL");
        }
        if(urun4adet>=10){
            cliste.add(urun4adet+ " adet Acısız Sucuklu Pizza----------------"+urun4adet*30+" TL");
        }
        if(urun5adet>0 && urun5adet<10){
            cliste.add(urun5adet+ " adet Sebzeli Pizza-----------------------------"+urun5adet*27+" TL");
        }
        if(urun5adet>=10){
            cliste.add(urun5adet+ " adet Sebzeli Pizza---------------------------"+urun5adet*27+" TL");
        }
        if(urun6adet>0 && urun6adet<10){
            cliste.add(urun6adet+ " adet Ton Balıklı Salata-----------------------"+urun6adet*33+" TL");
        }
        if(urun6adet>=10){
            cliste.add(urun6adet+ " adet Ton Balıklı Salata---------------------"+urun6adet*33+" TL");
        }
        if(urun7adet>0 && urun7adet<10){
            cliste.add(urun7adet+ " adet Izgara Tavuklu Salata----------------"+urun7adet*35+" TL");
        }
        if(urun7adet>=10){
            cliste.add(urun7adet+ " adet Izgara Tavuklu Salata--------------"+urun7adet*35+" TL");
        }




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,cliste);
        siparisler.setAdapter(adapter);

    }

    public void btniptal(View view) {
        Intent geridon=new Intent(this,SiparisActivity.class);
        startActivity(geridon);
    }

    public void btnonay(View view) {
        if(!(rb1.isChecked()||rb2.isChecked())){
            Toast.makeText(this, "Lütfen ödeme türünü seçiniz!", Toast.LENGTH_SHORT).show();
        }
        else if(toplamfiyat==0){
            Toast.makeText(this, "Sepetiniz boş!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent onayla = new Intent(this, SonActivity.class);
            startActivity(onayla);
        }
    }

}