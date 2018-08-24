import com.Decorator.Pattern.case01.Bird;
import com.Decorator.Pattern.case01.Fish;
import com.Decorator.Pattern.case01.Monkey;
import com.Decorator.Pattern.case01.TheGreatestSage;
import com.Proxy.Pattern.AbstractObject;
import com.Proxy.Pattern.ProxyObject;
import org.junit.Test;

/**
 * 测试结构型模式，共七种：适配器模式、装饰器模式、代理模式、
 *                        外观模式、桥接模式、组合模式、享元模式。
 */
public class TestStructuralPattern {

    /**
     * 适配器模式Adapter.Pattern
     */
    @Test
    public void test01() {}

    /**
     * 装饰器模式Decorator.Pattern.case01
     */
    @Test
    public void test02() {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        //TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }

    /**
     * 代理模式Adapter.Pattern
     */
    @Test
    public void test03() {
        AbstractObject obj = new ProxyObject();
        obj.operation();
        System.out.println();
    }

}
