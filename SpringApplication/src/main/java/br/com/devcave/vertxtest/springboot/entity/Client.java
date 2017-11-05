package br.com.devcave.vertxtest.springboot.entity;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

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
