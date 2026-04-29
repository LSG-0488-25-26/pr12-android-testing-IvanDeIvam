## Implementació de la lògica

Per acabar de completar l'aplicació, he acabat de declarar els **LiveData** y **MutableLiveData** al **MainViewModel** per a cada element.
Els he declarat en parelles de **MutableLiveData (privats)** i **LiveData (publics)**, cosa que em servia per a que només el **MainViewModel** pogués modificar les dades.
Després, simplemente he creat les diferents interaccions per a cada component (**toggle**, **set**, etc), i quan l'usuari fa alguna acció, en comptes de modifcar el valor directament, es crida a una funció del **viewModel**.
Aquí mostro una imatge per a veure com queda la pantalla (he marcat alguns checkbox, mogut l'slider etc):

<p align="center">
  <img width="320" alt="Captura de pantalla de l'aplicació" src="https://github.com/user-attachments/assets/4546669d-e263-4565-9c00-5eeca29294bd" />
</p>

## Proves i Testing

Per als tests, he modificat els 2 tests que ja venien per defecte, que son **ExampleInstrumentedTest** y **ExampleUnitTest**.

* **ExampleInstrumentedTest**: El primer s'encarrega de testejar que el paquet de l'aplicació és el correcte, per assegurar que l'entorn d'Android està ben configurat, també fa un test per comprovar que l'app es llença i no peta.
* **ExampleUnitTest**: El segon s'encarrega de fer tests a les diferents funcionalitats de l'aplicació, és com una simulació de l'usuari fent check en alguna casella o movent l'slider, i el test comprova que les dades es van guardant i actualitzant correctament.

A continuació, posaré una imatge del resultat de cada test per comprovar que han sigut exitosos:

<p align="center">
  <b>Resultat del Test Instrumental</b><br>
  <img width="800" alt="Resultat Test Instrumental" src="https://github.com/user-attachments/assets/206ef9ea-33d2-40f5-a610-16cec91b1f19" />
</p>

<p align="center">
  <b>Resultat del Test Unitari (ViewModel)</b><br>
  <img width="800" alt="Resultat Test Unitari" src="https://github.com/user-attachments/assets/c6542bad-7084-4431-a4cb-c98af5aefa70" />
</p>

