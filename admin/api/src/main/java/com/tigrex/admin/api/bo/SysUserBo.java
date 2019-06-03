package com.tigrex.admin.api.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author linus
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserBo {

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;
}
