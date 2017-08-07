package us.mifeng.wannengadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by shido on 2017/8/7.
 */

public class ViewHolder {
    private SparseArray<View> mView;
    private int mPosition;
    private View mConvertView;

    public ViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
        this.mPosition = position;
        this.mView = new SparseArray<>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        mConvertView.setTag(this);
    }

    public static ViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
        if (convertView == null) {
            return new ViewHolder(context, parent, layoutId, position);
        } else {
            ViewHolder holder = (ViewHolder) convertView.getTag();
            holder.mPosition = position;
            return holder;
        }
    }

    /**
     * 通过viewId 获取控件
     *
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T getView(int viewId) {
        View view = mView.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mView.put(viewId, view);
        }
        return (T) view;
    }

    public int getmPosition() {
        return mPosition;
    }

    /**
     * 获取一个当前的View，用来显示
     *
     * @return
     */
    public View getmConvertView() {
        return mConvertView;
    }

    /**
     * 给一个TextView的Id 和内容
     * 设置他的setText属性
     *
     * @param viewId
     * @param str
     * @return
     */
    public ViewHolder setText(int viewId, String str) {
        ((TextView) getView(viewId)).setText(str);
        return this;
    }

    /**
     * 给一个ImageView的Id 和图片资源（int）
     * 可直接设置图片
     *
     * @param viewId
     * @param drawableId
     * @return
     */
    public ViewHolder setImage(int viewId, int drawableId) {
        ((ImageView) getView(viewId)).setImageResource(drawableId);
        return this;
    }

}
