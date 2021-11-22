package com.github.flmn.dmhub.list.dto;

import java.util.List;

public class DmhExternalListsRequest {
    private List<String> lists;

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }
}
