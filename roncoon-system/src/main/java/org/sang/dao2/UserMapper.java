package org.sang.dao2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.entity.Role;
import org.sang.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    User loaderUserByName(@Param(value = "username") String username);
    List<Role> getUserRolesByUid(Integer id);
}
