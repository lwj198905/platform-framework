package com.platform.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * ID 生成工具类<br>
 *
 * @author admin
 * @date 2017年11月18日 下午13:13:23
 */
public class IdUtil {
    /**
     * 主要功能:生成流水号 yyyyMMddHHmmssSSS + 3位随机数
     * 注意事项:无
     *
     * @return 流水号
     */
    public static String createIdByDate() {
        // 精确到毫秒
        SimpleDateFormat fmt = new SimpleDateFormat("(yyyyMMddHHmmssSSS)");
        String suffix = fmt.format(new Date());
        suffix = suffix + "-" + Math.round((Math.random() * 100000));
        return suffix;
    }

    /**
     * 主要功能:生成uuid
     * 注意事项:无
     *
     * @return uuid 32 位
     */
    public static String createIdbyUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
