package sn.ucad.gestionCommerciale.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	private static final ApplicationContext context;

	static {
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
		} catch (Throwable th) {
			throw new ExceptionInInitializerError(th);
		}
	}

	public static Object getBean(String name) {
		return context.getBean(name);

	}
}
