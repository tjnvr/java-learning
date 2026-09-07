package annotations;

public class MyHouse implements House {
    @Override
    @Deprecated
    public void open() {}

    @Override
    public void openFrontDoor() {}

    @Override
    public void openBackDoor() {}
}
