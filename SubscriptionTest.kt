package com.hotellina.SouvenirScout.test

import com.hotellina.SouvenirScout.entities.Subscription
import org.junit.Assert.*
import org.junit.Test
import org.junit.function.ThrowingRunnable



class SubscriptionTest {
    @Test
    fun `instantiate Subscription class by passing a wrong type parameter`(){
        val a = Subscription("Free")
        assertFalse("Free subscription has not been created correctly",a.type.equals("free"))
    }

    @Test
    fun `instantiate the Subscription class by passing the right type parameter`(){
        val a = Subscription("Free")
        assertTrue("Free subscription has not been created correctly",a.type.equals("Free"))
    }

    @Test
    fun `instantiate the Subscription class by passing a number (0, or 2) as parameter`(){
        val a = Subscription(2)
        assertTrue("Gold subscription has not been created by passing the value 2 to the constructor",a.cardinal!!.equals(2))
    }

    @Test
    fun `wrongly instantiate the Subscription class by passing a wrong number not in (0, 1 or 2)`(){
        val a = Subscription(4)
        val throwingRunnable: ThrowingRunnable = object : ThrowingRunnable{
            override fun run() {
               a.type!!
            }
        }
        assertThrows( NullPointerException::class.java, throwingRunnable);
    }

    @Test
    fun `magepath chack after instantiating Subscription with a Silver argument passed`(){
        val a = Subscription("Gold")
        assertEquals(a.imagePath,"/appimages/gold.png")
    }


}