package org.sang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.sang.entity.SysRole;
import org.sang.entity.SysUser;

import java.util.List;

/**
 * 用户接口
 */
@Mapper
public interface SysUserDao {

    SysUser getSysUserByUsername(String username);

    List<SysRole> listGetSysRoleById(Long id);
}
