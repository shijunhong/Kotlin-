fun main(args: Array<String>) {
    var b :Int
    var name = "crazyit.org"
    b = 20
    name = "hahaha.book"
    val sun :String = "666啊"
    val book1 = "我是一本书"
    val maxAge = 120 //此时maxAge 会被识别为int类型
    val eduName : String = "我是一个帅逼"  //显示指定类型
    val herName :String  //局部常量  声明的时候不指定初始值
    //kotlin 是空安全  在不确定空情况下  类型后面追加?  基本类型加了?后会变成引用类型
    var nullable :Int? = null

    var pm1 : Int = 200
    var pm2 : Int = 200
    println(pm1===pm2)
    var ob1:Int? = 200
    var ob2:Int? = 200
    println(ob1===ob2)

    //浮点类型学习
    var af1 = 5.23455556f
    println("af1的值为:${af1}")
//    var af2 :Float = 25.2345
    var f1 = 5.12e2
    println("f1:${f1}")

    var a = 0.0
    println("5.0/a:${5.0/a}")


    //转换成Byte  toByte()
    //转换成Short toShort()
    //依次相同 加个to

    //试试看空安全
    var str = "fkit"
//    var num : Int = str.toIntOrNull()
    var num2 : Int? = str.toIntOrNull()
    println(num2)


    var bbb : String ? = "fkit"
    println(bbb?.length)
    bbb=null
    println(bbb?.length)

    val myArr : Array<String?> = arrayOf("111","222","333","444","555","666")
    for (item in myArr){
        item?.let { println(it) }
    }

    //Elvis运算
    var bbbbb:String ? = "fikt"
    var len1 = if (bbbbb != null) bbbbb.length else -1
    println(len1)
    bbbbb =null
    var len2 = bbbbb?.length ?: -1
    println(len2)
}
