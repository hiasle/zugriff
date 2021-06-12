package at.gv.brz.justiz3.elias.zugriff;

import at.gv.brz.justiz3.elias.zugriff.db.repo.ProtokollierterZugriffRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.Assert;

@SpringBootApplication
@ComponentScan(basePackages = "at.gv.brz.justiz3")
public class ZugriffApplication {

    private static final Logger log = LoggerFactory.getLogger(ZugriffApplication.class);

    @Autowired
    private ProtokollierterZugriffRepository protokollierterZugriffRepository;

    public static void main(String[] args) {
        SpringApplication.run(ZugriffApplication.class, args);
    }

}
