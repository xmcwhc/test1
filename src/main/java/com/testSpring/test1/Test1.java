package com.testSpring.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.Spring.testInject.Knight;

public class Test1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Knight knight =context.getBean(Knight.class);
		knight.embarkQuest();
		context.close();
		//memConfig.load(BaseConfigFactory.class.getClassLoader().getResourceAsStream(BASE_FILE_NAME_MEMCACHED + PREFIX_FILE_NAME));
		/*String path2 = Test1.class.getClassLoader().getResourceAsStream("spring.xml"); 
		System.out.println(path2);
		System.out.println(System.getProperty("user.dir"));
		System.out.println("classpath:");*/
	}
}
