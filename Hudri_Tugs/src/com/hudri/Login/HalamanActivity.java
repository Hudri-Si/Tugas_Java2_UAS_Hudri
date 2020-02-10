package com.hudri.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HalamanActivity extends Activity {
TextView tampilnama;
 
 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.halaman_utama);
  
  tampilnama = (TextView)findViewById(R.id.txtTampil);
  
  Intent ambilNama = getIntent();
  tampilnama.setText(ambilNama.getStringExtra("User"));
 }


}