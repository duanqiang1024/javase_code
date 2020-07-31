package com.itheima_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ProperiesTest {
    public static void main(String[] args) throws IOException {
        //从文件中读取数据到Properties集合，用load()方法实现
        Properties prop = new Properties();
        FileReader fr = new FileReader("myOtherStream\\game.txt");
        prop.load(fr);
        fr.close();

        //通过Properties 集合获取到玩游戏的次数
        String count = prop.getProperty("COUNT");
        int number = Integer.parseInt(count);
        //判断是否到了3次
        if (number >= 3) {
            //如果到了，给出提示，游戏试玩已经结束，想玩请充值www.hillstone.com
            System.out.println("游戏试玩已经结束，想玩请充值www.hillstone.com");

        } else {
            //玩游戏
            GuessNumber.start();
            //次数 +1 ，重新写文件，用Properties的Store()方法实现
            number++;
            prop.setProperty("COUNT", String.valueOf(number));
            FileWriter fw = new FileWriter("myOtherStream\\game.txt");
            prop.store(fw, null);
            fw.close();

        }
    }
}
