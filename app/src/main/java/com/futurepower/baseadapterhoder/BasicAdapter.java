package com.futurepower.baseadapterhoder;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/18.
 */
public abstract class BasicAdapter<T> extends android.widget.BaseAdapter {
    public BasicAdapter(ArrayList<T> data) {
        this.data = data;
    }

    ArrayList<T> data;

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        if (position > data.size() - 1) {
            position = data.size() - 1;
        }
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BasicViewHolder holder = null;
        if (convertView == null) {
            holder = createViewHolder();
            convertView = holder.getView();
        } else {
            holder = (BasicViewHolder) convertView.getTag();
        }
        holder.bindData(getItem(position));
        return convertView;
    }

    protected abstract BasicViewHolder createViewHolder();
}
