package com.hohoxc.bean;

import java.util.List;

public class CityBean extends BaseResponceWithArray<CityBean.DataBean> {

    /**
     * cityId : 1
     * name : 北京
     */

    public static class DataBean {
        private int cityId;
        private String name;

        public int getCityId() {
            return cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
