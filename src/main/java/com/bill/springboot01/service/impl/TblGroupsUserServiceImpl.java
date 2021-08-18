package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblGroupsUser;
import com.bill.springboot01.mapper.TblGroupsUserMapper;
import com.bill.springboot01.service.TblGroupsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分组用户 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblGroupsUserServiceImpl extends ServiceImpl<TblGroupsUserMapper, TblGroupsUser> implements TblGroupsUserService {

}
