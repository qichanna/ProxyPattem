import java.lang.reflect.InvocationHandler;

/**
 * Created by liqi on 2017/4/30.
 */
public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获得接口数据
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader,classes,handler);
    }
}
