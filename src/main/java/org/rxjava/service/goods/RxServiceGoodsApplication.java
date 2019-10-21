package org.rxjava.service.goods;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author happy 2019-03-17 22:10
 */
@SpringBootApplication
public class RxServiceGoodsApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RxServiceGoodsApplication.class).web(WebApplicationType.REACTIVE).run(args);
    }
}
