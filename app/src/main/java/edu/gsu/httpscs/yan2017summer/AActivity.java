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
    @OnClick(R.id.activity_B)
    public void changeToB(){
        changeActivity();
    }
    public void changeActivity() {
        Button bt = (Button) findViewById(R.id.activity_launch_mode_buttonB);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AActivity.this, BActivity.class));
            }
        });
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
