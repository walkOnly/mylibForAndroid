package me.walkonly.lib.http;

public class JsonResponceHandler extends AsyncHttpResponseHandler {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
