package io.github.hexiangyuan.lolgame.main.Model;

import java.util.List;

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */

public class QtListBean {
    public String next;
    public String nextpage;
    public List<ListBean> list;

    public static class ListBean {
        public String article_id;
        public String content_id;
        public String newstype;
        public String newstypeid;
        public String channel_desc;
        public String channel_id;
        public String insert_date;
        public String title;
        public String article_url;
        public String summary;
        public String score;
        public String publication_date;
        public String targetid;
        public String intent;
        public String is_act;
        public String is_hot;
        public String is_subject;
        public String is_new;
        public String is_top;
        public String image_with_btn;
        public String image_spec;
        public String is_report;
        public String is_direct;
        public String image_url_small;
        public String image_url_big;
        public String pv;
        public String bmatchid;
        public String v_len;
        public String pics_id;
        public String is_purchase;
    }
}
