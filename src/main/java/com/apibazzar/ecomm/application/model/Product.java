package com.apibazzar.ecomm.application.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

 @Id
 private String productId;

 private String productName;
 private String productType;
 private double productActualPrice;
 private double productSellingPrice;
 private double productGST;
}
