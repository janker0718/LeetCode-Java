package cc.janker.algorithm;

import java.io.*;

public class AgeStas {
    public static void main(String[] args) throws Exception{
        String str = null;
        String fileName = "/Users/janker/Documents/git_code/LeetCode-Java/src/main/resources/a.test";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName),"UTF-8");
        long start = System.currentTimeMillis();
        BufferedReader bf = new BufferedReader(isr);
        int total = 0;
        int data[] = new int[200];
        while((str=bf.readLine())!= null){
            int age = Integer.valueOf(str);
            data[age] ++;
            total++;
        }
        System.out.println("总共数据大小有："+total);
        for (int i = 0; i < 200; i++) {
            System.out.println(i+":"+data[i]);
        }
        System.out.println("总耗时："+ (System.currentTimeMillis() - start)+"ms");

    }
}
