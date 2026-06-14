## DESCRIPCION DEL PROYECTO
Este proyecto consiste en un sistema básico desarrollado en Java para registrar y buscar pasajeros dentro de un viaje de bus. Cada pasajero cuenta con los siguientes atributos:
* Nombre
* DNI
* Destino
* Fecha
* Hora
* Asiento
El sistema almacena los pasajeros utilizando una estructura de datos HashMap, donde la clave es el DNI del pasajero y el valor es el objeto de tipo Pasajero
Se eligió la estructura HashMap porque permite almacenar los pasajeros utilizando una clave única, en este caso el DNI, lo cual lo hace importante para el problema porque cada pasajero tiene un DNI diferente, lo que permite identificarlo de manera directa dentro del sistema.
En este proyecto se utiliza un Iterator porque el objetivo es demostrar el recorrido de la colección y evaluar cada pasajero durante la búsqueda.
El uso de Iterator permite recorrer todos los elementos almacenados en el HashMap de forma ordenada a nivel lógico, verificando uno por uno si el DNI del pasajero coincide con el DNI buscado.

## SALIDA EN CONSOLA
<img width="596" height="800" alt="image" src="https://github.com/user-attachments/assets/307dbe26-d7a9-4212-bec7-dd42a3dfe6d4" />
<img width="564" height="512" alt="image" src="https://github.com/user-attachments/assets/0bee3e14-4c77-41b4-a2b7-f5f2027c47d9" />
