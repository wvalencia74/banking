package co.com.banking.entities

case class Cuenta (

                    numeroDeCuenta: Int,
                    tipo: String,
                    titularDeCuenta: Cliente,
                    nombreDeUsuario: String,
                    contrasena: String,
                    saldo: BigDecimal,
                    valor: Double,
   )
