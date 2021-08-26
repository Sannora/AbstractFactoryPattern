package com.company;

public class LeatherFactory extends AbstractFactory{
    @Override
    Wooden orderScaffold(Wooden scaffold) {
        return null;
    }

    @Override
    Fabrics orderPatch(Fabrics patch) {
        return null;
    }

    @Override
    Leather orderCover(Leather cover) {
        return cover;
    }
}
