public class fonction {
    /**
     * 所谓方法，就是用来解决一类问题的代码的有序组合，是一个功能模块。
     * 
     * 一般情况下，定义一个方法的语法是：
     * 访问修饰符 返回值类型 方法名(参数列表){
     *       方法体
     * }
     * 
     * 其中：
     * 1、 访问修饰符：方法允许被访问的权限范围， 可以是 public、protected、private 甚至可以省略 ，其中 public 表示该方法可以被其他任何代码调用，其他几种修饰符的使用在后面章节中会详细讲解滴
     * 
     * 2、 返回值类型：方法返回值的类型，如果方法不返回任何值，则返回值类型指定为 void ；如果方法具有返回值，则需要指定返回值的类型，并且在方法体中使用return 语句返回值
     * 
     * 3、 方法名：定义的方法的名字，必须使用合法的标识符
     * 
     * 4、 参数列表：传递给方法的参数列表，参数可以有多个，多个参数间以逗号隔开，每个参数由参数类型和参数名组成，以空格隔开
     */
    
     // 定义了一个方法名为 print 的方法，实现输出信息功能
    public void print() {
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        
        //在 main 方法中调用 print 方法
        fonction test=new fonction();
        test.print();

        fonction hello = new fonction();
        // 调用方法
        hello.showMyLove();

        double avg = hello.calcAvg();
        System.out.println("平均成绩是 " + avg);
    }

    /**
     * 方法的使用分两步：
     * 
     * 第一步，定义方法: 例如：下面代码定义了一个方法名为 show ，没有参数，且没有返回值的方法，执行的操作为输出 “ welcome to imooc.
     * ” public void show(){ System.out.println(“ welcome to imooc. ”) }
     * 
     * 注意哦：
     * 1、 方法体放在一对大括号中，实现特定的操作
     * 2、 方法名主要在调用这个方法时使用，需要注意命名的规范，一般采用第一个单词首字母小写，其它单词首字母大写的形式
     * 
     * 第二步，调用方法
     * 当需要调用方法执行某个操作时，可以先创建类的对象，然后通过 对象名.方法名();来实现
     * 例如：在下面的代码中，我们创建了一个名为 hello 的对象，然后通过调用该对象的 showMyLove( ) 方法输出信息
     */

     public void showMyLove() {
        System.out.println("我爱慕课网!");
    }

    /**
     * 如果方法不包含参数，但有返回值，我们称为无参带返回值的方法。 例如：下面的代码，定义了一个方法名为 calSum ，无参数，但返回值为 int
     * 类型的方法，执行的操作为计算两数之和，并返回结果 public int calcSum(){ int a = 5; int b = 12; int sum
     * = a + b; return sum; }
     * 
     * 不容忽视的“小陷阱”：
     * 
     * 1、 如果方法的返回类型为 void ，则方法中不能使用 return 返回值！ 
     * 2、 方法的返回值最多只能有一个，不能返回多个值 
     * 3、方法返回值的类型必须兼容，例如，如果返回值类型为 int ，则不能返回 String 型值
     */

    public double calcAvg() {
        double java = 92.5;
        double php = 83.0;
        double avg = (java + php) / 2; // 计算平均值
        // 使用return返回值
        return avg;
    }
}