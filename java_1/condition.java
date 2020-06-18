package java_1;
public class condition {
    public static void main(String[] args) {
        
        //基础if语句
        int one = 20;
        if (one % 2 == 0) {
            System.out.println("one是偶数");
        }

        //if……else语句
        int age = 25;
        if (age >= 18) {
            System.out.println("成年");
        } else {
            System.out.println("未成年");
        }

        // 多重判断
        if (age >= 60) {
            System.out.println("老年");
        } else if (40 <= age && 60 > age) {
            System.out.println("中年");
        } else if (18 <= age && 40 > age) {
            System.out.println("少年");
        } else {
            System.out.println("童年");
        }

        //嵌套条件
        int score = 94;
        String sex = "女";
        if (score > 80) {
            if (sex.equals("女")) {
                System.out.println("进入女子组决赛");
            } else {
                System.out.println("进入男子组决赛");
            }
        } else {
            System.out.println("未进入决赛");
        }

        //switch语句
        char today = '日';
        switch (today) {
            case '一':
            case '三':
            case '五':
                System.out.println("吃包子");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println("chi youtiao");
                break;
            default:
                System.out.println("吃主席套餐");
        }
    }
}