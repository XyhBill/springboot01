package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblType;
import com.bill.springboot01.mapper.TblTypeMapper;
import com.bill.springboot01.service.TblTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类型库 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblTypeServiceImpl extends ServiceImpl<TblTypeMapper, TblType> implements TblTypeService {

}
