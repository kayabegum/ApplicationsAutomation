package SearchAmazon;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by kayabegum on 8/27/2016.
 */
public class Search extends Base{
    @Test
    public void searchItems() throws InterruptedException{
        typeByCss("#twotabsearchtextbox", "Book");
        SleepFor(5);
        }
}
