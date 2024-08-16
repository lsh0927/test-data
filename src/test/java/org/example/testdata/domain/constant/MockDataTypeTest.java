package org.example.testdata.domain.constant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
=======
>>>>>>> 7cba6d1329fbf9e0ae24dfd4deab01a2b315cf43


@DisplayName("[Domain] 테스트 데이터 자료형 테스트")
class MockDataTypeTest {



    @DisplayName("자료형이 주어지면, 해당 원소의 이름을 리턴한다")
    @Test
    void givenMockDataType_WhenReading_thenReturnsEnumElementName(){
        //given
        MockDataType mockDataType= MockDataType.STRING;

        //when
        String elementName= mockDataType.toString();

        //then

        assertThat(elementName).isEqualTo(MockDataType.STRING.name());



    }


    @DisplayName("자료형이 주어지면, 해당 원소의 데이터를 리턴한다.")
    @Test
    void givenMockDataType_WhenReading_thenReturnsEnumElementObject(){
        //given
        MockDataType mockDataType= MockDataType.STRING;

        //when
        MockDataType.MockDataTypeObject result= MockDataType.STRING.toObject();

        //then

//        assertThat(result.toString()).isEqualTo("""
//                {
//                "name": STRING", "requiredOptions": ["minLength","maxLength","pattern"],"baseType": null
//                }
//                """);
        assertThat(result.toString()).contains("name","requiredOptions","baseType");

    }

}