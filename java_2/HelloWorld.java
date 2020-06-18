package java_2;

public class HelloWorld {
    static String className = "JAVA开发一班";

    //静态变量
    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
    static int score2 = 92;

    // 定义静态方法sum，计算成绩总分，并返回总分
    public static int sum() {
        return score1 + score2;
    }

    
    public static void main(String[] args) {

        // 访问静态变量，输出班级名称
        System.out.println(HelloWorld.className);

        // 调用静态方法sum并接收返回值
        int allScore = sum();
        System.out.println("总分：" + allScore);
    }
}