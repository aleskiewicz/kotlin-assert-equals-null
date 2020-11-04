package pl.aleskiewicz.kotlin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class BoxedValueJavaTest {
    @Test
    void assertEqualsAndNullForBoxedType() {
        var value = new BoxedValue();
        assertEquals(null, value.getIntValue());

    }

    @Test
    void assertNullForBoxedType() {
        var value = new BoxedValue();
        assertNull(value.getIntValue());
    }
}