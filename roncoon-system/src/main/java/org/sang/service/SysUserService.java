package org.sang.service;

import org.sang.dao.SysUserMapper;
import org.sang.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

public interface SysUserService{


    List<SysUser> getAllSysUser();
    List<SysUser> getAllSysUserByMobile(BigInteger mobile);
    Integer deleteSysUserById(Long id);
    int insert(SysUser sysUser);
    int update(SysUser sysUser);
}
