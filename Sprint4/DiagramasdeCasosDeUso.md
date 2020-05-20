* Diagrama de casos de usos 1

![Diagrama de casos de usos](https://i.imgur.com/AeZ9NHY.png "Diagrama de casos de usos")

* Nombre: Buscar pro players
* Autor: Enrique Rapela Castejón
* Fecha: 14/05/2020
* Descripción: Permite buscar a jugadores pro players, su forma de jugar y sus builds con sus campeones.
* Actores: usuario
* Precondiciones: No hay precondiciones
* Flujo Normal: 
1.- El usuario pulsa sobre la caja del buscador.
2.- El usuario introduce la palabra o similitúd del nombre del pro player a buscar.
3.- El sistema comprueba en la base de datos las similitudes de la búsqueda.
4.- El sistema muestra en un desplegable los nombres de pro players similes a la búsqueda.
5.- El usuario pulsa sobre el jugador a mostrar la información.
6.- El sistema te lleva a la sección de pro players con la información buscada.
* Flujo Alternativo:
3.A.- Si el sistema no encuentra ninguna similitud nos mostrará un mensaje pidiendo que corrijamos la búsqueda.
* Poscondiciones:
Se muestra los datos del jugador pro player por pantalla.

* Diagramas de casos de usos 2

![Diagrama de casos de usos](https://i.imgur.com/SAPidwU.png "Diagrama de casos de usos")

* Nombre: Buscar Counter
* Autor: Enrique Rapela Castejón
* Fecha: 19/05/2020
* Descripción: Permite buscar los campeones que hacen counter al campeón que tu vas a buscar.
* Autores: Usuario
* Precondiciones: No hay precondiciones
* Flujo normal: 
1.- El usuario introduce en el campo de texto el campeón que va a utilizar para encontrar sus counters.
2.- El sistema busca en su base de datos el campeón que esta buscando el usuario y lo muestra en un desplegable para confirmrlo con un click.
3.- El usuario clickea en el campeón.
4.- El sistema busca en la base de datos los counters de ese campeón.
5.- El sistema refresca la página y la carga con los datos cargados del campeón seleccionado.
6.- El usuario realiza un voto a algún campeón que cree que deberia estar más arriba en el ranking de counter contra el campeón seleccionado.
7.- El usuario confirma que la ip no haya votado en ese campeón anteriormente.
8.- El voto se realiza correctamente y se guarda en la base de datos.
* Flujo Alternativo:
2.A.- Si el sistema no encuentra el campeón muestra un mensaje indicando que introduzca el nombre del campeón correctamente.
7.A.- Si la ip ya ha votado en un campeón el voto sera denegado y mostrará un mensaje en pantalla indicando que no puede votra de nuevo.
* Poscondiciones:
El voto fue almacenado en el sistema y publicado.
