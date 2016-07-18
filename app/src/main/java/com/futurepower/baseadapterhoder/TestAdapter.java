package com.futurepower.baseadapterhoder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/18.
 */
public class TestAdapter extends BasicAdapter<String> {


    public TestAdapter(ArrayList<String> data) {
        super(data);
    }


    @Override
    protected BasicViewHolder createViewHolder() {
        TestViewHolder holder = new TestViewHolder();
        return holder;
    }
}
