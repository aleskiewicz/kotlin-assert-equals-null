package pl.aleskiewicz.kotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

internal class BoxedValueTest {
    @Test
    fun assertEqualsAndNullForBoxedType() {
        val rate = BoxedValue()
        Assertions.assertEquals(null, rate.intValue)
    }
    @Test
    fun assertNullForBoxedType() {
        val rate = BoxedValue()
        Assertions.assertNull(rate.intValue)
    }
}