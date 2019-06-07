import model.Accrual;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.AccountingService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
        AccountingService service = ctx.getBean(AccountingService.class);

        query1(service);
        }

        private static void query1(AccountingService service){
            List<Accrual> all = service.findAccrualAll();
            for (Accrual accrual : all){
                System.out.println("Accrual: " + accrual);
            }
        }

}
