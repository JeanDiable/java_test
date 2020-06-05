public class operation_signe {
    public static void main(String[] args) {
        //基本计算运算符
        int age1 = 24;
        int age2 = 18;
        int age3 = 36;
        int age4 = 27;
        int sum = age1 + age2 + age3 + age4;
        double avg = sum / 4;
        int minus = age1 - age2;
        int newAge = --age1;

        System.out.println("年龄总和：" + sum);
        System.out.println("平均年龄：" + avg);
        System.out.println("年龄差值：" + minus);
        System.out.println("自减后的年龄：" + newAge);

        // 基本赋值运算符
        int one = 10;
        int two = 20;
        int three = 0;
        three = one + two;
        System.out.println("three = one + two ==>" + three);
        three += one;
        System.out.println("three += one ==>" + three);
        three -= one;
        System.out.println("three -= one ==>" + three);
        three *= one;
        System.out.println("three *= one ==>" + three);
        three /= one;
        System.out.println("three /= one ==>" + three);
        three %= one;
        System.out.println("three %= one ==>" + three);

        // 基本比较运算符
        int a = 16;
        double b = 9.5;
        String str1 = "hello";
        String str2 = "imooc";
        System.out.println("a等于b：" + (a == b));
        System.out.println("a大于b：" + (a > b));
        System.out.println("a小于等于b：" + (a <= b));
        System.out.println("str1等于str2：" + (str1 == str2));

        //基本逻辑运算符
        boolean a = true; // a同意
        boolean b = false; // b反对
        boolean c = false; // c反对
        boolean d = true; // d同意
        System.out.println((a && b) + "未通过");
        System.out.println((a || b) + "通过");
        System.out.println((!a) + "未通过");
        System.out.println((c ^ d) + "通过");

        //三元运算符
        int score = 68;
        String mark = (score >= 60) ? "及格" : "不及格";
        System.out.println("考试成绩如何：" + mark);

        //运算符的优先级
        int m = 5;
        int n = 7;
        int x = ((m * 8) / (n + 2)) % m;
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        System.out.println("x:" + x);
	}
}