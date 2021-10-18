package com.github.flmn.dmhub.common.dto;

public class DmhResult {
    private Boolean success;
    private String message;
    private DmhError error;

    public boolean hasError() {
        return success != null && !success;
    }

    @Override
    public String toString() {
        return "DmhResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", error=" + error +
                '}';
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DmhError getError() {
        return error;
    }

    public void setError(DmhError error) {
        this.error = error;
    }
}
