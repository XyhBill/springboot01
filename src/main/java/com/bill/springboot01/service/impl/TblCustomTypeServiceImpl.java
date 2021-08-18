package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblCustomType;
import com.bill.springboot01.mapper.TblCustomTypeMapper;
import com.bill.springboot01.service.TblCustomTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 自定义类型 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblCustomTypeServiceImpl extends ServiceImpl<TblCustomTypeMapper, TblCustomType> implements TblCustomTypeService {

}
