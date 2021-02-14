package com.asiczen.wm.deviceservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WMDetail {

    private String deviceName;
    private String deviceEUI;
    private String deviceAddress;

}
