package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblEmailSend;
import com.bill.springboot01.mapper.TblEmailSendMapper;
import com.bill.springboot01.service.TblEmailSendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件发送 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblEmailSendServiceImpl extends ServiceImpl<TblEmailSendMapper, TblEmailSend> implements TblEmailSendService {

}
