package co.com.banking.entities

import java.util.Date

import co.com.banking.services.Residue

case class TransactionSupport (

                              ticketNumber: Integer,
                              dateTransaction: Date,
                              typeTransaction: String,
                              residue: Residue,
                              amount: Double,
                              account: Account,
                              personalAccount: PersonalAccount

                              )

