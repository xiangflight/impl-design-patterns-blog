package chainofresponsibility;

/**
 * 具体处理者1
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version chainofresponsibility
 * @date 2019-04-09 20:38
 */

public class Concretehandler1 extends AbstractHandler{

    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}