package co.com.banking.entities

case class Credito (

  clienteCredito: Cliente,
  totalCreditoAprobado: Double,
  totalNumeroDeCuotas: Int,
  valorDeCuota: Double,
  numeroDeCuotasPendientes: Int,
  saldoPendiente: Double,
  saldoEnMora: Double,
  numeroDeCuotasEnMora: Int,
  interesPorMoraMensual: Double

                   )



