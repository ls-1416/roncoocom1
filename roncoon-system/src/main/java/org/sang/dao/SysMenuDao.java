package org.sang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.sang.entity.Menu;

import java.util.List;

/**
 *资源接口
 */
@Mapper
public interface SysMenuDao {

    List<Menu> listSysmenuBySysRole();
}
