package ${package.Service};

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.project.generator.module.vo.VQuery;
import ${package.Entity}.${entity};

/**
* ${table.serviceName}
* @Author ${author}
* @Date ${date}
**/
public interface ${table.serviceName} extends IService<${entity}> {

    IPage<${entity}> page(VQuery query);

}
