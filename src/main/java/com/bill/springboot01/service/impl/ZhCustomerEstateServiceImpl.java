package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.ZhCustomerEstate;
import com.bill.springboot01.mapper.ZhCustomerEstateMapper;
import com.bill.springboot01.service.ZhCustomerEstateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业主房产对照表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class ZhCustomerEstateServiceImpl extends ServiceImpl<ZhCustomerEstateMapper, ZhCustomerEstate> implements ZhCustomerEstateService {

}
