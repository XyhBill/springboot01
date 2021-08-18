package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblMessageCharge;
import com.bill.springboot01.mapper.TblMessageChargeMapper;
import com.bill.springboot01.service.TblMessageChargeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信充值单 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblMessageChargeServiceImpl extends ServiceImpl<TblMessageChargeMapper, TblMessageCharge> implements TblMessageChargeService {

}
