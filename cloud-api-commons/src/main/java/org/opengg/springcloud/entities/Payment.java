package org.opengg.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     *  CREATE TABLE payment(
     * id BIGINT(20) NOT NULL AUTO_INCREMENT,
     * serial VARCHAR(200) DEFAULT '',
     * PRIMARY KEY(id)
     *  )
     */
    private long id;
    private String serial;
}
