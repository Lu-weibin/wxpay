package com.zero.wxpay;

/**
 * 常量
 *
 * @author Zero Lee
 * @date 2017-12-20
 * @time 12:34
 */
public class Const {

    /**
     * APPID
     */
    public static final String APPID = "wx79e850ab659bb39a";

    /**
     * 商户ID
     */
    public static final String MCH_ID = "1241847902";

    /**
     * API秘钥
     */
    public static final String KEY = "2f6a6ac682bb4a14947e8928620db6c6";

    /**
     * 证书地址
     */
    public static final String CERT_PATH = "D://apiclient_cert.p12";

    /**
     * 统一下单回调地址
     */
    public static final String DO_UNIFIEDORDER_NOTIFY_URL= "http://mcp-test.sinowaycredit.com:8089/sinoway_mcpstrade/imateMobileOriginalData";

    /**
     * 交易类型，扫码支付固定为NATIVE
     */
    public static final String TRADE_TYPE= "NATIVE";

}


