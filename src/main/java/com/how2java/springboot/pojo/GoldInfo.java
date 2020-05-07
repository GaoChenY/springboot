package com.how2java.springboot.pojo;

import lombok.Data;

/**
 * 金库信息类
 * @author gcy
 * @date 2020-2-4
 */
@Data
public class GoldInfo {
    /*"bankFlag":"金库类型 1登录类金库 0操作类金库",
    "bankTriggerType":"1金库登录类单次审批有效，2金库登录类时间段审批有效",
    "bankApproveNum":"登录类金库审批编码"*/

    /**
     *  金库类型 1登录类金库 0操作类金库
     */
    private String bankFlag;
    /**
     * 1金库登录类单次审批有效，2金库登录类时间段审批有效
     */
    private String bankTriggerType;
    /**
     * 登录类金库审批编码
     */
    private String bankApproveNum;
}
