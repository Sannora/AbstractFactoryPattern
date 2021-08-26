package com.company;

public class WoodenFactory extends AbstractFactory{
    @Override
    Wooden orderScaffold(Wooden scaffold) {
        scaffold.scaffold();
        return scaffold;
    }

    @Override
    Fabrics orderPatch(Fabrics patch) {
        return null;
    }

    @Override
    Leather orderCover(Leather cover) {
        return null;
    }
}
