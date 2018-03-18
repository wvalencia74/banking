package co.com.banking.entities

case class Cliente(

  tipoDeIdentificacion: String,
  identificacion: Int,
  nombre:String,
  apellidos: String,
  edad: Int,
  telefono:String,
  correoElectronico: String,
  direccion: String,
  estrato: Int

                   )

