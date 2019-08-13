package com.lemon.api.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-12 17:05:06 创建
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -3351370993315149129L;

    private String username;

    private String password;
}
