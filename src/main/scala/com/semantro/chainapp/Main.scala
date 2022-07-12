package com.semantro.chainapp

import com.semantro.chain.{Block, Transaction}

/**
 * This class is a part of the package com.semantro.chainapp and the package
 * is a part of the project Chain_Demo.
 *
 * Connecting Creations Pvt. Ltd. Lalitpur, Nepal.
 * https://c2.my/
 *
 * Created by santa on 2022-05-30.
 */
object Main {

    /**
     * Program starts from here.
     *
     * @param args
     */
    def main(args: Array[String]) = {
        /**
         * Block Chain Demo.
         */
        val transaction1 = Transaction("Santa", "Samuel", 100L);
        val transaction2 = Transaction("Samuel", "Ryan", 1000L);
        val transaction3 = Transaction("Samuel", "Ryan", 1000L);
        val transaction4 = Transaction("Ryan", "Peter", 150L);

        val firstBlock = Block.buildWith(0, List(transaction1, transaction2))
        println(firstBlock)
        val secondBlock = Block.buildWith(firstBlock.hashCode(), List(transaction3))
        println(secondBlock)
        val thirdBlock = Block.buildWith(secondBlock.hashCode(), List(transaction4))
        println(thirdBlock)
    }

}
