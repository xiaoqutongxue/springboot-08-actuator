package com.atguigu.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Component是加入到容器中的意思
 */
@Component
public class MyAppHealth implements HealthIndicator {
    @Override
    public Health health() {

        // 自定义检查方法
        // 表示健康 return Health.up().build();


        // 完结 撒花！！
        // 服务出错后自定义异常信息
        return Health.down().withDetail("msg","服务异常").build();
    }
}
