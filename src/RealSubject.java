/**
 * Created by liqi on 2017/4/30.
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("do something!------------>" + str);
    }
}
