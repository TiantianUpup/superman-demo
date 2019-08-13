package com.h2t.test.service.impl;

import com.h2t.test.po.Users;
import com.h2t.test.mapper.UsersMapper;
import com.h2t.test.service.UsersService;
import com.h2t.test.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hetiantian
 * @since 2019-08-13
 */
@Service
public class UsersServiceImpl extends BaseServiceImpl<UsersMapper, Users> implements UsersService {

}
