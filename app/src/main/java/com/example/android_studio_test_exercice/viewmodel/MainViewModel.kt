package com.example.android_studio_test_exercice.viewmodel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.state.ToggleableState
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel {
    // Atributs
    private val _estatSwitch: MutableLiveData<Boolean>
    public val estatSwitch: LiveData<Boolean>

    private val _esVegetaria: MutableLiveData<Boolean>
    public val esVegetaria: LiveData<Boolean>

    private val _esVega: MutableLiveData<Boolean>
    public val esVega: LiveData<Boolean>

    private val _esCarnivor: MutableLiveData<Boolean>
    public val esCarnivor: LiveData<Boolean>

    private val _triStateStatus: MutableLiveData<ToggleableState>
    public val triStateStatus: LiveData<ToggleableState>

    private val _selectedOption: MutableLiveData<String>
    public val selectedOption: LiveData<String>

    private val _sliderValue = MutableLiveData(0f)
    public val sliderValue: LiveData<Float> = _sliderValue

    private val _expanded = MutableLiveData(false)
    public val expanded: LiveData<Boolean> = _expanded

    private val _selectedItem = MutableLiveData("Opció A")
    public val selectedItem: LiveData<String> = _selectedItem

    private val _searchText = MutableLiveData("")
    public val searchText: LiveData<String> = _searchText

    private val _showSnackbar = MutableLiveData(false)
    public val showSnackbar: LiveData<Boolean> = _showSnackbar

    private val _toggleState = MutableLiveData(false)
    public val toggleState: LiveData<Boolean> = _toggleState

    /**
     * Constructor de la classe HelloViewModel
     * que inicialitzen els atributs
     */
    constructor() : super() {
        this._estatSwitch = MutableLiveData<Boolean>(true)
        this.estatSwitch = this._estatSwitch

        this._esVegetaria = MutableLiveData<Boolean>(false)
        this.esVegetaria = this._esVegetaria

        this._esVega = MutableLiveData<Boolean>(false)
        this.esVega = this._esVega

        this._esCarnivor = MutableLiveData<Boolean>(true)
        this.esCarnivor = this._esCarnivor

        this._triStateStatus = MutableLiveData<ToggleableState>(ToggleableState.Off)
        this.triStateStatus = this._triStateStatus

        this._selectedOption = MutableLiveData<String>("Messi")
        this.selectedOption = this._selectedOption
    }

    fun toggleEstatSwitch(){
        this._estatSwitch.value = !(this._estatSwitch.value)!!
    }

    fun toggleEsCarnivor(){
        this._esCarnivor.value = !(this._esCarnivor.value)!!
    }

    fun toggleTriStateStatus(){
        when(this._triStateStatus.value){
            ToggleableState.On -> setTriStateStatus(ToggleableState.Off)
            ToggleableState.Off -> setTriStateStatus(ToggleableState.Indeterminate)
            ToggleableState.Indeterminate -> setTriStateStatus(ToggleableState.On)
            null -> setTriStateStatus(ToggleableState.On)
        }
    }

    private fun setTriStateStatus(triState: ToggleableState){
        this._triStateStatus.value = triState
    }

    fun toggleEsVegetaria() { _esVegetaria.value = !(_esVegetaria.value ?: false) }
    fun toggleEsVega() { _esVega.value = !(_esVega.value ?: false) }
    fun setSelectedOption(option: String) { _selectedOption.value = option }
    fun setSliderValue(value: Float) { _sliderValue.value = value }
    fun setExpanded(isExpanded: Boolean) { _expanded.value = isExpanded }
    fun setSelectedItem(item: String) { _selectedItem.value = item }
    fun setSearchText(text: String) { _searchText.value = text }
    fun performSearch() { _showSnackbar.value = true }
    fun toggleBtnState() { _toggleState.value = !(_toggleState.value ?: false) }
}