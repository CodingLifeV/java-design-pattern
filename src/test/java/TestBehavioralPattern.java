import com.Observer.Pattern.case01.ConcreteObserver;
import com.Observer.Pattern.case01.ConcreteSubject;
import com.Observer.Pattern.case01.Observer;
import com.Strategy.Pattern.case01.AdvancedMemberStrategy;
import com.Strategy.Pattern.case01.MemberStrategy;
import com.Strategy.Pattern.case01.Price;
import org.junit.Test;

public class TestBehavioralPattern {
    /**
     * 观察者模式Observer.Pattern
     */
    @Test
    public void test01() {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }

    /**
     * 策略模式Strategy.Pattern
     */
    @Test
    public void test02() {
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
