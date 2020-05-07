package com.how2java.springboot.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.how2java.springboot.util.JsonUtils;
import lombok.Data;

import java.io.Serializable;

@Data
public class BusRequestBean implements Serializable {
    /*
    "sessionId3A": "外部系统的32位UUID",
    "mainAcctId": "主账号ID",
    "mainAcctName": "主账号的登录名称",
    "clientRequestTime": "外部系统调用接口时间，此时间是外部系统本地的时间",
    "ssoPublishList": "工具在哪些特定图形网关上打开",
    "scIp":"使用特定的协议堡垒连接目标服务器",
    "ptype": "协议类型",
    "dbType": "数据库类型",
    */

    /**
     *  外部系统的32位UUID
     */
    private String sessionId3A;
    /**
     * 主账号ID
     */
    private String mainAcctId;
    /**
     * 主账号的登录名称
     */
    private String mainAcctName;
    /**
     * 外部系统调用接口时间，此时间是外部系统本地的时间
     */
    private String clientRequestTime;
    /**
     * 资源设备信息
     */
    private Device device;
    /**
     * 账号相关
     */
    private SubAcct subAcct;
    /**
     * 打开工具信息
     */
    private Tool tool;
    /**
     * 终端信息
     */
    private Terminal terminal;
    /**
     * 个人文件服务器信息
     */
    private FileServer fileServer;
    /**
     * 金库信息
     */
    private GoldInfo goldInfo;
    /*
     * 跳板机服务器信息
     * */
    private StepServer stepServer;

    /*-------------------数据库需要对象------------------*/
    /**
     * 数据库信息
     */
    private SysExtInfo sysExtInfo;


    public static void main(String[] args) {
        BusRequestBean busRequestBean =new BusRequestBean();
        busRequestBean.setSessionId3A("e88a86434469458dbc5be3fb2ee2e6f4");
        busRequestBean.setMainAcctId("10011922");
        busRequestBean.setMainAcctName("yx_wangbb");
        busRequestBean.setClientRequestTime("2020-05-05 05:53:38");
        Device device = new Device();
        device.setDeviceId("132453");
        device.setSeriesId("");
        device.setDeviceIp("10.19.19.15");
        device.setDevicePort("23389");
        device.setDeviceType("2");
        device.setDeviceManufacturerCode("");
        device.setDeviceBelongDomain("10060");
        busRequestBean.setDevice(device);

        SubAcct subAcct = new SubAcct();
        subAcct.setSubAcctId("2465397");
        subAcct.setSubAcctName("aiuap");
        subAcct.setSubAcctPwd("aiuap");
        subAcct.setNdSupperAcct("");
        subAcct.setNdSupperAcctPwd("");
        subAcct.setHostAuthType("");
        subAcct.setPrivateKeyContent("");
        busRequestBean.setSubAcct(subAcct);

        Tool tool = new Tool();
        tool.setToolName("");
        tool.setToolCode("");
        tool.setToolPublishGateList("");
        busRequestBean.setTool(tool);

        Terminal terminal = new Terminal();
        terminal.setClientIp("");
        terminal.setClientMAC("");
        terminal.setClientCpuNum("");
        busRequestBean.setTerminal(terminal);

        FileServer fileServer = new FileServer();
        fileServer.setFileServerIp("");
        fileServer.setFileServerPort("");
        fileServer.setSambaAcctName("");
        fileServer.setSambaAcctPwd("");
        busRequestBean.setFileServer(fileServer);

        GoldInfo goldInfo = new GoldInfo();
        goldInfo.setBankFlag("");
        goldInfo.setBankTriggerType("");
        goldInfo.setBankApproveNum("");
        busRequestBean.setGoldInfo(goldInfo);

        StepServer stepServer = new StepServer();
        stepServer.setStepIp("");
        stepServer.setStepPort("");
        stepServer.setStepUser("");
        stepServer.setStepPwd("");
        busRequestBean.setStepServer(stepServer);

        SysExtInfo sysExtInfo = new SysExtInfo();
        sysExtInfo.setPtype("PROXY");
        sysExtInfo.setDbType("POSTGRESQL");
        sysExtInfo.setDbName("");
        sysExtInfo.setOracleServerName("");
        sysExtInfo.setRootPwd("");
        sysExtInfo.setUacDomain("0");
        sysExtInfo.setDbLoginLink("");
        busRequestBean.setSysExtInfo(sysExtInfo);

        try {
            String json = JsonUtils.beanToJson(busRequestBean);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
