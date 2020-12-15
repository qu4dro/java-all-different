package ru.orlovvv.compositionAndAgregation;

public class CarComposition {

    String carName = "Toyota";

    Engine engine;

    public CarComposition() {
        this.engine = new Engine(200);
    }
}
