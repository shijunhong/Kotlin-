fun main(args: Array<String>) {
    var map = mapOf("Java" to 86,"Kotlin" to 91 ,"Go" to 78)
    println(map)

    var mutableMap = mutableMapOf("Java" to 86,"Kotlin" to 91 ,"Go" to 78)
    println(mutableMap)

    println("map的返回对象实际类型${map.javaClass}")
    println("mutableMap返回对象的实际类型${mutableMap.javaClass}")

    var hashMap = hashMapOf("Java" to 86,"Kotlin" to 91 ,"Go" to 78)
    println(hashMap)

    var linkedHashMap = linkedMapOf("Java" to 86,"Kotlin" to 91 ,"Go" to 78)
    println(linkedHashMap)

    var treeMap = sortedMapOf("Java" to 86,"Kotlin" to 91 ,"Go" to 100)
    println(treeMap)

    println(map.all {it.key.length>4&&it.value>80})
    println(map.any { it.key.length>4 && it.value>80 })

    println("Java" in map)

    println("Go" !in map)

    val filteredMap = map.filter { "in" in it.key }
    println(filteredMap)

    val mappedlist = map.map { "<疯狂${it.key}讲义>的价格为${it.value}" }
    println(mappedlist)
    println(map.maxBy({it.key}))
    println(map.maxBy { it.value })
    var bMap = mapOf("Lua" to 67,"Erlang" to 73,"kotlin" to 92)
    println(map+bMap)
    println(map-bMap)

    for (en in map.entries){
        println("${en.key} -> ${en.value}")
    }

    for (key in map.keys){
        println("${key} -> ${map[key]}")
    }

    for ((key,value) in map){
        println("${key} -> ${value}")
    }

    map.forEach({ println("${it.key} -> ${it.value}")})

    var mutableMap1 = mutableMapOf("OC" to 96,"PHP" to 3400,"Perl" to 4300,"Ruby" to 5600 ,"Go" to 5600)
    mutableMap1["Swift"] = 9000
    mutableMap1.put("OC",8600)
    println(mutableMap1)

    mutableMap1.remove("PHP")
    mutableMap1.remove("Per1")

    println(mutableMap1)
    println(mutableMap1.size)

    mutableMap1.clear()
    println(mutableMap1)
    println(mutableMap1.size)
    

}