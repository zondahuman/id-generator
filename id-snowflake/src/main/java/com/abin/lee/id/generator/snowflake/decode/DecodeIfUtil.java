package com.abin.lee.id.generator.snowflake.decode;

import com.abin.lee.id.generator.snowflake.constants.Constants;

/**
 * Created by abin on 2018/4/11 23:59.
 * id-generator
 * com.abin.lee.id.generator.snowflake.decode
 */
public class DecodeIfUtil {


    /**
     * 反解出snowflake 生成的id.
     *
     * @param snowflakeId snowflake 生成的id.
     * @return the length of 4 long array.
     * <p/>
     * <p>[0]:timestamp</p>
     * <p>[1]:dataCenterId</p>
     * <p>[2]:workerId</p>
     * <p>[3]:seq</p>
     */
    public static long[] decodeSnowFlakeId(long snowflakeId) {

        long timestamp = snowflakeId >>> 0x16;
        long dataCenterId = (snowflakeId & 0x3fffff) >>> 0x11;
        long workerId = (snowflakeId & 0x1ffff) >>> 0xc;
        long seq = snowflakeId & 0xfff;
        long[] longs = new long[4];
        longs[0] = timestamp + Constants.SNOWFLAKE_EPOCH;
        longs[1] = dataCenterId;
        longs[2] = workerId;
        longs[3] = seq;
        return longs;

    }


}
