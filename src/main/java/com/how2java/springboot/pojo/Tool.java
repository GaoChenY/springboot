package com.how2java.springboot.pojo;

import lombok.Data;

/**
 * 打开工具信息类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class Tool {
    /*
    "toolName": "打开工具的名称",
    "toolCode": "打开工具的编码",
    "toolPublishGateList": "工具只在特定网关上发布列表"
    */

    /**
     *  打开工具的名称
     */
    private String toolName;
    /**
     * 打开工具的编码
     */
    private String toolCode;
    /**
     * 工具只在特定网关上发布列表
     */
    private String toolPublishGateList;
}
