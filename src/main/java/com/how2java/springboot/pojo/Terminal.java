package com.how2java.springboot.pojo;

import lombok.Data;

/**
 * 终端信息类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class Terminal {
    /*"clientIp": "访问4A系统的终端IP",
    "clientMAC": "终端的MAC地址",
    "clientCpuNum": "终端的CPU号码"*/

    /**
     *  访问4A系统的终端IP
     */
    private String clientIp;
    /**
     * 终端的MAC地址
     */
    private String clientMAC;
    /**
     * 终端的CPU号码
     */
    private String clientCpuNum;
}
