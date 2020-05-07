package com.how2java.springboot.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.how2java.springboot.util.JsonUtils;
import lombok.Data;

/**
 * 总线服务返回信息类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class BusServiceResponse {
    private static final int BUSSUCCESS = 200;

    private static final int BUSERROR = 500;

    /*"sessionId": "堡垒总线返回的32位UUID，此会话ID是当前请求登陆的会话ID",
    "fortIp": "协议堡垒服务IP",
    "fortDomain": "协议堡垒服务域名，外部系统使用此信息来连接协议堡垒",
    "fortPort": "协议堡垒服务的端口",
    "gateAddr": "图形网关服务IP",
    "gatePort": "图形网关服务PRD连接端口",
    "loginGateUser": "登录图形网关用户",
    "loginGatePwd": "登录图形网关密码",
    "gMsgServerIp": "消息中心的服务IP",
    "gMsgServerPort": "消息中心的服务端口",
    "gfortProxyIp": "登录图形网关的代理服务IP",
    "gfortProxyPort": "登录图形网关的代理服务端口",
    "gfortDomainName": "登录图形网关的代理服务的域名"*/

    /**
     *  访问总线服务返回的提示信息
     */
    private String msg;

    /**
     *  服务调用结果标识 成功：200 失败：500
     */
    private int code;

    /**
     *  堡垒总线返回的32位UUID，此会话ID是当前请求登陆的会话ID
     */
    private String sessionId;
    /**
     * 协议堡垒服务IP
     */
    private String fortIp;
    /**
     * 协议堡垒服务域名，外部系统使用此信息来连接协议堡垒
     */
    private String fortDomain;
    /**
     * 协议堡垒服务的端口
     */
    private String fortPort;
    /**
     * 图形网关服务地址信息
     */
    private String gateAddr;
    /**
     * 图形网关服务连接端口
     */
    private int gatePort;
    /**
     * 登录图形网关用户
     */
    private String loginGateUser;
    /**
     * 登录图形网关密码
     */
    private String loginGatePwd;
    /**
     * 消息中心的服务IP
     */
    private String gMsgServerIp;
    /**
     * 消息中心的服务端口
     */
    private String gMsgServerPort;
    /**
     * 登录图形网关的代理服务IP
     */
    private String gfortProxyIp;
    /**
     * 登录图形网关的代理服务端口
     */
    private String gfortProxyPort;
    /**
     * 登录图形网关的代理服务的域名
     */
    private String gfortDomainName;

    public BusServiceResponse() {
    }

    public BusServiceResponse(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public static void main(String[] args) {
        BusServiceResponse busServiceResponse = new BusServiceResponse();
        busServiceResponse.setMsg("访问总线服务成功");
        busServiceResponse.setCode(BUSSUCCESS);
        busServiceResponse.setSessionId("");
        busServiceResponse.setFortIp("");
        busServiceResponse.setFortDomain("");
        busServiceResponse.setFortPort("");
        busServiceResponse.setGateAddr("");
        busServiceResponse.setGatePort(0);
        busServiceResponse.setLoginGateUser("");
        busServiceResponse.setLoginGatePwd("");
        busServiceResponse.setGMsgServerIp("");
        busServiceResponse.setGMsgServerPort("");
        busServiceResponse.setGfortProxyIp("");
        busServiceResponse.setGfortProxyPort("");
        busServiceResponse.setGfortDomainName("");

        try {
            String json = JsonUtils.beanToJson(busServiceResponse);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
