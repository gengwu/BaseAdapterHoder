package com.futurepower.baseadapterhoder;

import android.view.View;

/**
 * Created by Administrator on 2016/7/18.
 */
public abstract class BasicViewHolder<T> {
    View mView;

    public View getView() {
        mView = creatView();
        mView.setTag(this);
        return mView;
    }


    public abstract void bindData(T item);
    protected abstract View creatView();
}
