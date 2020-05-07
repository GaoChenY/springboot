package com.how2java.springboot.pojo;

import lombok.Data;

/**
 * 账号相关类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class SubAcct {
    /*
    "subAcctId": "资源设备上的从账号ID",
    "subAcctName": "资源设备上的从账号名称",
    "subAcctPwd": "资源设备上的从账号密码，此密码需要明文",
    "ndSupperAcct": "网络或安全设备的特权账号的名称",
    "ndSupperAcctPwd": "网络或安全设备的特权账号的密码，此密码需要明文",

    <----------------主机--------------->
    "hostAuthType": "主机资源账号登录的认证类型0-密码认证，1-秘钥认证",
    "privateKeyContent": "账号的秘钥信息，此秘钥需要明文"
    */



    /*------------------------------数据库，主机，网络或安全设备通用字段start------------------------------*/
    /**
     *  资源设备上的从账号ID
     */
    private String subAcctId;
    /**
     *  资源设备上的从账号名称
     */
    private String subAcctName;
    /**
     *  资源设备上的从账号密码，此密码需要明文
     */
    private String subAcctPwd;

    /*------------------------------网络或安全设备字段start------------------------------*/
    /**
     *  网络或安全设备的特权账号的名称
     */
    private String ndSupperAcct;
    /**
     *  网络或安全设备的特权账号的密码，此密码需要明文
     */
    private String ndSupperAcctPwd;

    /*------------------------------主机需要字段start------------------------------*/
    /**
     *  主机资源账号登录的认证类型0-密码认证，1-秘钥认证
     */
    private String hostAuthType;
    /**
     *  账号的秘钥信息，此秘钥需要明文
     */
    private String privateKeyContent;
}
