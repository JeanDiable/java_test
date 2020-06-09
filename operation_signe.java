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
        boolean a1 = true; // a同意
        boolean b1 = false; // b反对
        boolean c = false; // c反对
        boolean d = true; // d同意
        System.out.println((a1 && b1) + "未通过");
        System.out.println((a1 || b1) + "通过");
        System.out.println((!a1) + "未通过");
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

        int i = 1; // 代表 1 - 5 之间的数字
		// 当变量小于等于 5 时执行循环
		while (i <= 5) {
			// 输出变量的值，并且对变量加 1，以便于进行下次循环条件判断
			System.out.println(i);
            i++;
        }

        int s = 0; // 保存 1-50 之间偶数的和
        int num = 2; // 代表 1-50 之间的偶数
        do {
            s += num;// 实现累加求和
            num = num + 2; // 每执行一次将数值加2，以进行下次循环条件判断
        } while (num <= 50); // 满足数值在 1-50 之间时重复执行循环
        System.out.println("50以内的偶数之和为" + s);

        int su = 0; // 保存不能被3整除的数之和
        // 循环变量 i 初始值为 1 ,每执行一次对变量加 1，只要小于等于 100 就重复执行循环
        for (int i1 = 1; i1 <= 100; i1++) {
            // 变量 i 与 3 进行求模（取余），如果不等于 0 ，则表示不能被 3 整除
            if (i1 % 3 != 0) {
                su = su + i1; // 累加求和
            }
        }

        // 保存累加值
        int summa = 0;
        // 从1循环到10
        for (int i2 = 1; i2 <= 10; i2++) {
            // 每次循环时累加求和
            summa = summa + i2;
            // 判断累加值是否大于20，如果满足条件则退出循环
            if (summa > 20) {
                System.out.print("当前的累加值为:" + summa);
                break;
                // 退出循环

            }
        }

        int somme = 0; // 保存累加值
        for (int i3 = 1; i3 <= 10; i3++) {
            // 如果i为奇数,结束本次循环，进行下一次循环
            if (i3 % 2 != 0) {
                continue;
            }
            somme = somme + i3;
        }
        System.out.print("1到10之间的所有偶数的和为：" + somme);

        System.out.println("打印直角三角形");

        // 外层循环控制行数
        for (int i4 = 1; i4 <= 3; i4++) {
            // 内层循环控制每行的*号数
            // 内层循环变量的最大值和外层循环变量的值相等
            for (int j = 1; j <= i4; j++) {
                System.out.print("*");
            }
            // 每打印完一行后进行换行
            System.out.println();
        }

        int number = 999;
        int count = 0;
        if (num >= 0 && number <= 999999999) {
            while (number != 0) {
                count++;
                number /= 10;
            }
            System.out.println("它是个" + count + "位的数！");
        } else {
            System.out.println("输入有误");
        }
    }
}