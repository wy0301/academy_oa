package com.woniu.dao;

import com.woniu.domain.Emps;
import com.woniu.domain.EmpsExample;
import com.woniu.domain.Roles;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EmpsMapper {
    long countByExample(EmpsExample example);

    int deleteByExample(EmpsExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Emps record);

    int insertSelective(Emps record);

    List<Emps> selectByExample(EmpsExample example);

    Emps selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") Emps record, @Param("example") EmpsExample example);

    int updateByExample(@Param("record") Emps record, @Param("example") EmpsExample example);

    int updateByPrimaryKeySelective(Emps record);

    int updateByPrimaryKey(Emps record);
    
    List<Roles> findRolesByEmpID(Integer eid);
    
    void removeRolesByEid(Integer eid);
    
    void grantRolesByEid(Map map);
}