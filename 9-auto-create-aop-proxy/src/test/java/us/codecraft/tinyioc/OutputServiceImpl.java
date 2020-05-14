package us.codecraft.tinyioc;

import org.junit.Assert;

/**
 * @author yihua.huang@dianping.com
 */
public class OutputServiceImpl implements OutputService {

    private HelloWorldService helloWorldService;

    @Override
    public void output(String text){
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }

}
