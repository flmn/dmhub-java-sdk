package com.github.flmn.dmhub.list.dto;

import java.util.List;

public class DmhExternalListsResult {
    private String code;
    private List<String> success;
    private List<String> failed;

    @Override
    public String toString() {
        return "DmhExternalListsResult{" +
                "code='" + code + '\'' +
                ", success=" + success +
                ", failed=" + failed +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getSuccess() {
        return success;
    }

    public void setSuccess(List<String> success) {
        this.success = success;
    }

    public List<String> getFailed() {
        return failed;
    }

    public void setFailed(List<String> failed) {
        this.failed = failed;
    }
}
