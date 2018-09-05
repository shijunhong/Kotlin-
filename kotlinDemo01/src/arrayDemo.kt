import com.sun.xml.internal.fastinfoset.util.StringArray
import java.security.Key

fun main(args: Array<String>) {
    var arr1 = arrayOf("java","Kotlin","go","php")
    var intArr1 = arrayOf(1,2,3,4,5)
    var arr3 = emptyArray<String>()
    var intArr3 = emptyArray<Int>()
    var arr4 = Array(5,{(it * 2 +97).toChar()})
    var strArr4 = Array(6,{"fkit"})

    var intArr2 = intArrayOf(2,3,4,5,6,7,8)
    var doubleArray = doubleArrayOf(2.0,2.2,2.3,2.3)
    var intArr4 = IntArray(5,{it*it})
    var charArr = CharArray(5,{(it*2+97).toChar()})

    println(arr1[1])
    println(arr1.get(1))
    arr1.set(1,"C++")
    println(arr1[1])
    arr1[2] = "Gradle"
    println(arr1[2])
    println("-------------------------------")
    var books = arrayOf("JAVA","C++","PHP","从入门到放弃","从删库到跑路")
    for (book in books){
        println(book)
    }
    println("-------------------------------")

    for (i in books.indices){
        println(books[i])
    }
    println("-------------------------------")
    for ((index,value) in books.withIndex()){
        println("这一组数据的key是:${index}这一组数据的value是:${value}")
    }


    var a = arrayOfNulls<Array<Int>>(4)
    for (i in a.indices){
        println(a[i])
    }
    a[0] = arrayOf(2,4)
    a[0]?.set(1,6)
    for (i in a[0]!!.indices){
        println(a[0]?.get(i))
    }

    println(divide(314324232342.123).contentToString())
    println(toHanStr("1111"))
}

fun divide(num:Double):Array<String>{
    var zheng = num.toLong()
    var xiao = Math.round((num-zheng)*100)
    return arrayOf(zheng.toString(),xiao.toString())
}

val hanArr = arrayOf("零","一","二","三","四","五","六","七","八","九")
var unitArr = arrayOf("十","百","千")

fun toHanStr(numStr:String):String{
    var result=""
    val numLen = numStr.length
    for (i in 0 until numLen){
        var num = numStr[i].toInt()-48
        if (i!=numLen-1&&num !=0){
            result+=hanArr[num]+unitArr[numLen-2-i]
        }else{
            result+= hanArr[num]
        }
    }
    return  result
}