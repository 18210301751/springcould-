package org.transfar.freeflow.elefence.rest.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.transfar.freeflow.common.sdk.elefence.ElectronicFenceCommonDTO;
import org.transfar.freeflow.elefence.service.ElectronicFenceService;

/**
 * @ClassName ElefenceProController
 * @Description TODO
 * @Author Liu.YuChong
 * @Date 2019/10/28 16:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/路径")
public class *********{

    @Autowired
    ElectronicFenceService electronicFenceService;

    @PostMapping("/具体方法地址")
    @ResponseBody
    ElectronicFenceCommonDTO getDataByPointId(@RequestParam("方法具体参数名") String ***){
        return electronicFenceService.getDataByPointId(*****);
    }

}
