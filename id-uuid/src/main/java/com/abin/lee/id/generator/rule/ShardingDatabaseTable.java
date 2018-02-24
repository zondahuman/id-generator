package com.abin.lee.id.generator.rule;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by abin on 2018/2/24 18:47.
 * id-generator
 * com.abin.lee.id.generator.rule
 */
public class ShardingDatabaseTable {


    @Test
    public void test(){
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        int baseTwo = 2;
        for (int temp : list) {
            Integer result = temp % baseTwo;
            System.out.println("baseTwo-----temp=" + temp + " ,result="+result);
        }
        System.out.println("--------------------------------------------------------");
        int baseFour = 4;
        for (int temp : list) {
            Integer result = temp % baseFour;
            System.out.println("baseFour-----temp==" + temp + " ,result="+result);
        }
    }



}
