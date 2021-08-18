package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblDbSetting;
import com.bill.springboot01.mapper.TblDbSettingMapper;
import com.bill.springboot01.service.TblDbSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库设置 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblDbSettingServiceImpl extends ServiceImpl<TblDbSettingMapper, TblDbSetting> implements TblDbSettingService {

}
