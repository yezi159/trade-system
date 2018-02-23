package com.liuk.trade.mapper;

import com.liuk.trade.entity.TradeOrder;
import com.liuk.trade.entity.TradeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeOrderMapper {
    long countByExample(TradeOrderExample example);

    int deleteByExample(TradeOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TradeOrder record);

    int insertSelective(TradeOrder record);

    List<TradeOrder> selectByExample(TradeOrderExample example);

    TradeOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") TradeOrder record, @Param("example") TradeOrderExample example);

    int updateByExample(@Param("record") TradeOrder record, @Param("example") TradeOrderExample example);

    int updateByPrimaryKeySelective(TradeOrder record);

    int updateByPrimaryKey(TradeOrder record);
}