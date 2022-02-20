package example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIntegrationApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/cafeDemo-xml.xml", TestSpringIntegrationApplication.class);

		Cafe cafe = context.getBean("cafe", Cafe.class);

		Order order = new Order(1);
		order.addItem(DrinkType.ESPRESSO, 1, false);

		cafe.placeOrder(order);
		context.close();

	}

}
