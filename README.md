## Implementació de la lògica

Per acabar de completar l'aplicació, he acabat de declarar els **LiveData** y **MutableLiveData** al **MainViewModel** per a cada element.
Els he declarat en parelles de **MutableLiveData (privats)** i **LiveData (publics)**, cosa que em servia per a que només el **MainViewModel** pogués modificar les dades.
Després, simplemente he creat les diferents interaccions per a cada component (**toggle**, **set**, etc), i quan l'usuari fa alguna acció, en comptes de modifcar el valor directament, es crida a una funció del **viewModel**.
Aquí mostro una imatge per a veure com queda la pantalla (he marcat alguns checkbox, mogut l'slider etc):

<p align="center">
  <img width="320" alt="Captura de pantalla de l'aplicació" src="https://github.com/user-attachments/assets/4546669d-e263-4565-9c00-5eeca29294bd" />
</p>
