package SearchNetFlix;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by kayabegum on 8/28/2016.
 */
public class Search extends Base{
    @Test
    public void signUp()throws InterruptedException{
        clickByCss(".authLinks signupBasicHeader");
        SleepFor(5);
        typeByCss(".ui-text-input","myshauddin123@gmail.com");
        SleepFor(5);
        typeByXpath(".//*[@id='appMountPoint']/div/div[2]/div/div/div/div/form[1]/label[1]/input","mysha123");
    }
}
