package us.mifeng.wannengadapter;

/**
 * Created by shido on 2017/8/7.
 */

public class Bean {
    private String content, time, title, phone;
    private int imageDrawable;

    public Bean(String title, String content, String time, String phone, int imageDrawable) {
        this.content = content;
        this.time = time;
        this.title = title;
        this.phone = phone;
        this.imageDrawable = imageDrawable;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
