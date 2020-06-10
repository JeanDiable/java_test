import java.util.Scanner;
public class self_testing1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //创建Scanner对象
        //println在输出时会换行，print不会
        System.out.print("请输入考试成绩信息:");
        // 变量保存成绩
        int score = input.nextInt(); 
        // 变量保存加分次数
        int count = 0;
        //打印输出加分前成绩 
        System.out.println(score);
        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        while(score < 60){
            score++;
            count++;
        }
        //打印输出加分后成绩，以及加分次数
        System.out.println(score);
        System.out.println(count);


        /*实现接收三个班级没班四名学生的成绩并分别计算平均分 */

        double sum = 0;
        double avg = 0;
        for (int classNum = 3; classNum >=1 ; classNum-- ){
            System.out.println("***请输入第" + (4-classNum)+ "个班级的成绩***");
            sum = 0;
            for (int stuNum = 4; stuNum >=1 ; stuNum--){
                Scanner input2 = new Scanner(System.in);
                System.out.print("请输入第" + (5-stuNum) + "学生的成绩");
                sum += input2.nextInt();
            }
            avg = sum / 4;
            System.out.println("第" + (4-classNum) + "个班级的平均分为" + avg);
        }
        
        











    }
}