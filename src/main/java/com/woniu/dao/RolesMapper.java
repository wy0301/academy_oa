package com.woniu.dao;

import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.domain.RolesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RolesMapper {
    long countByExample(RolesExample example);

    int deleteByExample(RolesExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByExample(RolesExample example);

    Roles selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
    
    void insertr_p(Map<String, Integer> map);
    
    List<Permissions> selectPermissionByRid(Integer rid);
    
    void revokePermissionsFromRoleByRid(Integer rid);
}