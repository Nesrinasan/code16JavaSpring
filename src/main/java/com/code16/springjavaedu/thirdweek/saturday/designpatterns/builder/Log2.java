package com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Log2 {
    private String logMessage, userName, userIp, logType, clientVersion, productTitle, language;
    private Date logDate;
    private int orderId;

}
