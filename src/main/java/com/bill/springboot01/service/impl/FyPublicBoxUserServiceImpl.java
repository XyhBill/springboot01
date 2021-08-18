package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.FyPublicBoxUser;
import com.bill.springboot01.mapper.FyPublicBoxUserMapper;
import com.bill.springboot01.service.FyPublicBoxUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公表关联用户 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class FyPublicBoxUserServiceImpl extends ServiceImpl<FyPublicBoxUserMapper, FyPublicBoxUser> implements FyPublicBoxUserService {

}
