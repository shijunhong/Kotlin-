/*这些内容是用来
测试注释的*/
fun main(args: Array<String>) {
    //测试注释
    print("hello world")
    /*
       多行注释的第一行
    /*
       多行注释的第二行
    */*/

    var name = "fkit";println(name)

    var str = "fkit"
    //测试表达式跨行
    str +=
            ".org"
    //测试调用方法跨行
    var hasFk = str
                .startsWith("fk")

    //测试属性跨行
    var len = str
            .length


//    val 是值不可变 类似被final修饰

}