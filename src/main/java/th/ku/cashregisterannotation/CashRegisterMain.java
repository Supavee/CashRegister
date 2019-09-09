package th.ku.cashregisterannotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CashRegisterMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config-annotation.xml");
        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(100);
        register.recordPurchase(50);
        System.out.println(register.getTotal());
    }
}
