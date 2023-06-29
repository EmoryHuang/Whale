package org.huang.whale.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * define the role bean
 *
 * @author Boyi Huang
 * @version 1.0.0
 */
@Getter
@Setter

public class Role {

    private Long id;

    private String name;

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
