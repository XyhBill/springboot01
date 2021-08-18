package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblMessageReceive;
import com.bill.springboot01.mapper.TblMessageReceiveMapper;
import com.bill.springboot01.service.TblMessageReceiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信接受表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblMessageReceiveServiceImpl extends ServiceImpl<TblMessageReceiveMapper, TblMessageReceive> implements TblMessageReceiveService {

}
