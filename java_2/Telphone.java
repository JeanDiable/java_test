package java_2;

public class Telphone {
    //属性
    float screen;
    float CPU;
    float Mem;

    //方法
    void call(){
        int var =0;
        System.out.println("打电话" + var );
        //局部变量必须初始化且只能被当前方法调用
    }
    void sendMessage(){
        System.out.println("发短信"+ CPU + screen + Mem);
        //成员变量可以被任一方法调用，且不需要初始化
    }
    /**
     * 不同方法中可以有相同的变量，同一方法不允许
     * 成员变量和局部变量重名时，局部变量优先
     */

     public Telphone(){
         System.out.println(111);
     }

    public Telphone(float newScreen, float newCPU, float newMem) {
        if (newScreen < 3.5f){
            screen = 3.5f;
        }
        screen = newScreen;
        CPU = newCPU;
        Mem = newMem;
     }


}