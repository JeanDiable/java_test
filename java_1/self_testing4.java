package java_1;
import java.util.Arrays;
public class self_testing4 {
    
    //完成 main 方法
    public static void main(String[] args) {
        int[] scores = {89,-23,64,91,119,52,73};
        System.out.println("考试前三名为： ");
        self_testing4 hello = new self_testing4();
        hello.select(scores);
    }
    
    //定义方法完成成绩排序并输出前三名的功能
    public void select (int[] scores){
        Arrays.sort(scores); // 排序
        int num = 0; // 用于统计有效成绩数量
        for (int i = scores.length - 1; i>= 0; i--){
            if(scores[i] < 0 || scores[i] >100){ //判断成绩有效性
                continue;
            }
            num++; //有效成绩数量加一
            if (num > 3){
                break;
            }
            System.out.println(scores[i]);
        }
    }
    
    
    
    
    
    
    
    
    
}