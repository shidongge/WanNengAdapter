package us.mifeng.wannengadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.ArrayList;

/**
 * Created by shido on 2017/8/7.
 */

public abstract class MyAdapter<T> extends BaseAdapter {
    protected Context mContext;
    protected ArrayList<T> mList;
    protected LayoutInflater mInflat;
    protected int mLayoutId;

    public MyAdapter(Context context, ArrayList<T> list, int layoutId) {
        this.mContext = context;
        this.mList = list;
        this.mLayoutId = layoutId;
        mInflat = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder = ViewHolder.get(mContext, view, viewGroup, mLayoutId, position);
        convert(holder, getItem(position));
        return holder.getmConvertView();
    }
    public abstract void convert(ViewHolder holder, T t);
}
