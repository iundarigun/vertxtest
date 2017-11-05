package br.com.devcave.vertxtest.vertx.server;

import br.com.devcave.vertxtest.vertx.repository.ClientRepository;
import br.com.devcave.vertxtest.vertx.utils.Pi;
import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.Date;

@Component
@Slf4j
public class ServerVerticle extends AbstractVerticle {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void start() throws Exception {
        super.start();
        Router router = Router.router(vertx);
        router.get("/client/count").handler(ctx -> ctx.response().end(count()));
        router.get("/client/complex-operation").handler(ctx -> ctx.response().end(countWithPi()));

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }

    public String count(){
        Date start = new Date();
        String count = String.valueOf(clientRepository.count());
        Date end = new Date();
        log.info("M=count, t={}", end.getTime() - start.getTime());
        return count;
    }

    public String countWithPi(){
        Date start = new Date();
        BigDecimal pi = Pi.computePi(20000);
        String count = String.valueOf(clientRepository.count());
        Date end = new Date();
        log.info("M=countWithPi, t={}", end.getTime() - start.getTime());
        return count;
    }


}
