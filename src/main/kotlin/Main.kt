
import java.util.Scanner

sealed class BankAccount {


    class SavingsAccount(var accno: Long, var balance: Long) : BankAccount() {
        fun deposit(amount: Int) {
            balance += amount
            println("After depositing the balance is: $balance")
        }

        fun withdraw(amount: Int) {
            if (amount <= balance) {
                balance -= amount
                println("After withdrawing the remaining balance is: $balance")

            } else {
                println("Cant able to withdraw")
            }

        }
    }

    class CurrentAccount(var accno: Long, var balance: Long) : BankAccount() {
        fun deposit(amount: Int) {
            balance += amount
            println("After depositing the balance is: $balance")
        }

        fun withdraw(amount: Int) {
            if (amount <= balance) {
                balance -= amount
                println("After withdrawing the remaining balance is: $balance")
                println("Cant able to withdraw")
            } else {
                println("Cant able to withdraw")
            }
        }
    }


}
class FixedDepositAccount(var accno: Long, var balance: Long) : BankAccount() {
    fun deposit(amount: Int) {
        balance += amount
        println("After depositing the balance is: $balance")
    }

    fun withdraw(amount: Int) {
        if (amount <= balance) {
            balance -= amount
            println("After withdrawing the remaining balance is: $balance")
        } else {
            println("Cant able to withdraw")
        }
    }
}


fun main():Unit{

    var savingsAccount=BankAccount.SavingsAccount(100156789,4000000)
    var currentAccount=BankAccount.CurrentAccount(234567156,0)
    var fixedDepositAccount=FixedDepositAccount(567843245,342189)
    println("Select account type")
    println("1.SavingsAccount/n2.CurrentAccount/n3.FixedDepositAccount")
    var num= readLine()!!.toInt()
    println("select 1.withdraw 2.deposit")
    var choice =  readLine()!!.toInt()
    println("Enter the amount")
    var amount = readLine()!!.toInt()
    when(num){

        1 -> if (choice==1){
            savingsAccount.withdraw(amount)
        }
        else if(choice==2){
            savingsAccount.deposit(amount)
        }
        else{
            println("!!!!!!!")
            return
        }
        2-> if (choice==1){
            currentAccount.withdraw(amount)
        }
        else if(choice==2){
            currentAccount.deposit(amount)
        }
        else{
            println("!!!!!!!")
            return
        }
        3-> if (choice==1){
            fixedDepositAccount.withdraw(amount)
        }
        else if(choice==2){
            fixedDepositAccount.deposit(amount)
        }
        else{
            println("!!!!!!!")
            return
        }
    }

}











