package com.abin.lee.id.generator.snowflake.test;

import com.abin.lee.id.generator.snowflake.decode.DecodeIfUtil;
import com.abin.lee.id.generator.snowflake.util.SnowflakeIdWorker;
import com.alibaba.druid.support.json.JSONUtils;

/**
 * Created by abin on 2018/4/12 0:05.
 * id-generator
 * com.abin.lee.id.generator.snowflake.test
 */
public class EncodeIdTest {

    public static void main(String[] args) {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(5, 8);
        long id = idWorker.nextId();
        System.out.println(Long.toBinaryString(id));
        System.out.println(id);

        long[] result = DecodeIfUtil.decodeSnowFlakeIds(id);
        System.out.println("result=" + JSONUtils.toJSONString(result));
    }

}
