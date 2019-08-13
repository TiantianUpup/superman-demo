package com.h2t.test.mapper;

import com.h2t.test.po.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hetiantian
 * @since 2019-08-13
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
