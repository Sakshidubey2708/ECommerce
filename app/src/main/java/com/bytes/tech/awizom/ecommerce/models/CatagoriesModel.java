package com.bytes.tech.awizom.ecommerce.models;

public class CatagoriesModel {

    public long MainCatId ;
    public String MainCatName ;

    public long SubCatId;
    public String SubCatName;

    public long TypeSubCatId ;
    public String TypeSubCatName ;

    public long BrandId;
    public String BrandName;

    public long getMainCatId() {
        return MainCatId;
    }

    public void setMainCatId(long mainCatId) {
        MainCatId = mainCatId;
    }

    public String getMainCatName() {
        return MainCatName;
    }

    public void setMainCatName(String mainCatName) {
        MainCatName = mainCatName;
    }

    public long getSubCatId() {
        return SubCatId;
    }

    public void setSubCatId(long subCatId) {
        SubCatId = subCatId;
    }

    public String getSubCatName() {
        return SubCatName;
    }

    public void setSubCatName(String subCatName) {
        SubCatName = subCatName;
    }

    public long getTypeSubCatId() {
        return TypeSubCatId;
    }

    public void setTypeSubCatId(long typeSubCatId) {
        TypeSubCatId = typeSubCatId;
    }

    public String getTypeSubCatName() {
        return TypeSubCatName;
    }

    public void setTypeSubCatName(String typeSubCatName) {
        TypeSubCatName = typeSubCatName;
    }

    public long getBrandId() {
        return BrandId;
    }

    public void setBrandId(long brandId) {
        BrandId = brandId;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }
}
