package in.stackroute.springrestjpacodingchallenge.domain;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @Column(name="product_id")
    private int productId;
    @Column(name="description")
    private String description;

    public Product() {
    }

    public Product(int productId, String description) {
        this.productId = productId;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
