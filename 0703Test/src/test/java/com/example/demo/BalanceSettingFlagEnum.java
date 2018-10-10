package com.example.demo;

/**
 * Created by wc.jia on 2018/8/4.
 */
public enum BalanceSettingFlagEnum {

    // 1. 开仓冻结
    OPENING_FREEZE(1,"开仓冻结"),

    // 12. 爆仓冻结 或 市价全平冻结（新改后将去除）共用一个位置，叫合约冻结，用户冻结状态从用户表下放到资产表，继续使用第12个位置（futures_user_config --> user_futures_balance [setting_flag]）
    CONTRACT_FREEZE(12,"合约冻结"),
    ;

    private Integer bit;
    private String  descInfo;

    BalanceSettingFlagEnum(Integer bit, String descInfo) {
        this.bit = bit;
        this.descInfo = descInfo;
    }

    public Integer getBit() {
        return bit;
    }

    public String getDescInfo() {
        return descInfo;
    }
}