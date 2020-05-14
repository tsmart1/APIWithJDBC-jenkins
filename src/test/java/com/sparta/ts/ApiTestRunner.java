package com.sparta.ts;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({MultipleAuthorTest.class, SingleAuthorTest.class})
public class ApiTestRunner {
}
