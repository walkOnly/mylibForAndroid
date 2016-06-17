package com.hohoxc.bean;

import java.util.List;

public class Banner extends BaseResponse<Banner.DataBean> {

    public static class DataBean {
        private int bannerId;
        private String name;
        private String imgUrl;
        private String redirectUrl;

        public int getBannerId() {
            return bannerId;
        }

        public String getName() {
            return name;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public String getRedirectUrl() {
            return redirectUrl;
        }
		
		// setter ...

    }

}
