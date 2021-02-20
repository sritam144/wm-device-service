package com.asiczen.wm.messaage.processor.services;

import com.asiczen.wm.messaage.processor.dto.WMMessageDTO;
import org.springframework.stereotype.Service;

@Service
public interface WMServices {

    public void processWMMessages(WMMessageDTO wmMessageDTO);

}
