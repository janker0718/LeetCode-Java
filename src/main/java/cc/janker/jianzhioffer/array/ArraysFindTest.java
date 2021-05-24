package cc.janker.jianzhioffer.array;
//描述
//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
// 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
// 判断数组中是否含有该整数


// 解题思路
//
//
//        二维数组是有序的，从右上角来看，向左数字递减，向下数字递增。
//
//        因此从右上角开始查找，
//
//        当要查找数字比右上角数字大时，下移；
//        当要查找数字比右上角数字小时，左移；
//        如果出了边界，则说明二维数组中不存在该整数。

public class ArraysFindTest {

    public static void main(String[] args) {
        int [][] array = new int[][]{new int[]{3,4,5},new int[]{7,9,10}};
        boolean b = find(11, array);
        System.out.println(b);

    }

    public static boolean find(int target,int [][] array){
        if (array.length == 0 || array[0].length == 0){
            return false;
        }
        int rows  = array.length;
        int cols = array[0].length;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0){
            if (array[row][col] == target){
                return true;
            }else {
                if (target > array[row][col]){
                    row = row + 1;
                }else {
                    col = col -1;
                }
            }
        }
        return false;
    }
}
