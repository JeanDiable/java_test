import java.util.Arrays;
public class fonction2 {
    public static void main(String[] args) {

    /**
     * 我们先来看一个带参数，但没有返回值的方法： public void show(String name){
     * System.out.println(name); } 上面的代码定义了一个 show 方法，带有一个参数 name
     * ，实现输出欢迎消息。调用带参方法与调用无参方法的语法类 似，但在调用时必须传入实际的参数值 对象名.方法名(实参1，实参2……实参n)
     * 
     * 例如： HelloWorld hello = new HelloWorld(); hello.show("Imooc");
     * 
     * 很多时候，我们把定义方法时的参数称为形参，目的是用来定义方法需要传入的参数的个数和类型； 把调用方法时的参数称为实参，是传递给方法真正被处理的值。
     * 
     * 一定不可忽视的问题： 
     * 1、 调用带参方法时，必须保证实参的数量、类型、顺序与形参一一对应 
     * 2、调用方法时，实参不需要指定数据类型
     * 3、方法的参数可以是基本数据类型，如 int、double 等，也可以是引用数据类型，如 String、数组等
     * 4、 当方法参数有多个时，多个参数间以逗号分隔
     */

     // 创建对象，对象名为hello
		fonction2 hello = new fonction2();
        // 调用方法，传入两门课程的成绩
        hello.calcAvg(94, 81);
        
        int[] scores = { 79, 52, 98, 81 };
        // 调用方法，传入成绩数组，并获取成绩的个数
        int count = hello.sort(scores);
        System.out.println("共有" + count + "个成绩信息！");

        // 调用无参的方法
        hello.print();
        // 调用带有一个字符串参数的方法
        hello.print("imooc");
        // 调用带有一个整型参数的方法
        hello.print(18);
	}

	/*
	 * 功能：计算两门课程考试成绩的平均分并输出平均分
	 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
	 */
    public void calcAvg(int score1, int score2){
        int avg = (score1 + score2) / 2;
        System.out.println("平局分是" + avg);
    }

    public int sort(int[] scores) {
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        // 返回数组中元素的个数
        return scores.length;
    }

    /**
     * 问： 什么是方法的重载呢？
     * 
     * 答： 如果同一个类中包含了两个或两个以上方法名相同、方法参数的个数、顺序或类型不同的方法，则称为方法的重载，也可称该方法被重载了。
     * 
     * 判断方法重载的依据：
     * 
     * 1、 必须是在同一个类中
     * 
     * 2、 方法名相同
     * 
     * 3、 方法参数的个数、顺序或类型不同
     * 
     * 4、 与方法的修饰符或返回值没有关系
     */

     public void print() {
        System.out.println("无参的print方法");
    }

    public void print(String name) {
        System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
    }

    public void print(int age) {
        System.out.println("带有一个整型参数的print方法，参数值为：" + age);
    }
}