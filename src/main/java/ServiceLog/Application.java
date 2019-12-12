package ServiceLog;

import ServiceLog.Entity.Attendances;
import ServiceLog.Entity.Location;
import ServiceLog.Repository.AttendancesRepository;
import ServiceLog.Repository.LocationRepository;
import ServiceLog.Service.LogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        LogService logService = context.getBean(LogService.class);
        logService.runService();
    }
}
