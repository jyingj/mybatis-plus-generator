package ${package.ServiceImpl};

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.project.generator.module.vo.VQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package.Service}.${table.serviceName};
import ${package.Mapper}.${table.mapperName};
import ${package.Entity}.${entity};


/**
* ${table.serviceImplName}
* @Author ${author}
* @Date ${date}
**/
@Service
@Transactional(rollbackFor = Exception.class)
public class ${table.serviceImplName} extends ServiceImpl<${table.mapperName}, ${entity}> implements ${table.serviceName} {

    @Override
    public IPage<${entity}> page(VQuery query) {
        IPage<${entity}> page = new Page<>();
        Integer pageNum = query.getPageNum();
        Integer pageSize = query.getPageSize();
        page.setCurrent(pageNum == null ? 1 : pageNum);
        page.setSize(pageSize == null ? 10 : pageSize);
        return baseMapper.findByQuery(page, query);
    }

}