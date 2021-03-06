package com.berry.oss.module.dto;

import lombok.Data;

/**
 * Title ServerListDTO
 * Description
 * Copyright (c) 2019
 *
 * @author berry_cooper
 * @version 1.0
 * @date 2019/6/24 12:39
 */
@Data
public class ServerListDTO {

    private String ip;

    private Integer port;

    private Integer capacity;

    private String remark;

    private String createTime;

    private String updateTime;
}
