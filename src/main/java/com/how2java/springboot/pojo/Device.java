package com.how2java.springboot.pojo;

import lombok.Data;

/**
 * 资源设备信息类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class Device {
    /*"deviceId": "资源设备ID",
    "seriesId": "资源归属系列ID",
    "deviceIp": "资源设备IP",
    "devicePort": "资源设备访问端口",
    "deviceType": "资源类型2主机3数据库4网络设备5安全设备6大数据环境设备",
    "deviceManufacturerCode": "资源厂商编码比如DB100",
    "deviceBelongDomain":"资源归属哪个网络域ID"*/

    /**
     *  资源设备ID
     */
    private String deviceId;
    /**
     * 资源归属系列ID
     */
    private String seriesId;
    /**
     * 资源设备IP
     */
    private String deviceIp;
    /**
     * 资源设备访问端口
     */
    private String devicePort;
    /**
     * 资源类型2主机3数据库4网络设备5安全设备6大数据环境设备
     */
    private String deviceType;
    /**
     * 资源厂商编码比如DB100
     */
    private String deviceManufacturerCode;
    /**
     * 资源归属哪个网络域ID
     */
    private String deviceBelongDomain;
}
