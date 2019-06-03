package com.tigrex.admin.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tigrex.admin.api.bo.SysUserBo;
import com.tigrex.admin.api.po.SysUser;

/**
 * @author linus
 */
public interface ISysUserService extends IService<SysUser> {

    SysUserBo getByAccountName(String account);
}
