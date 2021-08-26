package com.company;

public abstract class AbstractFactory {

    abstract Wooden orderScaffold(Wooden scaffold);

    abstract Fabrics orderPatch(Fabrics patch);

    abstract Leather orderCover(Leather cover);

}
