package edu.gsu.httpscs.yan2017summer;

import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.gsu.httpscs.yan2017summer.adapter.AdvanceListViewAdapter;

public class AdvanceListViewActivity extends BaseActivity {
    @BindView(R.id.activity_advance_list) ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList();
        list.add("hello");
        list.add("Hello,How are u?");
        list.add("Do u want smite?");
        list.add("yeah");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");

        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);
        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);

        TextView tv1 = new TextView(this);
        tv1.setText("FooterView");
        tv1.setTextSize(50);
        lv.addFooterView(tv1);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showToast(String.valueOf(position));
            }
        });
    }
}
