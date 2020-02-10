package com.hudri.Login;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
 EditText nm, pswd;
 String pas, us;

 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  nm = (EditText) findViewById(R.id.editText1);
  pswd = (EditText) findViewById(R.id.editText2);

 }

 public void aksiLogin(View v) {
  pas = pswd.getText().toString();
  us = nm.getText().toString();

  // Percabangan
  if (us.equals("admin") && pas.equals("1") || us.equals("hudri")
    && pas.equals("123") || us.equals("ipang") && pas.equals("sasono")) {
   Intent i = new Intent(this, HalamanActivity.class);
   i.putExtra("User", nm.getText().toString());
   startActivity(i);
  } else {
   Toast.makeText(getApplicationContext(),
     "Password atau username salah, silahkan diulang",
     Toast.LENGTH_LONG).show();
  }
 }
 public void batal(View v){
  nm.setText("");
  pswd.setText("");
  nm.requestFocus();
 }
}