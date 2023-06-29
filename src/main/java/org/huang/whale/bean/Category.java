package org.huang.whale.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * define the category bean
 *
 * @author Boyi Huang
 * @version 1.0.0
 */
@Getter
@Setter
public class Category {

    private Long id;

    private String cateName;

    private Timestamp date;
}
