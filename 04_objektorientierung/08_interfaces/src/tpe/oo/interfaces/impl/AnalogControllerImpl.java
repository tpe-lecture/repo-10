package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;



public  class AnalogControllerImpl implements AnalogController {

    double x = 0.0;
    double y = 0.0;

    public void up(double percentage) {
        y -= percentage;

    }

    public void down(double percentage) {
        y += percentage;

    }

    public void left(double percentage) {
        x -= percentage;

    }

    public void right(double percentage) {
        x += percentage;

    }

    public Point getPosition() {
        return new Point((int)x,(int)y);

    }

}
