package web.model;

public class Car {
    private String company;

    private String model;

    private String category;

    public Car(String company, String model, String category) {
        this.company = company;
        this.model = model;
        this.category = category;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", web.model='" + model + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
