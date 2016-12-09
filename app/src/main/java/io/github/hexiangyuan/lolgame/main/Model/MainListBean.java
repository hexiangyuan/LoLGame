package io.github.hexiangyuan.lolgame.main.Model;

import java.util.List;

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */

public class MainListBean {
    public String next;
    public String nextpage;
    public List<Content> list;

    public static class Content {
        public String title;
        public String subTitle;
        public String sourceFrom;
        public String publicationData;
        public String pv;
        public String imageUrl;
        public String thumbnail;
    }
}
