import com.wy.learning.interf.TestInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weiyin
 * @date 2019-04-17 11:51
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.wy.learning");
		applicationContext.refresh();
		TestInterface testConfig = applicationContext.getBean(TestInterface.class);
		System.out.println(testConfig);
	}
}
