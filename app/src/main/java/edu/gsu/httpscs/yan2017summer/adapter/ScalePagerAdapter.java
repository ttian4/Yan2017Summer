package edu.gsu.httpscs.yan2017summer.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Tong on 2017/6/12.
 */

public class ScalePagerAdapter extends PagerAdapter {
    private final ArrayList<View> list;

    @Override
    public int getCount() {
        return list.size();
    }

    public ScalePagerAdapter(ArrayList<View> list) {
        this.list = list;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view== object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(list.get(position),0);
        return list.get(position);
    }
}
