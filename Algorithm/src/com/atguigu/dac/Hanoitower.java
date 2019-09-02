package com.atguigu.dac;

public class Hanoitower {

    public static void main(String[] args) {
        hanoitower(5, 'A', 'B', 'C');
    }


    /**
     * 汉诺塔问题
     *
     * @param num 盘子个数
     * @param a 起始位置
     * @param b 辅助塔
     * @param c 终点位置
     */
    public static void hanoitower(int num, char a, char b, char c) {
        //如果只有一个盘 直接就可以从from移动到to位置 无需辅助塔
        if (num == 1) {
            System.out.println("第1个盘从" + a + "->" + c);
        } else {
            //1.先把最上面的所有盘A->B 移动过程中使用到c
            hanoitower(num - 1, a, c, b);
            //2.把最下面的盘A->C
            System.out.println("第" + num + "个盘从" + a + "->" + c);
            //3.把B塔的所有盘从B->C, 移动过程使用到a
            hanoitower(num - 1, b, a, c);
        }
    }

}
