package com.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view) {

        //toast customizado

        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.star_big_off);

//        TextView textView = new TextView(getApplicationContext());
//          textView.setBackgroundResource(R.color.design_default_color_primary);
//        textView.setText("Olá toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration( Toast.LENGTH_LONG);
        toast.setView( imagem ); // ( textView )
        toast.show();



//        Toast.makeText(
//                getApplicationContext(),
//                "Ação realizada com sucesso",
//                Toast.LENGTH_SHORT).show();

    }
}