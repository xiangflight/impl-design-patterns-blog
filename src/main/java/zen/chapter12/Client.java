package zen.chapter12;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 7:52 下午
 */

public class Client {

    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        ISubject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Finish");
    }

}
