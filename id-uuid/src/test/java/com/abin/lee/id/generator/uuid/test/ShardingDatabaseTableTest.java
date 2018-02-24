package com.abin.lee.id.generator.uuid.test;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by abin on 2018/2/24 18:47.
 * id-generator
 * com.abin.lee.id.generator.rule
 */
public class ShardingDatabaseTableTest {

    public static void main(String[] args) {
        ShardingDatabaseTableTest shardingData = new ShardingDatabaseTableTest();
        shardingData.testShardingDatabaseTableTwo();
        shardingData.testShardingDatabaseTableFour();
    }

    @Test
    public void testShardingDatabaseTableTwo(){
        int baseDababase= 2;
        int baseTable = 2;
        System.out.println("-----------baseDababase="+baseDababase+"  ,baseTable="+baseTable+"  ---------------------------------------------");
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i <16 ; i++) {
            list.add(i);
        }
        for (int temp : list) {
            Integer resultDatabase = temp % baseDababase;
//            System.out.println("baseDababase-----temp=" + temp + " ,resultDatabase="+resultDatabase);
            Integer resultTable = (temp / baseDababase) & (baseTable - 1);
//            Integer resultTable = (temp / baseDababase) % baseTable ;
            System.out.println("baseFour-----temp==" + temp + " ,resultDatabase="+resultDatabase + " ,resultTable="+resultTable);
        }
        System.out.println("-----------baseDababase="+baseDababase+"  ,baseTable="+baseTable+"  ---------------------------------------------");
    }
    @Test
    public void testShardingDatabaseTableFour(){
        int baseDababase= 4;
        int baseTable = 4;
        System.out.println("-----------baseDababase="+baseDababase+"  ,baseTable="+baseTable+"  ---------------------------------------------");
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i <16 ; i++) {
            list.add(i);
        }
        for (int temp : list) {
            Integer resultDatabase = temp % baseDababase;
//            System.out.println("baseDababase-----temp=" + temp + " ,resultDatabase="+resultDatabase);
            Integer resultTable = (temp / baseDababase) & (baseTable - 1);
//            Integer resultTable = (temp / baseDababase) % baseTable ;
            System.out.println("baseFour-----temp==" + temp + " ,resultDatabase="+resultDatabase + " ,resultTable="+resultTable);
        }
        System.out.println("-----------baseDababase="+baseDababase+"  ,baseTable="+baseTable+"  ---------------------------------------------");
    }


}
