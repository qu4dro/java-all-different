package ru.orlovvv.delegation;

public class SpaceShipDelegation {

    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    //Delegated methods
    public void back(int velocity) {
        controls.back(velocity);
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {

        SpaceShipDelegation spaceShip = new SpaceShipDelegation("X-Wing");
        spaceShip.right(100);

    }
}
