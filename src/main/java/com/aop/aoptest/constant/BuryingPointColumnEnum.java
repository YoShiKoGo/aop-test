package com.aop.aoptest.constant;/**
 * Created by wxl on 2020/2/9.
 *
 * @className
 * @author wxl
 * @return return
 */

/**
 *
 * @author wxl
 * @create 2020-02-09 6:35
 **/
public enum BuryingPointColumnEnum {
    //默认列名
    COLUMN_DEFAULT("column"),
    //航司入口链接访问次数
    COLUMN_VISIT("visit"),
    //导航也访问次数
    COLUMN_NAVI_VISIT("navigationVisit"),
    //航班查询
    COLUMN_QUERYFLIGHT("queryFlight"),
    //预定
    COLUMN_ORDER("order"),
    //支付
    COLUMN_PAY("pay"),
    //出票
    COLUMN_TICKET("ticket");
    private String column;

    BuryingPointColumnEnum(String column) {
        this.column = column;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }
}
