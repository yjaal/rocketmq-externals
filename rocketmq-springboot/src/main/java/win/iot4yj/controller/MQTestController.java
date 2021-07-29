package win.iot4yj.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.iot4yj.service.SpringProducer;

/**
 * 测试类
 *
 * @author YJ
 * @date 2021/7/28
 **/
@RestController
@RequestMapping("/MQTest")
public class MQTestController {

    private static final String topic = "TestTopic";

    @Resource
    private SpringProducer springProducer;

    @RequestMapping("/sendMsg")
    public String send(String msg) {
        springProducer.sendMessage(topic, msg);
        return "发送成功";
    }
}


























