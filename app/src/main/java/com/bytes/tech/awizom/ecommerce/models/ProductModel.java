package com.bytes.tech.awizom.ecommerce.models;

public class ProductModel {

    public long ProductId ;
    public String ModelName ;
    public long MRP;
    public long AssuredPrice ;
    public long TotalDiscounts ;
    public long BrandId;
    public long CategoryId;
    public String highlights ;
    public String Img1;

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public long getMRP() {
        return MRP;
    }

    public void setMRP(long MRP) {
        this.MRP = MRP;
    }

    public long getAssuredPrice() {
        return AssuredPrice;
    }

    public void setAssuredPrice(long assuredPrice) {
        AssuredPrice = assuredPrice;
    }

    public long getTotalDiscounts() {
        return TotalDiscounts;
    }

    public void setTotalDiscounts(long totalDiscounts) {
        TotalDiscounts = totalDiscounts;
    }

    public long getBrandId() {
        return BrandId;
    }

    public void setBrandId(long brandId) {
        BrandId = brandId;
    }

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getImg1() {
        return Img1;
    }

    public void setImg1(String img1) {
        Img1 = img1;
    }
}
