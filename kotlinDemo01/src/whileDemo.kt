fun main(args: Array<String>) {
    var count = 0
    while (count<10){
        println("counts:${count}")
        count++
    }
    println("循环结束")


    var count1 = 19
    do {
        println(count1)
        count1++
    } while (count1<10)

    println("循环结束")


    var max = 7
    var result = 1
    for (num in 1..max){
        result *= num
    }
    println(result)


    for (i in 0 until 5){
        var j = 0
        while (j<3){
            println("i的值为:${i},j的值为${j++}")
        }
    }
}