package structural.facade;

import structural.facade.interfaces.Restaurant;
import structural.facade.models.BFC;
import structural.facade.models.KFC;
import structural.facade.models.PizzaHut;
import structural.facade.models.Xinxian;

public class FoodDelivery {

    private final Restaurant bfc;
    private final Restaurant kfc;
    private final Restaurant pizzaHut;
    private final Restaurant xinxian;

    public FoodDelivery() {
        bfc = new BFC();
        kfc = new KFC();
        pizzaHut = new PizzaHut();
        xinxian = new Xinxian();
    }

    public void orderBFCFood() {
        int i, j;
        i = j = 5;
        int result = i + j;

        //some codes
        bfc.order();
    }

    public void orderKFCFood() {
        kfc.order();
    }

    public void orderPizzaHutFood() {
        pizzaHut.order();
    }

    public void orderXinxianFood() {
        xinxian.order();
    }
}
