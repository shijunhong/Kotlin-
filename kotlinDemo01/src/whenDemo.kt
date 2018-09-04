import java.util.*

fun main(args: Array<String>) {
    var score = 'B'
    when(score){
        'A' -> println("优秀")
        'B' -> println("良好")
        'C' -> println("中等")
        'D' -> println("及格")
        else -> println("不及格")
    }

    var score2 = 'A'
    when(score2){
        'A' -> {
            println("基操勿6")
            println("床前明月光")
        }
    }

    var score3 = 'B'
    when(score3){
        'A','B' ->{
            println("hahhaha")
            println("ennenennenn")
        }
        'C','B' ->{
            println("hohohohoho")
            println("osospospo")
        }
    }

    var date = Date()
    when(date){
        Date() -> {
            println("优秀哦")
        }else-> print("我出来了")
    }

    var age = Random().nextInt(100)
    println(age)
    var str = when(age){
        in 10..25 -> "世界统治者"
        in 25..50 -> "油腻中年男"
        in 50..80 -> "幕后大玩家"
        else -> "无视"
    }
    println(str)


}


