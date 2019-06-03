package com.tigrex.admin.impl.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tigrex.admin.api.bo.SysUserBo;
import com.tigrex.admin.api.po.SysUser;
import com.tigrex.admin.api.service.ISysUserService;
import org.springframework.beans.BeanUtils;

/**
 * @author linus
 */
@Service(version = "1.0.0", interfaceClass = ISysUserService.class, interfaceName = "sysUserService")
public class SysUserServiceImpl extends ServiceImpl<BaseMapper<SysUser>, SysUser> implements ISysUserService {

    @Override
    public SysUserBo getByAccountName(String account) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account", account);
        SysUser sysUser = getOne(queryWrapper);
        SysUserBo sysUserBo = new SysUserBo();
        BeanUtils.copyProperties(sysUser, sysUserBo);
        return sysUserBo;
    }
}
