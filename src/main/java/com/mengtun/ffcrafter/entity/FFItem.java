package com.mengtun.ffcrafter.entity;


import java.io.Serializable;

import lombok.Data;

/**
 * ff_item
 * @author 
 */
@Data
public class FFItem implements Serializable {

    private Integer itemId;

    private String itemName;

    private Integer itemCanhq;

    private String itemIcon;

    private static final long serialVersionUID = 1L;
}