package SearchNYTimes;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by kayabegum on 8/27/2016.
 */
public class Search extends Base{
    @Test
public void searchNews()throws InterruptedException {
    clickByCss(".button.search-button");
        SleepFor(2);
    typeByCss("#search-input", "donald trump");
        SleepFor(2);

}

}
