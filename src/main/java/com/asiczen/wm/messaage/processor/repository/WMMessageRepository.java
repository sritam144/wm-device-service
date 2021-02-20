package com.asiczen.wm.messaage.processor.repository;

import com.asiczen.wm.messaage.processor.model.WMMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WMMessageRepository extends MongoRepository<WMMessage,String> {
}
