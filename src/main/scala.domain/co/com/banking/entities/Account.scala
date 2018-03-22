package co.com.banking.entities

case class Account(
  accountNumber: Int,
  typeAccount: String,
  accountHolder: Client,
  userName: String,
  password: String,
  balance: BigDecimal
)
