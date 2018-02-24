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

    public static void main(String[] args) {
        ShardingDatabaseTable shardingData = new ShardingDatabaseTable();
        int baseDababase2 = 4;
        int baseTable2 = 2;
        shardingData.shardingDatabaseTableTwo(baseDababase2,baseTable2 );
        int baseDababase4 = 4;
        int baseTable4 = 4;
//        shardingData.shardingDatabaseTableFour(baseDababase4, baseTable4);
    }

    public void shardingDatabaseTableTwo(int baseDababase, int baseTable){
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


    public void shardingDatabaseTableFour(int baseDababase, int baseTable){

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
