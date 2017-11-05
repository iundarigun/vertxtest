package br.com.devcave.vertxtest.vertx.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by uri on 05/11/17.
 */
@Entity
@Data
public class Client{
    @Id
    private Long id;
    @Column
    private String name;

}
