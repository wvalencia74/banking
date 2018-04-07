package co.com.banking.entities

import co.com.banking.services.Residue

case class PersonalAccount(

  account: Account,
  accountLoginSecurity: AccountLoginSecurity,
  residue: Residue

)
