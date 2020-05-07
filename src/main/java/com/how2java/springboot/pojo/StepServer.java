package com.how2java.springboot.pojo;

import lombok.Data;

@Data
public class StepServer {
    /*
    * "stepIp":"跳板服务器IP",
    *"stepPort":"跳板服务器的端口",
    *"stepUser":"跳板服务器账号名",
    *"stepPwd":"跳板服务器账号的密码，此密码需要明文"
    * */

    private String stepIp;
    private String stepPort;
    private String stepUser;
    private String stepPwd;
}
