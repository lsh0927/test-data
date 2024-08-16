package org.example.testdata.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;



@Setter
@Getter
@ToString
public class TableSchema {

    private String schemaName;
    private String userId;
    private LocalDateTime exportedAt;

    public boolean isExported(){
        return  exportedAt!=null;
    }

}
