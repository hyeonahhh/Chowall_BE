package com.example.chowall.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConstraintsDomain {
    int cId;
    int uId;
    boolean c1;
    String c1_ex;
    boolean c2;
    String c2_ex;
    boolean c3;
    String c3_ex;
    boolean c4;
    String c4_ex;
    boolean c5;
    String c5_ex;
}
