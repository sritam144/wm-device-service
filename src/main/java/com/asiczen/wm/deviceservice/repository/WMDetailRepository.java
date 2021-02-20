package com.asiczen.wm.deviceservice.repository;

import com.asiczen.wm.deviceservice.model.WMDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "wmdetail", path = "wmdetail")
public interface WMDetailRepository extends MongoRepository<WMDetail, String> {
}
