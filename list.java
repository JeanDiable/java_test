import java.util.Arrays;
public class list {
    public static void main(String[] args){

        // 定义一个数组，保存五名学生的成绩
        int[] scores = { 78, 93, 97, 84, 63 };
        // 输出数组中的第二个成绩
        System.out.println("数组中的第2个成绩为：" + scores[1]);

        // 定义一个长度为5的字符串数组，保存考试科目信息
        String[] subjects = new String[5];
        // 分别为数组中的元素赋值
        subjects[0] = "Oracle";
        subjects[1] = "PHP";
        subjects[2] = "Linux";
        subjects[3] = "Java";
        subjects[4] = "HTML";
        System.out.println("数组中第4个科目为：" + subjects[3]);

        /*
         * 1、 声明数组 语法： 数据类型[ ] 数组名； 或者 数据类型 数组名[ ]； 其中，数组名可以是任意合法的变量名
         * 
         * 2 分配空间  简单地说，就是指定数组中最多可存储多少个元素
         * 语法： 数组名 = new 数据类型 [ 数组长度 ]
         * 其中，数组长度就是数组中能存放元素的个数
         */

         // 定义一个长度为 3 的字符串数组，并赋值初始值
        String[] hobbys = { "sports", "game", "movie" };
        System.out.println("循环输出数组中元素的值：");

        // 使用循环遍历数组中的元素
        for (int i = 0; i < hobbys.length; i++) {
            System.out.println(hobbys[i]);
        }



        // 定义一个整型数组，并赋初值
        int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };

        int max = nums[0]; // 假定最大值为数组中的第一个元素
        int min = nums[0]; // 假定最小值为数组中的第一个元素
        double sum = 0;// 累加值
        double avg = 0;// 平均值

        for (int i = 0; i < nums.length; i++) { // 循环遍历数组中的元素
            // 如果当前值大于max，则替换max的值
            if (nums[i] > max) {
                max = nums[i];
            }
            // 如果当前值小于min，则替换min的值
            if (nums[i] < min) {
                min = nums[i];
            }
            // 累加求和
            sum += nums[i];
        }
        // 求平均值
        avg = sum / nums.length;

        System.out.println("数组中的最大值：" + max);
        System.out.println("数组中的最小值：" + min);
        System.out.println("数组中的平均值：" + avg);


        // 定义一个字符串数组
        String[] hobbies = { "sports", "game", "movie" };

        // 使用Arrays类的sort()方法对数组进行排序
        Arrays.sort(hobbies);

        // 使用Arrays类的toStrin()方法将数组转换为字符串并输出
        System.out.println(Arrays.toString(hobbies));


        // 定义一个整型数组，保存成绩信息
        int[] scores1 = { 89, 72, 64, 58, 93 };

        // 对Arrays类对数组进行排序
        Arrays.sort(scores1);

        // 使用foreach遍历输出数组中的元素
        //类似python的for循环
        for (int score : scores1) {
            System.out.println(score);
        }


        // 定义两行三列的二维数组并赋值
        String[][] names = { { "tom", "jack", "mike" }, { "zhangsan", "lisi", "wangwu" } };

        // 通过二重循环输出二维数组中元素的值
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
            System.out.println(); // 实现换行
        }


    }
}