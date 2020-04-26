package ${package.Mapper};

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.project.generator.module.vo.VQuery;
import ${package.Entity}.${entity};

/**
* ${table.mapperName}
* @Author ${author}
* @Date ${date}
**/
@Mapper
public interface ${table.mapperName} extends BaseMapper<${entity}> {

    IPage<${entity}> findByQuery(IPage<${entity}> page, @Param("query") VQuery query);

}
