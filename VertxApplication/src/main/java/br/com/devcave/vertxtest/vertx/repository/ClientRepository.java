package br.com.devcave.vertxtest.vertx.repository;

import br.com.devcave.vertxtest.vertx.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by uri on 05/11/17.
 */
public interface ClientRepository extends JpaRepository<Client,Long>{
}
