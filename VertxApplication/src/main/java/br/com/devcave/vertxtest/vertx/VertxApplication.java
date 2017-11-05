package br.com.devcave.vertxtest.vertx;

import br.com.devcave.vertxtest.vertx.server.ServerVerticle;
import io.vertx.core.Vertx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class VertxApplication {

	@Autowired
	private ServerVerticle serverVerticle;

	public static void main(String[] args) {
		SpringApplication.run(VertxApplication.class, args);
	}

	@PostConstruct
	public void deployVerticle() {
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(serverVerticle);
	}
}
