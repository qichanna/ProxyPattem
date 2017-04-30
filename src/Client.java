import java.lang.reflect.InvocationHandler;

/**
 * Created by liqi on 2017/4/30.
 */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理，以下3句都可以
//        Subject proxy = DynamicProxy.newProxtInstance(subject.getClass().getClassLoader(),new Class[]{Subject.class},handler);
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        //使用具体业务的动态代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
