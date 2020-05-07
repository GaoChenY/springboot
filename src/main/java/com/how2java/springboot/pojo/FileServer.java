package com.how2java.springboot.pojo;

import lombok.Data;

/**
 * 个人文件服务器信息类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class FileServer {
    /*
    "fileServerIp":"个人文件服务器IP",
    "fileServerPort":"个人文件服务器SAMBA连接端口",
    "sambaAcctName":"个人文件服务器SAMBA账号名",
    "sambaAcctPwd":"个人文件服务器SAMBA账号密码"
    */

    /**
     *  个人文件服务器IP
     */
    private String fileServerIp;
    /**
     * 个人文件服务器SAMBA连接端口
     */
    private String fileServerPort;
    /**
     * 个人文件服务器SAMBA账号名
     */
    private String sambaAcctName;
    /**
     * 个人文件服务器SAMBA账号密码
     */
    private String sambaAcctPwd;
}
