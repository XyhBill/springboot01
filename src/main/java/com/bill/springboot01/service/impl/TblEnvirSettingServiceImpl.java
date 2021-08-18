package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblEnvirSetting;
import com.bill.springboot01.mapper.TblEnvirSettingMapper;
import com.bill.springboot01.service.TblEnvirSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 环境配置 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblEnvirSettingServiceImpl extends ServiceImpl<TblEnvirSettingMapper, TblEnvirSetting> implements TblEnvirSettingService {

}
