package com.github.flmn.dmhub.common.dto;

import java.util.List;
import java.util.StringJoiner;

public class DmhError {
    private String code;
    private String message;
    private List<FieldError> fieldErrors;
    private List<FailedItem> failedItems;

    @Override
    public String toString() {
        return "DmhError{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", fieldErrors=" + fieldErrors +
                ", failedItems=" + failedItems +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<FieldError> getFieldErrors() {
        return fieldErrors;
    }

    public void setFieldErrors(List<FieldError> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }

    public List<FailedItem> getFailedItems() {
        return failedItems;
    }

    public void setFailedItems(List<FailedItem> failedItems) {
        this.failedItems = failedItems;
    }

    static class FieldError {
        private String fieldName;
        private String message;

        @Override
        public String toString() {
            return new StringJoiner(", ", FieldError.class.getSimpleName() + "[", "]")
                    .add("fieldName='" + fieldName + "'")
                    .add("message='" + message + "'")
                    .toString();
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    static class FailedItem {
    }
}
