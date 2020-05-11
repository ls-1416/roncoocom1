package org.sang.service.impl;

import org.sang.dao.SysUserMapper;
import org.sang.entity.SysUser;
import org.sang.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired(required = false)
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getAllSysUser() {
        return sysUserMapper.getAllSysUser();
    }

    @Override
    public List<SysUser> getAllSysUserByMobile(BigInteger mobile) {
        return sysUserMapper.getAllSysUserByMobile(mobile);
    }

    @Override
    public Integer deleteSysUserById(Long id) {
        return sysUserMapper.deleteSysUserById(id);
    }

    @Override
    public int insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int update(SysUser sysUser) {
        return sysUserMapper.update(sysUser);
    }
}
