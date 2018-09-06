fun main(args: Array<String>) {
    var set = setOf("Java","Kotlin","Go")
    println(set)
    var mutableSet = mutableSetOf("Java","Kotlin","Go")
    println(mutableSet)
    println("setOf的返回对象的实际类型:${set.javaClass}")
    //创建hasehset集合
    var hashSSet = hashSetOf("Java","Kotlin","Go")
    println(hashSSet)
    var linkedHashSet = linkedSetOf("Java","Kotlin","Go")
    println(linkedHashSet)

    var treeSet = sortedSetOf("Java","Kotlin","Go")
    println(treeSet)

    println(set.all({it.length>4}))

    var map = set.associateBy({"疯狂"+it+"讲义"})
    println(map)

    println("Java" in set)

    println("Go" !in set)

    val dropedList = set.drop(2)
    println(dropedList)

    val filteredlist = set.filter { "in" in it }
    println(filteredlist)

    val foundStr1 = set.find { "in" in it }
    println(foundStr1)

    val foundStr2 = set.find { "gang" in it }
    println(foundStr2)

    val foldedList = set.fold("",{acc,e -> acc + e})
    println(foldedList)

    println(set.indexOf("Go"))

    val mappedList = set.map { "<疯狂" + it + "讲义>" }
    println(mappedList)

    println(set.max())

    println(set.min())

    val reversedList = set.reversed()
    println(reversedList)

    var bSet = setOf("zzz","xxx","Kotlin")
    println(set intersect bSet)

    println(set union bSet)


    for (book in set){
        println(book)
    }

    set.forEach { println(it) }

    for (i in set.indices){
        println(set.elementAt(i))
    }


    println("---------------------")

    var languages = mutableSetOf("Swift")
    languages.add("Java")
    languages.add("PHP")
    println(languages)
    println(languages.count())
    languages.addAll(setOf("Kotlin","OBJ"))
    println(languages)

    println("---------------------")

    var languages01 = mutableSetOf("Kotlin","PHP","GO","OBJ","JAVA","Ruby")
    languages01.remove("PHP")
    languages01.remove("OBJ")
    languages01.removeAll(setOf("Kotlin","JAVA"))
    println(languages01)
    languages01.clear()
    println(languages01)
}