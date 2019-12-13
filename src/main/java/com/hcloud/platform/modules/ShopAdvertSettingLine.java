package com.hcloud.platform.modules;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "shop_advert_setting_line")
public class ShopAdvertSettingLine {
    /**
     * 广告设置子表主键
     */
    @Id
    @Column(name = "advertSettingLineCode")
    private String advertSettingLineCode;

    /**
     * 广告设置表主键
     */
    @Column(name = "advertSettingCode")
    private String advertSettingCode;

    /**
     * 子表值，用于存储会员组code或会员code
     */
    @Column(name = "lineValue")
    private String lineValue;

    /**
     * 用于存储会员组code或会员code对应的显示中文
     */
    @Column(name = "lineValueName")
    private String lineValueName;
}