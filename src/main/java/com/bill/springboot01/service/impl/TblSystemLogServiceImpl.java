package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblSystemLog;
import com.bill.springboot01.mapper.TblSystemLogMapper;
import com.bill.springboot01.service.TblSystemLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblSystemLogServiceImpl extends ServiceImpl<TblSystemLogMapper, TblSystemLog> implements TblSystemLogService {

}
