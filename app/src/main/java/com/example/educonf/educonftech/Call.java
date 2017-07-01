package com.example.educonf.educonftech;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Call extends AppCompatActivity {
    private Button button,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

            button = (Button) findViewById(R.id.btCallMallu);
            bt2=(Button)findViewById(R.id.btCallGanja);
    }

    public void onClick(View arg0) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:09470049722"));

        if (ActivityCompat.checkSelfPermission(Call.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this,"permission denied",Toast.LENGTH_LONG).show();
            return;
        }
        startActivity(callIntent);

    }
}
