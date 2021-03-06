package io.choerodon.devops.domain.application.convertor;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import io.choerodon.core.convertor.ConvertorI;
import io.choerodon.devops.api.dto.DevopsIngressDTO;
import io.choerodon.devops.domain.application.entity.DevopsIngressE;
import io.choerodon.devops.infra.dataobject.DevopsIngressDO;

/**
 * Created by younger on 2018/4/28.
 */
@Component
public class DevopsIngressConvertor implements ConvertorI<DevopsIngressE, DevopsIngressDO, DevopsIngressDTO> {

    @Override
    public DevopsIngressE doToEntity(DevopsIngressDO dataObject) {
        DevopsIngressE devopsIngressE = new DevopsIngressE();
        BeanUtils.copyProperties(dataObject, devopsIngressE);
        return devopsIngressE;
    }

    @Override
    public DevopsIngressDO entityToDo(DevopsIngressE entity) {
        DevopsIngressDO devopsIngressDO = new DevopsIngressDO();
        BeanUtils.copyProperties(entity, devopsIngressDO);
        return devopsIngressDO;
    }
}
