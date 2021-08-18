package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.ZhCustomer;
import com.bill.springboot01.mapper.ZhCustomerMapper;
import com.bill.springboot01.service.ZhCustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业主信息表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class ZhCustomerServiceImpl extends ServiceImpl<ZhCustomerMapper, ZhCustomer> implements ZhCustomerService {

}
