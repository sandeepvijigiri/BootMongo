package main;

import main.model.Product;
import main.model.TopLevelCountReport;
import main.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BootMongoDB implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    private static final Logger logger = LoggerFactory.getLogger(BootMongoDB.class);

    public void run(String... args) throws Exception {
    	System.out.println("Enter in Run"); 
    	List<Product> name = productService.getContainerUniqueId("9005");
    	System.out.println("name===="+name);
    	List<TopLevelCountReport> availableSkuCustom = productService.getAvailableSkuCustom("9502");
    	System.out.println("result ===="+availableSkuCustom);
        logger.info("result of getName is {}", name);
        }

    public static void main(String[] args) throws Exception {
    	System.out.println("Enter in main");
        SpringApplication.run(BootMongoDB.class, args);
    	
    }
}
