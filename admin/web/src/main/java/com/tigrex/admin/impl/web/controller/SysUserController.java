package com.tigrex.admin.impl.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tigrex.admin.impl.po.SysUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 自己
 */
@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Reference(version = "1.0.0", interfaceName = "sysUserService")
    private com.tigrex.admin.impl.service.ISysUserService ISysUserService;

    @RequestMapping(value = "/getSysUserInfo")
    public SysUser getSysUserInfo(){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", 1);
        SysUser sysUser = ISysUserService.getOne(wrapper);
        return sysUser;
    }

}
