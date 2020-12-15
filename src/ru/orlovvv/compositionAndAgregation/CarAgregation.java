package ru.orlovvv.compositionAndAgregation;

public class CarAgregation {

    String carName = "Honda";
    Engine engine;

    public CarAgregation(Engine engine) {
        this.engine = engine;
    }

}
