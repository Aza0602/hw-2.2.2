public class Car extends WheeledTransport implements Engineable {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        checkTyres();
        checkEngine();
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

}