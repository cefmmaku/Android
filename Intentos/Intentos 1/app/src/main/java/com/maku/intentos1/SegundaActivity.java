package com.maku.intentos1;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;

import com.maku.intentos1.R;

public class SegundaActivity extends Activity{
    EditText jet;
    Bundle bdl;
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_segunda);
        jet = (EditText) findViewById(R.id.xet1);
        bdl = getIntent().getExtras();
        jet.append("Hola \n" + bdl.getString("NOMBRE") + " " + bdl.getString("Apellido"));
    }
}