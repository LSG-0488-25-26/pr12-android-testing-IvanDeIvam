package com.example.android_studio_test_exercice

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.android_studio_test_exercice.viewmodel.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {
    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Test
    fun testViewModelLogic() {
        val vm = MainViewModel()

        vm.toggleEstatSwitch()
        assertEquals(false, vm.estatSwitch.value)

        vm.toggleEsVegetaria()
        assertEquals(true, vm.esVegetaria.value)

        vm.setSliderValue(80f)
        assertEquals(80f, vm.sliderValue.value)

        vm.setSearchText("Test")
        assertEquals("Test", vm.searchText.value)

        vm.toggleBtnState()
        assertEquals(true, vm.toggleState.value)
    }
}