package java_2;

public class Initialtelphone {
    public static void main(String[] args) {
        //无参数构造方法
        Telphone phone = new Telphone();
        //phone.sendMessage();
        phone.screen = 5.0f;
        phone.cpu = 2.0f;
        phone.mem = 2.0f;
        //phone.sendMessage();

        //有参数构造方法
        Telphone phone2 = new Telphone(4.0f,2.0f,2.0f);
    }
    
}