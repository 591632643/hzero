package org.hzero.iam;

import io.choerodon.eureka.event.EurekaEventHandler;
import org.hzero.autoconfigure.iam.EnableHZeroIam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableHZeroIam
@EnableEurekaClient
@SpringBootApplication
public class IamApplication {
    public IamApplication() {
    }

    public static void main(String[] args) {
        EurekaEventHandler.getInstance().init();
        SpringApplication.run(IamApplication.class, args);
    }
}


