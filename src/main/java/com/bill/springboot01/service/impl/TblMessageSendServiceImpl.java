package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblMessageSend;
import com.bill.springboot01.mapper.TblMessageSendMapper;
import com.bill.springboot01.service.TblMessageSendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信息发送 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblMessageSendServiceImpl extends ServiceImpl<TblMessageSendMapper, TblMessageSend> implements TblMessageSendService {

}
