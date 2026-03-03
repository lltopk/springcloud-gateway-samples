package org.lltopk.lltopkgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lyflexi
 * @project: debuginfo_jdkToFramework
 * @Date: 2024/7/27 14:09
 */
@RestController
public class Server2Controller {

    @GetMapping(value = "/server2/get/{id}")
    public String getPaymentById(@PathVariable("id") Long id)
    {
        return "server2: " + id;
    }
}
