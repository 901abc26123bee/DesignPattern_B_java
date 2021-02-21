package com.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseRequest {
    private int type = 0; //請求類型
    private float price = 0.0f; //請求金額
    private int id = 0;

}
