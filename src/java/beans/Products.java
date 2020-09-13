/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
/**
 *
 * @author Randika
 */
public class Products implements Serializable {
    
    private int id ;
    private String produtCode;
    private String productName;
    private int productStockInHand;
    private int price ;
    private String category;
    private String productDesc;
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the produtCode
     */
    public String getProdutCode() {
        return produtCode;
    }

    /**
     * @param produtCode the produtCode to set
     */
    public void setProdutCode(String produtCode) {
        this.produtCode = produtCode;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the productDesc
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * @param productDesc the productDesc to set
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * @return the productStockInHand
     */
    public int getProductStockInHand() {
        return productStockInHand;
    }

    /**
     * @param productStockInHand the productStockInHand to set
     */
    public void setProductStockInHand(int productStockInHand) {
        this.productStockInHand = productStockInHand;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
