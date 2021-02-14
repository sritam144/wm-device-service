package com.asiczen.wm.deviceservice.model;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customer-data")
@Builder
public class Customer {

    @Id
    private String id;
    @Indexed(unique = true)
    private String customerId;
    private String customerName;
    private String customerAddress;
    @Indexed(unique = true)
    private String customerPhoneNumber;
    private Set<WMDetail> wmDetails;

}
