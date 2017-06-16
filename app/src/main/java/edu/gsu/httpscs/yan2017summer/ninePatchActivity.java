package edu.gsu.httpscs.yan2017summer;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import edu.gsu.httpscs.yan2017summer.adapter.ScalePagerAdapter;

public class ninePatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine_patch);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
    }
}
