package nunes.luciano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nunes.luciano.services.S3Service;

@SpringBootApplication
public class AppGestaoPedidosApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(AppGestaoPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("D:\\Arquivos importantes\\projeto-help-services\\imagens\\iphone6.png");
		
	}
}
