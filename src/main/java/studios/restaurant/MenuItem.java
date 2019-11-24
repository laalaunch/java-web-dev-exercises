package studios.restaurant;

import java.util.Date;

public class MenuItem {

    private Integer id;
    private String item;
    private String description;
    private Double price;
    private String category;
    private Date lastUpdateDate;

    public MenuItem(Integer id, String item, String description, Double price, String category, Date lastUpdateDate) {
        this.id = id;
        this.item = item;
        this.description = description;
        this.price = price;
        this.category = category;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "\nid=" + id +
                "\nitem='" + item + '\'' +
                "\ndescription='" + description + '\'' +
                "\nprice=" + price +
                "\ncategory='" + category + '\'' +
                "\n" +
                "lastUpdateDate=" + lastUpdateDate +
                "}\n";
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}



