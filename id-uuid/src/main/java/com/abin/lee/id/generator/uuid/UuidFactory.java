package com.abin.lee.id.generator.uuid;

import java.util.UUID;

/**
 * Created by abin on 2018/2/24 15:49.
 * id-generator
 * com.abin.lee.id.generator.uuid
 */
public class UuidFactory {

    public static void main(String[] args) {
        Long result1 = UuidFactory.GuidToInt64();
        System.out.println("result1="+result1);
    }

    /// <summary>
/// 根据GUID获取唯一数字序列
/// </summary>
    public static long GuidToInt64()
    {
        long bytes = UUID.randomUUID().getMostSignificantBits();
        return bytes;
    }

}
