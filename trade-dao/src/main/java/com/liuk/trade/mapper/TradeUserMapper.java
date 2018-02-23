package com.liuk.trade.mapper;

import com.liuk.trade.entity.TradeUser;
import com.liuk.trade.entity.TradeUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeUserMapper {
    long countByExample(TradeUserExample example);

    int deleteByExample(TradeUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TradeUser record);

    int insertSelective(TradeUser record);

    List<TradeUser> selectByExample(TradeUserExample example);

    TradeUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TradeUser record, @Param("example") TradeUserExample example);

    int updateByExample(@Param("record") TradeUser record, @Param("example") TradeUserExample example);

    int updateByPrimaryKeySelective(TradeUser record);

    int updateByPrimaryKey(TradeUser record);

    int reduceUserMoney(TradeUser record);

    int addUserMoney(TradeUser record);
}