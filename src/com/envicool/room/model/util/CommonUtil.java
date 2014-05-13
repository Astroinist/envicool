package com.envicool.room.model.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.DigestUtils;

/**
 * 通用工具类.
 * 
 * @author maleo
 *
 */
public final class CommonUtil {
    
    private static final Log LOG = LogFactory.getLog(CommonUtil.class);

    /**
     * 根据一个字符串生成对应的MD5值. 
     * @param seed
     *      要生成MD5值的字符串
     * @return
     *      seed对应的MD5值
     */
    public static String md5(String seed) {
                
        String id = null;
        try {
            id = DigestUtils.md5DigestAsHex(seed.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            LOG.error("生成" + seed + "的MD5出错", e);
        }
        return id;
    }

}
