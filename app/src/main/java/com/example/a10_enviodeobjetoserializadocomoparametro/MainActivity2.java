package com.example.a10_enviodeobjetoserializadocomoparametro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

    public class MainActivity2 extends AppCompatActivity {
        private TextView  lbSchedule;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);


            Intent inta = getIntent();
            Datos data = (Datos) inta.getSerializableExtra("data");
            String datoJava=data.isJava()? "SI": "NO";
            String datoNet=data.isNet()? "SI": "NO";
            String datoOracle=data.isOracle()? "SI": "NO";

            lbSchedule = findViewById(R.id.lbSchedule);
            this.lbSchedule.setText(Html.fromHtml("Horario: " + data.getSchedule()+
                            "<BR/>¿Java?: "+ datoJava+"<BR/>¿.NET?:"+
                            datoNet+"<BR/>¿Oracle?:"+datoOracle)
                    , TextView.BufferType.SPANNABLE);

        }

        public void closeWindow(View view) {
            finish();
        }
    }





