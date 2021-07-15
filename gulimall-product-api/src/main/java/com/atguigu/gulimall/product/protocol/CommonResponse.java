package com.atguigu.gulimall.product.protocol;


import lombok.Data;

import java.io.Serializable;

/**
 * @author xulinfei
 */
@Data
public class CommonResponse implements Serializable {
    private String msg;
}
