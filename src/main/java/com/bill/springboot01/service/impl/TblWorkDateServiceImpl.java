package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblWorkDate;
import com.bill.springboot01.mapper.TblWorkDateMapper;
import com.bill.springboot01.service.TblWorkDateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作日期 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblWorkDateServiceImpl extends ServiceImpl<TblWorkDateMapper, TblWorkDate> implements TblWorkDateService {

}
