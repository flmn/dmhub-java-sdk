package com.github.flmn.dmhub.dto;

public class DmhResult {
    private DmhError error;

    @Override
    public String toString() {
        return "DmhResult{" +
                "error=" + error +
                '}';
    }

    public DmhError getError() {
        return error;
    }

    public void setError(DmhError error) {
        this.error = error;
    }
}
