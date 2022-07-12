package com.semantro.chain

/**
 * This class is a part of the package com.semantro.chain and the package
 * is a part of the project Chain_Demo.
 *
 * Connecting Creations Pvt. Ltd. Lalitpur, Nepal.
 * https://c2.my/
 *
 * Created by santa on 2022-05-31.
 */
case class Block(previousHash: Int, transactions: List[Transaction]) {

    override def equals(o: Any): Boolean = {
        if (this == o) true
        else if (o == null || getClass != o.getClass) false
        else {
            val block = o.asInstanceOf[Block]
            if(previousHash != block.previousHash) false
            else if(transactions != null) transactions.equals(block.transactions) else block.transactions == null
        }
    }

    override def hashCode(): Int = {
        31 * previousHash + (if(transactions != null) transactions.hashCode() else 0)
    }
}

/**
 * The Companion Object for the Block.
 */
object Block {
    def buildWith(previousHash: Int, transactions: List[Transaction]): Block = Block(previousHash, transactions)
}
