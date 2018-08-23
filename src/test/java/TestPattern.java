import com.Abstract.Factory.AbstractFactory;
import com.Abstract.Factory.ComputerEngineer;
import com.Abstract.Factory.IntelFactory;
import com.Builder.Pattern.Builder;
import com.Builder.Pattern.ConcreteBuilder;
import com.Builder.Pattern.Director;
import com.Builder.Pattern.Product;
import com.Builder.Pattern.case01.WelcomeBuilder;
import com.Factory.Method.ExportFactory;
import com.Factory.Method.ExportFile;
import com.Factory.Method.ExportHtmlFactory;
import com.Static.Factory.Method.Login;
import com.Static.Factory.Method.LoginManager;
import org.junit.Test;


public class TestPattern {

    /**
     * 简单工厂模式 Static.Factory.Method
     */
    @Test
    public void test01() {
        String loginType = "password";
        String name = "name";
        String password = "password";
        Login login = LoginManager.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            /**
             * 业务逻辑
             */
        } else {
            /**
             * 业务逻辑
             */
        }
    }

    /**
     * 工厂模式 Factory.Method
     */
    @Test
    public void test02() {
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }

    /**
     * 抽象工厂模式 Abstract.Pattern
     */
    @Test
    public void test03() {
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new IntelFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);
    }

    /**
     * 单例模式 Singleton.pattern
     */
    @Test
    public void test04() { }

    /**
     * 建造模式 Builder.Pattern
     */
    @Test
    public void test05() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }

    /**
     * 建造模式 Builder.Pattern.case01
     */
    @Test
    public void test06() {
        com.Builder.Pattern.case01.Builder  builder = new WelcomeBuilder();
        com.Builder.Pattern.case01.Director director =
                new com.Builder.Pattern.case01.Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");
    }
}
