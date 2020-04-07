package com.example.comerciolocal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Uri uri = null;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        uri = Uri.parse("http://comerciolocal.camaragibe.pe.gov.br/");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        dispararIntent(intent);

    }
}
