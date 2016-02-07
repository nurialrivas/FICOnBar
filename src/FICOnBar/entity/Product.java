package FICOnBar.entity;
// Generated 08-ene-2016 0:23:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.freaksparty.ficonbar.util.ButtonEntity;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable, ButtonEntity {


     private Integer productId;
     private ProductType productTypeByComplementOf;
     private ProductType productTypeByProductType;
     private String name;
     private String barcode;
     private Set prices = new HashSet(0);
     private Set sales = new HashSet(0);

    public Product() {
    }

	
    public Product(ProductType productTypeByProductType, String name) {
        this.productTypeByProductType = productTypeByProductType;
        this.name = name;
    }
    public Product(ProductType productTypeByComplementOf, ProductType productTypeByProductType, String name, String barcode, Set prices, Set sales) {
       this.productTypeByComplementOf = productTypeByComplementOf;
       this.productTypeByProductType = productTypeByProductType;
       this.name = name;
       this.barcode = barcode;
       this.prices = prices;
       this.sales = sales;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public ProductType getProductTypeByComplementOf() {
        return this.productTypeByComplementOf;
    }
    
    public void setProductTypeByComplementOf(ProductType productTypeByComplementOf) {
        this.productTypeByComplementOf = productTypeByComplementOf;
    }
    public ProductType getProductTypeByProductType() {
        return this.productTypeByProductType;
    }
    
    public void setProductTypeByProductType(ProductType productTypeByProductType) {
        this.productTypeByProductType = productTypeByProductType;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getBarcode() {
        return this.barcode;
    }
    
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public Set getPrices() {
        return this.prices;
    }
    
    public void setPrices(Set prices) {
        this.prices = prices;
    }
    public Set getSales() {
        return this.sales;
    }
    
    public void setSales(Set sales) {
        this.sales = sales;
    }




}


