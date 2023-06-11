package com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder;

import java.util.Date;

public class Log {

    private String logMessage, userName, userIp, logType, clientVersion, productTitle, language;
    private Date logDate;
    private int orderId;

    public Log(String logMessage, String clientVersion, String userName, int orderId){
        this.logMessage = logMessage;

    }
    public Log(String logMessage, String userName, int orderId){
        this.logMessage = logMessage;

    }

    public Log(String logMessage, String clientVersion, String userName){
        this.logMessage = logMessage;

    }

    public Log(Builder builder) {

        this.logMessage = builder.logMessage;

        if(logMessage == null){
            try {
                throw new Exception("message zorunludur.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.userName = builder.userName;
        this.userIp = builder.userIp;
        this.logType = builder.logType;
        this.clientVersion = builder.clientVersion;
        this.productTitle = builder.productTitle;
        this.language = builder.language;
        this.logDate = builder.logDate;
        this.orderId = builder.orderId;
    }

    public static class Builder {

        private String logMessage, userName, userIp, logType, clientVersion, productTitle, language;
        private Date logDate;
        private int orderId;

        public Builder() {
        }

        public Builder logMessage(String logMessage) {
            this.logMessage = logMessage;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userIp(String userIp) {
            this.userIp = userIp;
            return this;
        }

        public Builder logType(String logType) {
            this.logType = logType;
            return this;
        }

        public Builder productTitle(String productTitle) {
            this.productTitle = productTitle;
            return this;
        }

        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder logDate(Date logDate) {
            this.logDate = logDate;
            return this;
        }

        public Builder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Log build() {
            return new Log(this);
        }

    }

    @Override
    public String toString() {
        return "Log{" +
                "logMessage='" + logMessage + '\'' +
                '}';
    }

    public String getLogMessage() {
        return logMessage;
    }

}
