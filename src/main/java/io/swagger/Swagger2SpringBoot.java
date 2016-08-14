package io.swagger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "io.swagger")
public class Swagger2SpringBoot implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... arg0) throws Exception {


        try
        {
	        System.out.println("Creating table contracts");

	        jdbcTemplate.execute("DROP TABLE contracts IF EXISTS");
 
	        jdbcTemplate.execute("CREATE TABLE contracts(" +
				                "contractId SERIAL, " +
				                "contractName VARCHAR(255)," +
				                "businessNumber VARCHAR(50)," +
				                "auctionAccessNumber VARCHAR(50)," +
				                "contractActivationDate date," +
				                "isBuyer BOOLEAN," +
				                "isSeller BOOLEAN)");                                                 
	    }
	    catch ( Exception e )
	    {
                System.out.println("run Exception: " + e);
	    }


		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new ExitException();
		}
	}

	public static void main(String[] args) throws Exception {
		new SpringApplication(Swagger2SpringBoot.class).run(args);
	}

	class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}

	}
}