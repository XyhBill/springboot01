package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblCommonMessage;
import com.bill.springboot01.mapper.TblCommonMessageMapper;
import com.bill.springboot01.service.TblCommonMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 常用短信 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblCommonMessageServiceImpl extends ServiceImpl<TblCommonMessageMapper, TblCommonMessage> implements TblCommonMessageService {

}
