package com.xently.parser.utils;

import junit.framework.TestCase;
import org.junit.Assert;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class KopoKopoTest extends TestCase {

    public void test_case_1() {
        Assert.assertEquals(Collections.singletonList("K20008"), KopoKopo.getBestCustomerIDs(System. getProperty("user.dir")+File.separator+"transaction_data_2.csv", 1));
    }

    public void test_case_2() {
        System.out.println(System. getProperty("user.dir")+File.separator+"transaction_data_2.csv");
        Assert.assertEquals(Arrays.asList("K20987", "K20008", "K20233"), KopoKopo.getBestCustomerIDs(System. getProperty("user.dir")+File.separator+"transaction_data_2.csv", 3));

    }

    public void test_case_3() {
        Assert.assertEquals(Arrays.asList("K20002", "K20005", "K20377", "K20987", "K22584"), KopoKopo.getBestCustomerIDs(System. getProperty("user.dir")+File.separator+"transaction_data_3.csv", 5));
    }

}