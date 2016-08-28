package SearchCNN;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by kayabegum on 8/27/2016.
 */
public class Search extends Base {

    @Test
public void searchItems() throws InterruptedException{
    clickByCss("#search-button");
    typeByCss("#search-input-field", "donald trump");
    SleepFor(5);
}
}

