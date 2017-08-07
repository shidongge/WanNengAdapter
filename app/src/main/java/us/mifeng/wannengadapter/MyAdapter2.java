package us.mifeng.wannengadapter;

import android.content.Context;


import java.util.ArrayList;

/**
 * Created by shido on 2017/8/7.
 */

public class MyAdapter2 extends MyAdapter<Bean> {
    public MyAdapter2(Context context, ArrayList<Bean> list, int layoutId) {
        super(context, list, layoutId);
    }

    @Override
    public void convert(ViewHolder holder, Bean bean) {
        holder.setText(R.id.tv_title, bean.getTitle()).
                setText(R.id.tv_content, bean.getContent()).
                setText(R.id.tv_phone, bean.getPhone()).
                setText(R.id.tv_time, bean.getTime()).
                setImage(R.id.iv_id, bean.getImageDrawable());
//设置布局的两种书写方式
//        ((TextView) holder.getView(R.id.tv_title)).setText(bean.getTitle());
//        ((TextView) holder.getView(R.id.tv_content)).setText(bean.getContent());
//        ((TextView) holder.getView(R.id.tv_phone)).setText(bean.getPhone());
//        ((TextView) holder.getView(R.id.tv_time)).setText(bean.getTime());
//        ((ImageView) holder.getView(R.id.iv_id)).setImageResource(bean.getImageDrawable());
    }
}
