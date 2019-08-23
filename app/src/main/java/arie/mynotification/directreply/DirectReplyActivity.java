package arie.mynotification.directreply;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import arie.mynotification.R;

public class DirectReplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct_reply);
        Button buttonNotif = (Button) findViewById(R.id.button_show_notification);
        buttonNotif.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                showNotification();
            }
        });
    }
    private void showNotification() {
        startService(new Intent(this, NotificationService.class));
    }
}
