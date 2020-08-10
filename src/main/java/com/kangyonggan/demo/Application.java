package com.kangyonggan.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kyg
 */
@SpringBootApplication
@RestController("/")
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 检测用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户名和密码都正确返回ok，否则返回err
     */
    @PostMapping("checkUser")
    public String checkUser(@RequestParam String username, @RequestParam String password) {
        log.info("检测用户信息：{}:{}", username, password);

        return username.equals(password) ? "ok" : "err";
    }
}
