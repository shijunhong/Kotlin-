fun main(args: Array<String>) {
    var list1 = listOf("Java","Kotlin",null,"Go")
    println(list1)

    var list2 = listOfNotNull("Java","Kotlin",null,"Go")
    println(list2)

    var mutableList = mutableListOf("Java","Kotlin",null,"Go")
    println(mutableList)

    println("listOf的返回对象的实际类型:${list1.javaClass}")
    println("listOfNotNull的返回实际类型${list2.javaClass}")
    println("mutableList的返回实际类型${mutableList.javaClass}")

    var arrayList = arrayListOf("Java","Kotlin",null,"Go")

    var list = listOf("jAVA","Kotlin",null,"Go")
    for (i in list.indices){
        println(list[i])
    }

    println(list.indexOf("Kotlin"))
    println(list.subList(1,3))


    var mutableList2 = mutableListOf("Kotlin",null,"Go")
    mutableList2.add(2,"Java")
    println(mutableList2)
    mutableList.removeAt(1)
    println(mutableList2)
    mutableList2[1]="Lua"
    println(mutableList2)
    mutableList2.clear()
    println(mutableList2)

}