package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.FcEstate;
import com.bill.springboot01.mapper.FcEstateMapper;
import com.bill.springboot01.service.FcEstateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 楼盘信息 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class FcEstateServiceImpl extends ServiceImpl<FcEstateMapper, FcEstate> implements FcEstateService {

}
