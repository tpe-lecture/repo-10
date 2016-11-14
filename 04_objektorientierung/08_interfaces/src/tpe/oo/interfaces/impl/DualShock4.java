package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements DigitalController, AnalogController {

    private AnalogController analogStick = new AnalogControllerImpl();
    private DigitalController digitalStick = new DigitalControllerImpl();

    @Override
    public void up(double percentage) {
        analogStick.up(percentage);
    }

    @Override
    public void down(double percentage) {
        analogStick.down(percentage);
    }

    @Override
    public void left(double percentage) {
        analogStick.left(percentage);
    }

    @Override
    public void right(double percentage) {
        analogStick.right(percentage);
    }

    @Override
    public void up() {
        digitalStick.up();
    }

    @Override
    public void down() {
        digitalStick.down();
    }

    @Override
    public void left() {
        digitalStick.left();
    }

    @Override
    public void right() {
        digitalStick.right();
    }

    @Override
    public Point getPosition() {
        Point resultAnalog = analogStick.getPosition();
        Point resultDigital = digitalStick.getPosition();
        Point result = new Point();

        result.x = resultAnalog.x + resultDigital.x;
        result.y = resultAnalog.y + resultDigital.y;

        return null;
    }

}
