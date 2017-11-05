package br.com.devcave.vertxtest.springboot.rest;

import br.com.devcave.vertxtest.springboot.repository.ClientRepository;
import br.com.devcave.vertxtest.springboot.utils.Pi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/client")
@Slf4j
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/count")
    public Long count(){
        Date start = new Date();
        long count = clientRepository.count();
        Date end = new Date();
        log.info("M=count, t={}", end.getTime() - start.getTime());
        return count;
    }

    @GetMapping("/complex-operation")
    public Long countWithPi(){
        Date start = new Date();
        BigDecimal pi = Pi.computePi(20000);
        long count = clientRepository.count();
        Date end = new Date();
        log.info("M=countWithPi, t={}", end.getTime() - start.getTime());
        return count;
    }
}
