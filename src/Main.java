import test1.Main1;
import test2.Main2;
import test3.Main3;
import test4.Main4;
import util.FileUtil;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtil fileUtil=new FileUtil();
        Main1 m1= new Main1();
        Main2 m2= new Main2();
        Main3 m3= new Main3();
        Main4 m4= new Main4();
        Scanner in =new Scanner(System.in);
        System.out.println("1.主程序-子程序软件体系结构");
        System.out.println("2.面向对象软件体系结构");
        System.out.println("3.事件系统软件体系结构");
        System.out.println("4.管道-过滤软件体系结构");
        System.out.print("请选择：");
        int x =in.nextInt();
        if(x==1){
            m1.main1();
            System.out.println("转换后的文本：");
            String filePathA="E:\\output.txt";
            String dbFileContentA=fileUtil.dbFileContent(filePathA);
            System.out.println(dbFileContentA);
        } else if (x==2) {
            m2.main2();
            System.out.println("转换后的文本：");
            String filePathA="E:\\output.txt";
            String dbFileContentA=fileUtil.dbFileContent(filePathA);
            System.out.println(dbFileContentA);
        } else if (x==3) {
            m3.main3();
            System.out.println("转换后的文本：");
            String filePathA="E:\\output.txt";
            String dbFileContentA=fileUtil.dbFileContent(filePathA);
            System.out.println(dbFileContentA);
        } else if (x==4) {
            m4.main4();
            System.out.println("转换后的文本：");
            String filePathA="E:\\output.txt";
            String dbFileContentA=fileUtil.dbFileContent(filePathA);
            System.out.println(dbFileContentA);
        }

    }
}
