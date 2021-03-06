package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblCompanyRecord;
import com.bill.springboot01.mapper.TblCompanyRecordMapper;
import com.bill.springboot01.service.TblCompanyRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单位名录 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblCompanyRecordServiceImpl extends ServiceImpl<TblCompanyRecordMapper, TblCompanyRecord> implements TblCompanyRecordService {

}
