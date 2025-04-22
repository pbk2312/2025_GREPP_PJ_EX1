@SpringBootApplication
@EnableCaching
@ConfigurationPropertiesScan
public class CafeFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CafeFinderApplication.class, args);
    }
  
}
