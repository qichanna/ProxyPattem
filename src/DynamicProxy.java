import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by liqi on 2017/4/30.
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        //寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
