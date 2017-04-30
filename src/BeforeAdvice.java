/**
 * Created by liqi on 2017/4/30.
 */
public class BeforeAdvice implements IAdvice{
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
