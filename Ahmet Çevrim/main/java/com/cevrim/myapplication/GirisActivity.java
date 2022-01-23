package com.cevrim.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GirisActivity extends AppCompatActivity {
    EditText etad,etsifre;
    String kadi,ksifre,dogrukadi="bilgi",dogruksifre="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        etad=findViewById(R.id.etad);
        etsifre=findViewById(R.id.etsifre);
    }

    public void btngiris(View view) {
        Intent siparis = new Intent(getApplicationContext(),SiparisActivity.class);
        kadi=etad.getText().toString();
        ksifre=etsifre.getText().toString();

        if(!TextUtils.isEmpty(kadi)){
            if(!TextUtils.isEmpty(ksifre)){
                if(kadi.equals(dogrukadi)){
                    if(ksifre.equals(dogruksifre)){
                        startActivity(siparis);
                    }
                    else
                        Toast.makeText(getApplicationContext(), "Şifrenizi yanlış girdiniz.", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "Kullanıcı adınızı yanlış girdiniz.", Toast.LENGTH_SHORT).show();
            }
            else
                Toast.makeText(getApplicationContext(), "Şifre kısmı boş bırakılamaz.", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(getApplicationContext(), "Kullanıcı adı kısmı boş bırakılamaz.", Toast.LENGTH_SHORT).show();

    }

    public void btnsifre(View view) {
        Toast.makeText(getApplicationContext(), "Şifre yenileme bağlantısı mail adresinize gönderilmiştir.", Toast.LENGTH_SHORT).show();
    }
}