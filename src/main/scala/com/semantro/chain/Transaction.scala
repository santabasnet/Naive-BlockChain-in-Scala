package com.semantro.chain

/**
 * This class is a part of the package com.semantro.chain and the package
 * is a part of the project Chain_Demo.
 *
 * Connecting Creations Pvt. Ltd. Lalitpur, Nepal.
 * https://c2.my/
 *
 * Created by santa on 2022-05-30.
 */
case class Transaction(sourceName: String, destinationName: String, amountSum: Long) {

    override def equals(o: Any): Boolean = {
        if (this == o) true
        else if (o == null || getClass != o.getClass) false
        else {
            val that = o.asInstanceOf[Transaction]
            if (condition_1(that)) false
            else if (condition_2(that)) false
            else if (amountSum != null) amountSum.equals(that.amountSum)
            else that.amountSum == null

        }
    }

    private def condition_1(that: Transaction): Boolean = if (sourceName != null) !sourceName.equals(that.sourceName) else that.sourceName != null
    private def condition_2(that: Transaction): Boolean = if (destinationName != null) !destinationName.equals(that.destinationName) else that.destinationName != null

    override def hashCode: Int = 31 * result1 + (if (amountSum != null) amountSum.hashCode() else 0)

    private def result: Int = if (sourceName != null) sourceName.hashCode else 0

    private def result1 = 31 * result + (if (destinationName != null) destinationName.hashCode else 0)

    override def toString: String = "{Source Name: " + sourceName + ", Destination Name: " + destinationName + ", Amount: " + amountSum + "}"
}

/**
 * The companion object for the transaction.
 */
object Transaction {
    def buildWith(sourceName: String, destinationName: String, amountSum: Long): Transaction = Transaction(sourceName, destinationName, amountSum)
}
