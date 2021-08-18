package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblSendLog;
import com.bill.springboot01.mapper.TblSendLogMapper;
import com.bill.springboot01.service.TblSendLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 发送日志表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblSendLogServiceImpl extends ServiceImpl<TblSendLogMapper, TblSendLog> implements TblSendLogService {

}
