package us.mifeng.wannengadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private ArrayList<Bean> beenList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv_id);
        initData();
    }
    private void initData() {
        beenList = new ArrayList<>();

        beenList.add(new Bean("title", "我是内容2", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容3", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容4", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容5", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容6", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容7", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容8", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容9", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容1", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容10", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容11", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容12", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容13", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容14", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容15", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容16", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容17", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容18", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容19", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容20", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容21", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容22", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容1", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容1", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容1", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容1", "2013-06-30", "10086", R.mipmap.ic_launcher));
        beenList.add(new Bean("title", "我是内容1", "2013-06-30", "10086", R.mipmap.ic_launcher));
        //第一种实现方式
        MyAdapter2 myAdapter2 = new MyAdapter2(MainActivity.this, beenList, R.layout.item);
        lv.setAdapter(myAdapter2);
//        //第二种实现方式
//        lv.setAdapter(new MyAdapter<Bean>(MainActivity.this, beenList, R.layout.item_view) {
//            @Override
//            public void convert(ViewHolder holder, Bean bean) {
//                holder.setText(R.id.tv_title, bean.getTitle()).
//                        setText(R.id.tv_content, bean.getContent()).
//                        setText(R.id.tv_phone, bean.getPhone()).
//                        setText(R.id.tv_time, bean.getTime()).
//                        setImage(R.id.iv_id, bean.getImageDrawable());
//                  设置布局的两种书写方式
//                ((TextView) holder.getView(R.id.tv_title)).setText(bean.getTitle());
//                ((TextView) holder.getView(R.id.tv_content)).setText(bean.getContent());
//                ((TextView) holder.getView(R.id.tv_phone)).setText(bean.getPhone());
//                ((TextView) holder.getView(R.id.tv_time)).setText(bean.getTime());
//                ((ImageView) holder.getView(R.id.iv_id)).setImageResource(bean.getImageDrawable());
//            }
//        });
    }
    //    ArrayList<Integer> mPost = new ArrayList<>();
//
//    @Override
//    public void setData(final ViewHolder holder, Bean bean) {
//
////        ((TextView) holder.getView(R.id.tv_title)).setText(bean.getTitle());
////        ((TextView) holder.getView(R.id.tv_content)).setText(bean.getContent());
////        ((TextView) holder.getView(R.id.tv_phone)).setText(bean.getPhone());
////        ((TextView) holder.getView(R.id.tv_time)).setText(bean.getTime());
//
//        holder.setText(R.id.tv_title, bean.getTitle()).
//                setText(R.id.tv_content, bean.getContent()).
//                setText(R.id.tv_phone, bean.getPhone()).
//                setText(R.id.tv_time, bean.getTime());
//        //下面是防止CheckBox 复用出问题的代码
//        final CheckBox cbId = holder.getView(R.id.cb_id);
//        cbId.setChecked(false);
//        if (mPost.contains(holder.getmPosition())) {
//            cbId.setChecked(true);
//        }
//        cbId.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (cbId.isChecked()) {
//                    mPost.add(holder.getmPosition());
//                } else {
//                    mPost.remove((Integer) holder.getmPosition());
//                }
//
//            }
//        });
//
//    }
}
