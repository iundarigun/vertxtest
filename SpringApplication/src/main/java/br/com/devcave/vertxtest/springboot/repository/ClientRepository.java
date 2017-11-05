package br.com.devcave.vertxtest.springboot.repository;

import br.com.devcave.vertxtest.springboot.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by uri on 05/11/17.
 */
public interface ClientRepository extends JpaRepository<Client,Long>{
}
