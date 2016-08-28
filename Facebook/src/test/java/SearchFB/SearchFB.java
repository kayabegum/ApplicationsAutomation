package SearchFB;

import common.Base;
import org.testng.annotations.Test;


/**
 * Created by kayabegum on 8/27/2016.
 */
public class SearchFB extends Base{

    @Test
    public void UserIDAndPass()throws InterruptedException{
        typeByCss("#email","mysha@gmail.com");
        SleepFor(3);
        typeByCss("#pass","mysha123");
        SleepFor(3);
//        clickByCss("f_click");
//        SleepFor(5);
//        typeByCss("._1mf _1mj","this status is done by automation");
//        SleepFor(5);
//        clickByCss("._1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft");
//        SleepFor(5);
//        typeByXpath(".//*[@id='js_l']/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div","this status was updated usuing selenium automation");
//        SleepFor(5);
//        clickByXpath(".*[@id='js_l']/div[3]/div[2]/div/div[2]/div/button");
//        SleepFor(5);
//        typeByid("._1p1v","this status is done by automation");
//        SleepFor(3);

//        clickByClass("._1p1v","this status is done by automation");
//        SleepFor(3);

    }
}
