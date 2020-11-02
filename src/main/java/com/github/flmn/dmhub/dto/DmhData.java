package com.github.flmn.dmhub.dto;

import java.util.List;

public class DmhData<T> extends DmhResult {
    private List<T> data;

    @Override
    public String toString() {
        return "DmhData{" +
                "data=" + data +
                "} " + super.toString();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
