package com.gumoxi.gumoximall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gumoxi.gumoximall.common.utils.PageUtils;
import com.gumoxi.gumoximall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author lishuangyang
 * @email 2522484379@qq.com
 * @date 2020-04-15 13:41:31
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

