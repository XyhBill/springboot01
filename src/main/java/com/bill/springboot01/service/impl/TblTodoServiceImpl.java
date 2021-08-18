package com.bill.springboot01.service.impl;

import com.bill.springboot01.bean.TblTodo;
import com.bill.springboot01.mapper.TblTodoMapper;
import com.bill.springboot01.service.TblTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author lian
 * @since 2021-08-03
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements TblTodoService {

}
