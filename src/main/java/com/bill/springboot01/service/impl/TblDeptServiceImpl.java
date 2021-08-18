package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblDept;
import com.bill.springboot01.mapper.TblDeptMapper;
import com.bill.springboot01.service.TblDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门信息表 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblDeptServiceImpl extends ServiceImpl<TblDeptMapper, TblDept> implements TblDeptService {

}
