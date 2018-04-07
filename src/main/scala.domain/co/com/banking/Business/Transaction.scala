package co.com.banking.Business

import co.com.banking.entities.{Account, PersonalAccount, TransactionSupport}

trait Transaction {

  def consignMoney(amount: Double, account: Account): TransactionSupport
  def withdrawMoney(amount: Double, personalAccount: PersonalAccount): TransactionSupport
  def transferMoney(amount: Double, personalAccount: PersonalAccount, account: Account): TransactionSupport

}


