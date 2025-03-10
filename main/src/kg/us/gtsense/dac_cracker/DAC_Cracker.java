package kg.us.gtsense.dac_cracker;

import com.sun.tools.javac.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DAC_Cracker {
    public static void main(String[] args) {
        // 显示欢迎信息
        System.out.println("███████╗██╗   ██╗ ██████╗██╗  ██╗     ██████╗  █████╗  ██████╗\n" +
                "██╔════╝██║   ██║██╔════╝██║ ██╔╝     ██╔══██╗██╔══██╗██╔════╝\n" +
                "█████╗  ██║   ██║██║     █████╔╝█████╗██║  ██║███████║██║     \n" +
                "██╔══╝  ██║   ██║██║     ██╔═██╗╚════╝██║  ██║██╔══██║██║     \n" +
                "██║     ╚██████╔╝╚██████╗██║  ██╗     ██████╔╝██║  ██║╚██████╗\n" +
                "╚═╝      ╚═════╝  ╚═════╝╚═╝  ╚═╝     ╚═════╝ ╚═╝  ╚═╝ ╚═════╝\n");
        System.out.println("欢迎使用去你的次元反作弊");
        System.out.println("**版本：beta 1.1**");
        System.out.println("**作者：GTSense**");
        System.out.println("重要！！！");
        System.out.println("请将本程序放进.minecraft/内！！！");
        System.out.println("再运行本程序！！！\n");

        System.out.println("按回车键继续...");

        // 等待用户按下回车键
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 显示进度条
        System.out.print("正在尝试破解: [");
        for (double i = 0; i <= 20; i += 0.2) { // 修改循环范围为0到20
            System.out.print("\r"); // 回车到行首
            System.out.print("破解进度: [");
            for (double j = 0; j < i; j++) {
                System.out.print("#"); // 打印已完成的部分
            }
            for (double j = i; j < 20; j++) {
                System.out.print(" "); // 打印未完成的部分，用于对齐
            }
            System.out.print("] "); // 打印进度条的结束部分
            System.out.printf("%.1f%%", (i * 5.0)); // 打印当前进度百分比
            try {
                Thread.sleep(200); // 每秒更新一次进度条
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n破解完成!");

        System.out.print("正在尝试注入: [");
        for (double i = 0; i <= 20; i += 0.2) { // 修改循环范围为0到20
            System.out.print("\r"); // 回车到行首
            System.out.print("正在注入: [");
            for (double j = 0; j < i; j++) {
                System.out.print("#"); // 打印已完成的部分
            }
            for (double j = i; j < 20; j++) {
                System.out.print(" "); // 打印未完成的部分，用于对齐
            }
            System.out.print("] "); // 打印进度条的结束部分
            System.out.printf("%.1f%%", (i * 5.0)); // 打印当前进度百分比
            try {
                Thread.sleep(100); // 每秒更新一次进度条
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n注入完成!");

        System.out.print("正在测试: [");
        for (double i = 0; i <= 20; i += 0.2) { // 修改循环范围为0到20
            System.out.print("\r"); // 回车到行首
            System.out.print("正在测试: [");
            for (double j = 0; j < i; j++) {
                System.out.print("#"); // 打印已完成的部分
            }
            for (double j = i; j < 20; j++) {
                System.out.print(" "); // 打印未完成的部分，用于对齐
            }
            System.out.print("] "); // 打印进度条的结束部分
            System.out.printf("%.1f%%", (i * 5.0)); // 打印当前进度百分比
            try {
                Thread.sleep(10); // 每秒更新一次进度条
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n测试完成!");

        // 加载图片（从资源文件中加载）
        BufferedImage image = null;
        try {
            // 使用ClassLoader加载资源文件
            image = ImageIO.read(Main.class.getResource("/DimensionAntiCheatLoadingImg.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("无法加载图片，请检查资源路径是否正确！");
            return;
        }

        // 创建一个JFrame窗口
        JFrame frame = new JFrame("图片显示");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(image.getWidth(), image.getHeight());
        frame.setUndecorated(true); // 设置为无边框窗口
        frame.setAlwaysOnTop(true); // 窗口始终置顶（可选）
        frame.setLocationRelativeTo(null); // 窗口居中显示

        // 创建一个JLabel来显示图片
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);

        // 显示窗口
        frame.setVisible(true);

        // 10秒后关闭窗口
        try {
            Thread.sleep(10000); // 10秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        frame.dispose(); // 关闭窗口

        // 打开网页
        try {
            Desktop.getDesktop().browse(new URI("https://www.bilibili.com/video/BV1GJ411x7h7?t=0.0"));
        } catch (IOException | URISyntaxException e) {
            System.out.println("破解失败");
            e.printStackTrace();
        }
    }
}