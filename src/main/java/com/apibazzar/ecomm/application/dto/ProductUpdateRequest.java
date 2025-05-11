package com.apibazzar.ecomm.application.dto;

import lombok.Data;

@Data
public class ProductUpdateRequest {
	private String productName;
	private String productType;
	private double productActualPrice;
	private double productSellingPrice;
	private double productGST;
}
