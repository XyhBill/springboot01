package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblUserRecord;
import com.bill.springboot01.mapper.TblUserRecordMapper;
import com.bill.springboot01.service.TblUserRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户档案 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblUserRecordServiceImpl extends ServiceImpl<TblUserRecordMapper, TblUserRecord> implements TblUserRecordService {

}
