package demo;

import junit.framework.TestCase;

/**
 * Created by zhoumengkang on 3/12/15.
 */
public class SupportServiceTest extends TestCase {
    public void testAdd() throws Exception {
        String res = SupportService.add(1, 2);
        System.out.println(res);
    }

    public void testPost() throws Exception {
        long a = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            String res = SupportService.post(1, 2);
            System.out.println(res);
        }

        System.out.println(System.currentTimeMillis() - a);
    }
}