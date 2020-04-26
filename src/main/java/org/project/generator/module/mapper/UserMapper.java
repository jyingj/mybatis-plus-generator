package org.project.generator.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.project.generator.module.vo.VQuery;
import org.project.generator.module.entity.User;

/**
* UserMapper
* @Author jyj
* @Date 2020-04-26
**/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    IPage<User> findByQuery(IPage<User> page, @Param("query") VQuery query);

}
