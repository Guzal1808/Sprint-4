package ru.sber.functional

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StudentsGroupTest {

    @BeforeEach
    fun setUp() {
    }

    @Test
    fun `filterByPredicate should return students with avarageRate higher 4,5`() {
        val group = StudentsGroup();
        val expected = group.students.filter { student -> student.averageRate > 4.5 }
        val actual = group.filterByPredicate { student -> student.averageRate > 4.5 }
        assertEquals(expected, actual)
    }
}