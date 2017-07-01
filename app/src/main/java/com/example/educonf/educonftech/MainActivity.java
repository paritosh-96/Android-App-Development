package com.example.educonf.educonftech;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.btNotification);
        bt2=(Button)findViewById(R.id.button);
        bt3=(Button)findViewById(R.id.btEmail);
        bt4=(Button)findViewById(R.id.btSMS);
        bt5=(Button)findViewById(R.id.btCall);
        bt6=(Button)findViewById(R.id.btAlert);
        bt7=(Button)findViewById(R.id.btAnimation);
        bt8=(Button)findViewById(R.id.btRecording);
 }

    public void onClick(View v)
    {
        if(v==bt1) {
            addNotification();
        }

        if(v==bt2)
        {
            Intent i=new Intent(getBaseContext(),Location.class);
            startActivity(i);
        }
        if(v==bt3)
        {
            Intent i=new Intent(getBaseContext(),Email.class);
            startActivity(i);
        }
        if(v==bt4)
        {
            Intent i=new Intent(getBaseContext(),SendMsg.class);
            startActivity(i);
        }
        if(v==bt5)
        {
            Intent i=new Intent(getBaseContext(),Call.class);
            startActivity(i);
        }
        if(v==bt6)
        {
            Intent i=new Intent(getBaseContext(),AlertMessage.class);
            startActivity(i);
        }
        if(v==bt7)
        {
            Intent i=new Intent(getBaseContext(),AnimationEffect.class);
            startActivity(i);
        }
        if(v==bt8)
        {
            Intent i=new Intent(getBaseContext(),Recording.class);
            startActivity(i);
        }
    }

    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.download)
                        .setContentTitle("Notifications Example")
                        .setContentText("This is a test notification");

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}
