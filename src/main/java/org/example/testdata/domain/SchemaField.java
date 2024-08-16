package org.example.testdata.domain;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

@Getter@Setter@ToString
public class SchemaField {

    private String fieldName;
    private String mockDataType;
    private Integer fieldOrder;
    private Integer blankPercent;

    private String typeOptionJson;
    private String forceValue;


    
}
