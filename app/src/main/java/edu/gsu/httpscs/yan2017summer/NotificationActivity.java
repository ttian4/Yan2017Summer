package edu.gsu.httpscs.yan2017summer;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.graphics.BitmapCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class NotificationActivity extends BaseActivity {

    private NotificationManager manager;
    private  int notifyId = 100;

    @OnClick(R.id.activity_notification_small)
    public void smallNotification(View v){
        showToast("smallNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setContentTitle("Title");
        mBuilder.setContentText("text");
        mBuilder.setContentIntent(getDefalutIntent(Notification.FLAG_AUTO_CANCEL));
        mBuilder.setNumber(10);
        mBuilder.setTicker("Ticker");
        mBuilder.setWhen(System.currentTimeMillis());
        mBuilder.setPriority(Notification.PRIORITY_DEFAULT);
        mBuilder.setAutoCancel(true);
        mBuilder.setOngoing(false);
        mBuilder.setDefaults(Notification.DEFAULT_SOUND);
        mBuilder.setDefaults(Notification.DEFAULT_VIBRATE);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher);
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        mBuilder.setStyle(bigPictureStyle);
        bigPictureStyle.setBuilder(mBuilder);
        bigPictureStyle.setBigContentTitle("BigContentTitle");
        bigPictureStyle.setSummaryText("SummaryText");
//        Bitmap bitmap1 = BitmapFactory.decodeResource();


        manager.notify(notifyId, mBuilder.build());
    }
    private PendingIntent getDefalutIntent(int flags){
        PendingIntent pendingIntent = PendingIntent.getActivity(this,1,new Intent(),flags);
        return pendingIntent;
    }
    @OnClick(R.id.activity_notification_big)
    public void bigNotification(View v){
        showToast("bigNotification");
    }
    @OnClick(R.id.activity_notification_pic)
    public void picNotification(View v){
        showToast("picNotification");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ButterKnife.bind(this);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }
}
