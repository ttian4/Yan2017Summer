package edu.gsu.httpscs.yan2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AActivity extends BaseActivity {

    private Intent intent;
    @OnClick(R.id.activity_launch_mode_buttonA)
    public void changeToA(){
        Button bt = (Button) findViewById(R.id.activity_launch_mode_buttonA);
        changeActivity(bt,AActivity.class);
    }
    @OnClick(R.id.activity_launch_mode_buttonB)
    public void changeToB(){
        Button bt = (Button) findViewById(R.id.activity_launch_mode_buttonB);
        changeActivity(bt,BActivity.class);
    }
    @OnClick(R.id.activity_launch_mode_buttonC)
    public void changeToC(){
        Button bt = (Button) findViewById(R.id.activity_launch_mode_buttonC);
        changeActivity(bt,CActivity.class);
    }
    @OnClick(R.id.activity_launch_mode_buttonD)
    public void changeToD(){
        Button bt = (Button) findViewById(R.id.activity_launch_mode_buttonD);
        changeActivity(bt,DActivity.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        showToast("OnCreate");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        showToast("OnNewIntent");
    }
}
