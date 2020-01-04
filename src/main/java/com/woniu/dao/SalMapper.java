package com.woniu.dao;

import com.woniu.domain.Sal;
import com.woniu.domain.SalExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SalMapper {
    long countByExample(SalExample example);
 
    int deleteByExample(SalExample example);

    int deleteByPrimaryKey(Integer salId);

    int insert(Sal record);

    int insertSelective(Sal record);

    List<Sal> selectByExample(SalExample example);

    Sal selectByPrimaryKey(Integer salId);

    int updateByExampleSelective(@Param("record") Sal record, @Param("example") SalExample example);

    int updateByExample(@Param("record") Sal record, @Param("example") SalExample example);

    int updateByPrimaryKeySelective(Sal record);

    int updateByPrimaryKey(Sal record);
    
    List<Sal> findSalToEmpToDept(Map map);
}