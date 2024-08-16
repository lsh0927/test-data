package org.example.testdata.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.testdata.domain.constant.MockDataType;

@Getter
@Setter
@ToString
public class MockData {
    private MockDataType mockDataType;
    private String mockDataValue;


}
