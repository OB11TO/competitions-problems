package Course.javaDEV.L2.Collection.TASK2.car;

public abstract class Car {
    private int year;
    private Brand brand;
    private Model model;
    private Color color;

    public Car(int year, Brand brand, Model model, Color color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (brand != car.brand) return false;
        if (model != car.model) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public int getYear() {
        return year;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" + "year=" + year +
                ", brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                '}';
    }
}
