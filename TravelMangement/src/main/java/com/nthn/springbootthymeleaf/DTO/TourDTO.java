package com.nthn.springbootthymeleaf.DTO;


import lombok.Data;

import java.io.Serializable;

@Data
public class TourDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String name;

    private Integer categoryId;


    /**
     * Số ngày
     */
    private Integer days;


    /**
     * Số đêm
     */
    private Integer night;

    private Integer slots;

    private String departure;

    private String destination;

}