package dirty.course.javaDEV.L2.Collection.TASK2.car;

public class Bus extends Car{

    private int passengerAmount;

    public Bus(int year, Brand brand, Model model, Color color) {
        super(year, brand, model, color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        return passengerAmount == bus.passengerAmount;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengerAmount;
        return result;
    }

    @Override
    public String toString() {
        return "Bus{" + "passengerAmount=" + passengerAmount +
                '}';
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }
}
