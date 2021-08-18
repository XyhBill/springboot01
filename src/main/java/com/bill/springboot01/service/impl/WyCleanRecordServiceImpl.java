package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.WyCleanRecord;
import com.bill.springboot01.mapper.WyCleanRecordMapper;
import com.bill.springboot01.service.WyCleanRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 清洁记录 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class WyCleanRecordServiceImpl extends ServiceImpl<WyCleanRecordMapper, WyCleanRecord> implements WyCleanRecordService {

}
