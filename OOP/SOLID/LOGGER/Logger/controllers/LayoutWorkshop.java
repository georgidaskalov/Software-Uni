package OOP.SOLID.LOGGER.Logger.controllers;

import OOP.SOLID.LOGGER.Logger.interfaces.Layout;
import OOP.SOLID.LOGGER.Logger.interfaces.LayoutFactory;

public class LayoutWorkshop implements LayoutFactory {
    @Override
    public Layout produce(String type) {
        switch (type) {
            case "SimpleLayout":
                return new SimpleLayout();
            case "XmlLayout":
                return new XmlLayout();
            default:
                throw new IllegalStateException(
                        "Not valid type of layout for " + type + " param");
        }

    }
}
