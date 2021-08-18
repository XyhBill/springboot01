package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblEmailReceive;
import com.bill.springboot01.mapper.TblEmailReceiveMapper;
import com.bill.springboot01.service.TblEmailReceiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件接受 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblEmailReceiveServiceImpl extends ServiceImpl<TblEmailReceiveMapper, TblEmailReceive> implements TblEmailReceiveService {

}
