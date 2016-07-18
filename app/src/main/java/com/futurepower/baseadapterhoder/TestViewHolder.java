package com.futurepower.baseadapterhoder;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/18.
 */
public class TestViewHolder extends BasicViewHolder<String>{

    private TextView mView;

    @Override
    public void bindData(String item) {
        mView.setText(item);
    }

    @Override
    protected View creatView() {
        mView = new TextView(MyApp.mContext);
        mView.setTextColor(Color.BLACK);
        return mView;
    }
}
