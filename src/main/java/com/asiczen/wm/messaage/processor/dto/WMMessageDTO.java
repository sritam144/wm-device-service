package com.asiczen.wm.messaage.processor.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.PropertySource;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class WMMessageDTO {

    private String deviceName;
    private String devEUI;
    private String data;
    @JsonProperty("fCnt")
    private long fCnt;
    private String devAddr;
    private String time;
}
