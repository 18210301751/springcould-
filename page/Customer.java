package org.transfar.freeflow.elefence.rest.api;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.transfar.freeflow.common.constant.IpPortConstant;

import java.util.List;

/**
 * @ClassName ApiSettingServer
 * @Description TODO
 * @Author Liu.YuChong
 * @Date 2019/9/5 8:11
 * @Version 1.0
 */
@FeignClient(name = "freeflow-elefence-settingServer",url = IpPortConstant.tomcatSetting)
public interface ApiSettingServer {
    @ApiOperation("注解")
    @RequestMapping(value = "/方法路径")
     List<ElectronicFenceDTO> getByTollGrantry(@RequestParam("具体参数名") String ***,@RequestParam("具体参数名")String ***）;

    @ApiOperation("注解")
    @RequestMapping(value = "/api/方法路径")
     List<ElectronicFenceDTO> getByTollStation(@RequestParam("参数名") String *****);

    }
