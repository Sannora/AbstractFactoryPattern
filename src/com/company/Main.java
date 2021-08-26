/* Bir mobilya şirketinin aldığı siparişleri kullanılan hammadde çeşidi ve modeline göre loglayan bir kod bloğu
simülasyonu: */

package com.company;

public class Main {

    public static void main(String[] args) {

        AbstractFactory woodenFactory = new WoodenFactory();
        woodenFactory.orderScaffold(new OakWood());

        AbstractFactory fabricsFactory = new FabricsFactory();
        fabricsFactory.orderPatch(new LinenFabric());

        AbstractFactory leatherFactory = new LeatherFactory();
        leatherFactory.orderCover(new HaircellLeather());

    }
}
