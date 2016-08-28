package SearchCbazar;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by kayabegum on 8/28/2016.
 */
public class Search extends Base{
    @Test
    public void Search()throws InterruptedException{
        typeByCss("#expTextInput1","sarees");
        SleepFor(5);
    }


}
