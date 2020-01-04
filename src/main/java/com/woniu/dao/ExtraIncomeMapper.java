package com.woniu.dao;

import com.woniu.domain.ExtraIncome;
import com.woniu.domain.ExtraIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtraIncomeMapper {
    long countByExample(ExtraIncomeExample example);

    int deleteByExample(ExtraIncomeExample example);

    int deleteByPrimaryKey(Integer extraIncomeId);

    int insert(ExtraIncome record);

    int insertSelective(ExtraIncome record);

    List<ExtraIncome> selectByExample(ExtraIncomeExample example);

    ExtraIncome selectByPrimaryKey(Integer extraIncomeId);

    int updateByExampleSelective(@Param("record") ExtraIncome record, @Param("example") ExtraIncomeExample example);

    int updateByExample(@Param("record") ExtraIncome record, @Param("example") ExtraIncomeExample example);

    int updateByPrimaryKeySelective(ExtraIncome record);

    int updateByPrimaryKey(ExtraIncome record);
}