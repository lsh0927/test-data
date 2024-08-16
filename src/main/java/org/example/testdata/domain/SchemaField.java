package org.example.testdata.domain;

import lombok.*;
import org.example.testdata.domain.constant.MockDataType;

@Getter@Setter@ToString
public class SchemaField {

    private String fieldName;
    private MockDataType mockDataType;
    private Integer fieldOrder;
    private Integer blankPercent;

    private String typeOptionJson;
    private String forceValue;


    
}
