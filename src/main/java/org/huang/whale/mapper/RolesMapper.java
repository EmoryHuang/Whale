package org.huang.whale.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.huang.whale.bean.Role;

import java.util.List;

/**
 * create roles mapper interface
 *
 * @author Boyi Huang
 * @version 1.0.0
 */
@Mapper
public interface RolesMapper {

    int addRoles(@Param("roles") String[] roles, @Param("uid") Long uid);

    List<Role> getRolesByUid(Long uid);
}
