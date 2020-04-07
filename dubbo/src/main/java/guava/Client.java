package guava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"client.xml"});
        IProcessData processData = context.getBean("processData", IProcessData.class);
        for(int i=0;i<100;i++){
            System.out.println(processData.deal("121212"));
        }
    }

}
