package com.hotellina.SouvenirScout.entities


// To create an instance of the class one must pass a
// String parameter, namely 'type' i.e. "Free" or "Gold"
// According the second constructor we can also pass a number i.e. 0, 2 o 3
// and get the associated subscription.

class Subscription( var type : String? = null) {
    var cardinal : Int?
    var imagePath : String?

    init { // init first constructor
        this.cardinal = getCardinalSubscr()
        this.imagePath = getSubscrImage()
    }

    constructor(cardinal_param : Int) :this(){ // init second constructor
        this.cardinal = cardinal_param
        this.type = getTypeFromCardinal()
        this.imagePath = getSubscrImage()
    }

    private fun getTypeFromCardinal(): String? {
        when (cardinal) {
                0 -> return "Free"
                //1 -> return "Bronze"
                2 -> return "Silver"
                3 -> return "Gold"
            else ->return null
        }
    }

    private fun getSubscrImage():String?{
        when (type) {
                "Free" -> return "/appimages/free.png"
                //"Bronze"-> return "\\images\\appimages\\bronze.png"
                "Silver"-> return "/appimages/silver.png"
                "Gold"-> return "/appimages/gold.png"
            else -> return null
        }
    }

    private fun getCardinalSubscr():Int{
        when (type ){
                "Free" ->  return 0
                //"Bronze"->  return 1
                "Silver"-> return 2
                "Gold"->   return 3
            else -> return -1
        }
    }
}
