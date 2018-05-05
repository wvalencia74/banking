package co.com.banking.Business
import co.com.banking.entities.{Account, PersonalAccount, TransactionSupport}

class BankServices extends Transaction {

  override def consignMoney(amount: Double, account: Account): TransactionSupport = ???

  override def withdrawMoney(amount: Double, personalAccount: PersonalAccount): TransactionSupport = ???

  override def transferMoney(amount: Double, personalAccount: PersonalAccount, account: Account): TransactionSupport = ???

}

