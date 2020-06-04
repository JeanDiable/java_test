public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello world!");
        
        //变量名
        String name = "爱慕课";
        char sex = '男';
        int num = 18;
        double price = 120.5;
        boolean isOK = true;
        System.out.println(name);
        System.out.println(sex);
        System.out.println(num);
        System.out.println(price);
        System.out.println(isOK);
        
        //简单类型转换
        double avg1 = 78.5;
        int rise = 5;
        double avg2 = avg1 + rise;
        System.out.println("考试平均分：" + avg1);
        System.out.println("调整后的平均分：" + avg2);

        //强制类型转换
        double heightAvg1 = 176.2;
        int heightAvg2 = (int) heightAvg1;
        System.out.println(heightAvg1);
        System.out.println(heightAvg2);

        //常量设置
        final char SEX1 = '男';
	      final char SEX2 = '女';
	      System.out.println(SEX1);
	      System.out.println(SEX2);
  }
}