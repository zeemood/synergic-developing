package com.github.zeemood.wechat.common.config.mobileapp;

import com.github.zeemood.wechat.common.config.IWechatLoginProperties;
import com.github.zeemood.wechat.common.config.IWechatPayProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 移动app的配置
 *
 * @author zeemoo
 * @date 2019/4/29
 */
@Data
@ConfigurationProperties("zeemoo.wechat.mobile")
public class MobileAppProperties implements IWechatLoginProperties, IWechatPayProperties {
    /**
     * 应用id
     */
    private String appid;
    /**
     * 密钥
     */
    private String appSecret;
    /**
     * 登录回调地址,移动应用可以忽略，没有授权域的限制
     */
    private String loginCallbackUrl;
    /**
     * 商户号
     */
    private String mchId;
    /**
     * 支付密钥
     */
    private String payKey;
    /**
     * 支付回调地址
     */
    private String payCallbackUrl;

    /**
     * app在应用市场的名字
     */
    private String appName;

    /**
     * 退款回调地址
     */
    private String refundNotifyUrl;

    /**
     * e
     * 退款证书地址
     */
    private String certificatePath;

}
