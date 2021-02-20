package com.asiczen.wm.messaage.processor.rabbitconsumer;

import com.asiczen.wm.messaage.processor.dto.WMMessageDTO;
import com.asiczen.wm.messaage.processor.services.WMServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageListenerConfiguration {

    @Autowired
    WMServices wmServices;

    @RabbitListener(queues = "wm-message")
    public void onMessageArrival(WMMessageDTO wmMessageDTO) {
        try {
            wmServices.processWMMessages(wmMessageDTO);
        } catch (Exception exception) {
            log.error("Error while consuming message from queue");
        }
    }
}
