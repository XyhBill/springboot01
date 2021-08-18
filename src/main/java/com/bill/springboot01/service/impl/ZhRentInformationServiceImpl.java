package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.ZhRentInformation;
import com.bill.springboot01.mapper.ZhRentInformationMapper;
import com.bill.springboot01.service.ZhRentInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户信息 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class ZhRentInformationServiceImpl extends ServiceImpl<ZhRentInformationMapper, ZhRentInformation> implements ZhRentInformationService {

}
