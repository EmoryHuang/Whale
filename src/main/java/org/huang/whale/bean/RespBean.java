package org.huang.whale.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * define the response bean
 *
 * @author Boyi Huang
 * @version 1.0.0
 */
@Getter
@Setter
public class RespBean {

    private String status;

    private String msg;

    public RespBean(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
