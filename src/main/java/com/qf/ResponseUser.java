package com.qf;

import lombok.Data;

import java.util.List;


/**
 * Created by 54110 on 2019-09-24.
 */
@Data
public class ResponseUser<T> {

    private List<T> list;;
    private Long total;

}
