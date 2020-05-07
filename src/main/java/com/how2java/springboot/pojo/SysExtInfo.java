package com.how2java.springboot.pojo;

import lombok.Data;

/**
 * 数据库信息类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class SysExtInfo {
    /*
    "ptype": "工具与服务器连接的协议类型",
    "dbType": "数据库类型",
    "dbName":"数据库名",
    "oracleServerName":"ORACLE数据库服务名",
    "rootPwd":"root账号的密码,密码为明文",
    "uacDomain":"UAC认证门户系统归属的域信息ID",
    "dbLoginLink":"ORACLE数据库dbLoginLink信息"
    */

    /**
     *  工具与服务器连接的协议类型
     */
    private String ptype;
    /**
     *  数据库类型
     */
    private String dbType;
    /**
     *  数据库名
     */
    private String dbName;
    /**
     *  ORACLE数据库服务名
     */
    private String oracleServerName;
    /**
     *  root账号的密码,密码为明文
     */
    private String rootPwd;
    /**
     *  UAC认证门户系统归属的域信息ID
     */
    private String uacDomain;
    /**
     *  ORACLE数据库dbLoginLink信息
     */
    private String dbLoginLink;
}
