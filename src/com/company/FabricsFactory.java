package com.company;

public class FabricsFactory extends AbstractFactory{
    @Override
    Wooden orderScaffold(Wooden scaffold) {
        return null;
    }

    @Override
    Fabrics orderPatch(Fabrics patch) {
        return patch;
    }

    @Override
    Leather orderCover(Leather cover) {
        return null;
    }
}
