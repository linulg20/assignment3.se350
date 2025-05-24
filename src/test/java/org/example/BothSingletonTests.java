package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BothSingletonTests {
    @Test
    public void testEValidOutputNotNull() {
        for (int i = 0; i < 3; i++) {
            EagerSingleton eSingleton = EagerSingleton.getInstance(i);
            assertNotNull(eSingleton, "it shpuld not be null for the index " + i);
        }
    }
    @Test
    public void testESameIndexReturnSameObj() {
        EagerSingleton first = EagerSingleton.getInstance(1);
        EagerSingleton second = EagerSingleton.getInstance(1);
        assertSame(first, second, "same index needs to return the same object");
    }

}
