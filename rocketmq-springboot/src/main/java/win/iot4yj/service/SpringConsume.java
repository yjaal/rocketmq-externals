package win.iot4yj.service;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author YJ
 * @date 2021/7/29
 **/
@Component
@RocketMQMessageListener(consumerGroup = "SpringBootGroup", topic = "TestTopic", consumeMode =
    ConsumeMode.CONCURRENTLY)
public class SpringConsume implements RocketMQListener<String> {

    @Override
    public void onMessage(String msg) {
        System.out.println("Received new message: " + msg);
    }
}
