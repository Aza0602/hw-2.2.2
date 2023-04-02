public class Truck extends WheeledTransport implements Engineable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        checkTyres();
        checkEngine();
        checkTrailer();
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}