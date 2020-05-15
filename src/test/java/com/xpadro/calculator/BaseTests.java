package com.xpadro.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

@Tag("timed")
@ExtendWith(TimingExtension.class)
public interface BaseTests {

    @BeforeEach
    default void beforeEachTest(TestInfo testInfo) {
        System.out.println(String.format("interface before each. Executing test %s", testInfo.getDisplayName()));
    }
}
