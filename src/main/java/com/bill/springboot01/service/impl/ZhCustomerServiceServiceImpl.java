package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.ZhCustomerService;
import com.bill.springboot01.mapper.ZhCustomerServiceMapper;
import com.bill.springboot01.service.ZhCustomerServiceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业主服务 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class ZhCustomerServiceServiceImpl extends ServiceImpl<ZhCustomerServiceMapper, ZhCustomerService> implements ZhCustomerServiceService {

}
