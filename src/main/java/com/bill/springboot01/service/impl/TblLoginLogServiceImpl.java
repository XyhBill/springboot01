package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblLoginLog;
import com.bill.springboot01.mapper.TblLoginLogMapper;
import com.bill.springboot01.service.TblLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblLoginLogServiceImpl extends ServiceImpl<TblLoginLogMapper, TblLoginLog> implements TblLoginLogService {

}
