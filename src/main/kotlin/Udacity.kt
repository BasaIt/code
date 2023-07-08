@file:Suppress("UNUSED_EXPRESSION", "UNREACHABLE_CODE")

import java.util.*
import java.util.stream.IntStream
import kotlin.collections.ArrayList


fun fish() {
    val fish = ((2 * 71) * 2) - 13
    println(fish)
}

fun color() {
    var rainbowColor = "red"
    val blackColor = "black"
}

fun colorNull() {
    var rainbowColor: String? = null
    val greenColor: String? = null
    val blueColor = null
}

fun arrNull() {
    val array: Array<Int>? = null
    val list: List<String>? = null
}

fun nullTest() {
    var nullTest: Int? = null
    var count = 0
    if (nullTest != null) {
        count++
    } else {
        count
    }
    println(count)

}

fun str() {
    val strTrout = "trout"
    val strHaddock = "haddock"
    val strSnapper = "snapper"
    println(strHaddock)
}

fun strWh(str: String) {
    when (str.length) {
        0 -> "Zero"
        in 3..12 -> "God fishName"
        else -> println("OK fish name")
    }
}

fun array(numbers: IntRange) {
    var array = mutableListOf<String>()
    for (i in numbers) {
        if (i in 11..15) {
            array.add(i.toString())
        }
    }
    println(array)
    val arrayList = mutableListOf<Int>()
    for (i in 0..100 step 7) {
        arrayList.add(i)
    }
    println(arrayList)
}

fun wh1(foodBasketCost: Int) {
    var foodBasketCost = 0
    do {
        val data = readln()
        if (data == "Продуктовая корзина пуста") {
            break
        } else {
            val itemPrice = data.toInt()
            foodBasketCost += itemPrice
        }
    } while (true)
    println(foodBasketCost)

}

fun wh2() {
    var c = readln().toInt()
    var day = 0
    do {
        day += 2
        c += 3
    } while (c <= 25)
    println(day)
}

fun wh3() {
    var number = readln().toInt()
    var count = 1000
    var sumCount = 0
    do {
        number -= 1
        count += 100
        sumCount += count
    } while (number != 1)
    println(sumCount)
}

fun wh4() {
    var count = 0
    val finish = "Расчет окончен"
    var flag = true
    do {
        var name = readln().toString()
        if (name == finish) {
            break
        } else
            count++
    } while (flag)
    println(count)
}

fun wh5() {
    val flag = true
    var count = 0
    var totalWalk = "Стоп"
    do {
        var walk = readln()
        when (walk) {
            "Прямо" -> {
                count += 1
            }

            "Вправо" -> {
                count += 2
            }

            "Влево" -> {
                count += 2
            }

            "Круговая" -> {
                count += 3
            }
        }
        if (walk == totalWalk) {
            break
        }
    } while (flag)
    println(count)
}

fun wf1() {
    val number = readln().toInt()
    val title = readln()
    for (i in 0 until number + 1) {
        println("Приёмник #$i: $title")
    }
}

fun wf2() {
    val number = readln().toInt()
    var countCL = 0
    for (i in 0 until number) {
        var food = readln().toString()
        when (food) {
            "Грибной суп" -> countCL += 50900
            "Крем-суп из тыквы" -> countCL += 92500
            "Винегрет" -> countCL += 130100
            else -> countCL += 0
        }
    }
    println("Количество калорий в блюдах: $countCL")
}

fun wf3() {
    val number = readln().toInt()
    var countSto = 0
    var exSto = 0
    for (i in 0 until number) {
        var sto = readln().toInt()
        countSto += sto
    }
    if (countSto < 100_000) {
        exSto = 100_000 - countSto
        println("До следующего ТО: $exSto км")
    } else {
        println("Срочно требуется провести ТО")
    }
}

fun wf4() {
    var countPrice = 0
    val name = readln()
    when (name) {
        "Голубая звезда" -> {
            for (i in 8 until 16) {
                if (i == 9) {
                    countPrice += 10_000
                }
                if (i == 10) {
                    countPrice += 23_000
                }
                if (i == 12) {
                    countPrice += 7_000
                }
                if (i == 13) {
                    countPrice += 1_000
                }
                if (i == 15) {
                    countPrice += 10_000
                }
            }
        }

        "Энерго" -> {
            for (i in 8 until 16) {
                if (i == 9) {
                    countPrice += 15_000
                }
                if (i == 10) {
                    countPrice += 10_000
                }
                if (i == 12) {
                    countPrice += 5_000
                }
                if (i == 13) {
                    countPrice += 1_000
                }
                if (i == 15) {
                    countPrice += 15_000
                }
            }
        }

        "Морские вкусности" -> {
            for (i in 8 until 16) {
                if (i == 9) {
                    countPrice += 7_000
                }
                if (i == 10) {
                    countPrice += 6_000
                }
                if (i == 11) {
                    countPrice += 2_000
                }
                if (i == 14) {
                    countPrice += 1_000
                }
                if (i == 15) {
                    countPrice += 7_000
                }
            }
        }
    }
    println(countPrice)

}

fun wf5() {
    val soldiers = readln().toInt()
    var soldierInGroup = 0
    var groups = 0
    var minGroups = 0
    for (soldierNumber in 1..soldiers) {
        soldierInGroup += 1
        if (soldierInGroup == 8) {
            soldierInGroup = 0
            groups += 1
        } else if (soldierNumber + 3 > soldiers) {
            groups += 1
            break
        }
    }

    print(groups)
}

fun array1() {
    val gifts = arrayOf(
        1200, 1500, 100, 250, 890, 1236, 8650,
        13365, 365, 198, 4563, 8960, 1250, 890, 360, 450, 986,
        1565, 789, 365, 780
    )
    //пишите свой код здесь
    println(gifts.sum())
    var sum = 0
    for (i in gifts) {
        sum += i
    }
    println(sum)
}

fun array2() {
    val number_of_guests = readln().toInt()
    val guests = Array<String>(number_of_guests) { "" }
    var number = 0
    println("Гости:")
    while (number_of_guests != number) {
        var name = readln().toString()
        guests[number] = name
        number++
        for (i in guests.indices) {
        }
        println("$number: " + name)
    }
}

fun array3() {
    val count = readln().toInt() // команда toInt() приводит значение String к Int
    val array = Array<String>(count) { "" } // создает массив, каждый из элементов является пустой строкой
    //пишите свой код здесь
    var arrayIndex = ""
    for (i in array.indices) {
        array[i] = readln().toString()
    }
    for (i in array.indices) {
        if (i + 1 < array.size) {
            arrayIndex = array[i] + " - " + array[i + 1]
            println(arrayIndex)
        }
    }
}

fun array4() {
    val number_of_flights = readln().toInt() // команда toInt() приводит значение String к Int
    val destinations =
        Array<String>(number_of_flights) { "" } // создает массив, каждый из элементов является пустой строкой

    for (index in destinations.indices) {
        destinations[index] = readln()
    }

    for (i in destinations.indices) {
        for (j in destinations.indices) {
            if (destinations[i] < destinations[j]) {
                val tempDestination = destinations[i]
                destinations[i] = destinations[j]
                destinations[j] = tempDestination
            }
        }
    }

    for (destination in destinations) {
        println(destination)
    }
}

fun array5() {
    val count = readln().toInt() // команда toInt() приводит значение String к Int
    val array = Array<Int>(count) { 0 } // создает массив, каждый из элементов является 0
    //пишите свой код здесь
    for (i in array.indices) {
        array[i] = readln().toInt()
    }
    for (i in array.indices) {
        for (j in array.indices) {
            if (array[i] < array[j]) {
                var tempArray = array[i]
                array[i] = array[j]
                array[j] = tempArray
            }
        }
    }
    for (array in array) {
        println(array)
    }
}

fun array6() {
    val firstLine = readln() // считываем первую строку
    val firstLineData = firstLine.split(": ") // с помощью команды split делим строку на части на
    // основании условия, получая таким образом массив строк
    val count = firstLineData[1].toInt() // обращаемся ко второму элементу массива (строке)
    // и приводим к типу Int
    val array = Array<Int>(count) { 0 } // создает массив, каждый элемент является числом 0
    // пишите свой код здесь
    var sum = 0
    for (i in 0..count) {
        sum += readln().split(" ")[1].toInt()
    }
    println("На основании полученных данных затраты на снаряжение одного бойца составляют $sum кредитов")
}

fun calculateAvgTemperature(
    satelliteOne: Float, satelliteTwo: Float,
    satelliteThree: Float, satelliteFour: Float,
    satelliteFive: Float
): Float {
    // Ваш код здесь
    return (satelliteOne + satelliteTwo + satelliteThree + satelliteFour + satelliteFive) / 5
}

fun calculateEnergy(planetRadius: Int, iceCrustThickness: Int): Double {
    // пишите свой код здесь
    val kilometPlanetRadius = planetRadius * 1000
    val n = 2
    val s = 4 * 3.14 * (kilometPlanetRadius * kilometPlanetRadius)
    val v = s * iceCrustThickness
    val m = v * 917 * 340_000
    return m
}

fun hero(bullets: Int, dragons: Int): Boolean {
    //code here
    return bullets >= dragons * 2
}

fun moveTen(s: String): IntStream {
    var result = ""
    for (i in s) {
        if (i.isLetter()) {
            val a = (if (i.isUpperCase()) 'A' else 'a'.toChar())
            result += (a + (i - a + 10) % 26).toChar()
        } else {
            result += i
        }
    }
    return result.chars()

}

fun cesearPassword(s: String): String {
    return s.map { 'a' - (((it - 'a') + 10) % 26) }.toString()
}

fun fireFight(s: String): String {
    return s.replace("Fire", "~~")
}

fun reverseSeq(n: Int): List<Int> {
    //TODO: Fill in your code here!
    var list = arrayListOf<Int>()
    for (i in n downTo 1) list.add(i)
    return list
}

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    // moment of truth
    return (flowerA % 2 == 0) != (flowerB % 2 == 0)

}

fun maps(x: IntArray): IntArray {
    // code here
    return x.map { it * 2 }.toIntArray()
}

fun opposite(number: Int): Int {
    return Math.abs(-number)
}

fun getMiddle(word: String): String {
    //Code goes here!
    return word.substring((word.length - 1) / 2..word.length / 2)

}

fun sum(numbers: IntArray): Int {
    // Place your code here
    return numbers.filter { it > 0 }.sum()
}

fun century(number: Int): Int {

    return (number + 99) / 100
}

object PasswordHider {
    fun hidePasswordFromConnection(urlString: String): String {
        return urlString.replaceAfter("password=", "*", " ")
    }
}

fun predictAge(
    age1: Int, age2: Int, age3: Int, age4: Int,
    age5: Int, age6: Int, age7: Int, age8: Int
): Int {
    return Math.floor(
        Math.sqrt(
            ((age1 * age1) + (age2 * age2) + (age3 * age3) + (age4 * age4) + (age5 * age5) +
                    (age6 * age6) + (age7 * age7) + (age8 * age8)).toDouble()
        ).toDouble() / 2
    ).toInt()
}

fun squareSum(n: Array<Int>): Int {
    // your code
    return n.map { it * it }.sum()
}

fun repeatSt(r: Int, str: String): String {
    var string = str.repeat(r)
    return string
}

fun makeUpperCase(str: String): String {
    //todo
    return str.uppercase()
}

fun simpleMultiplication(n: Int): Int {
    return if (n % 2 == 0) {
        n * 8
    } else {
        n * 9
    }
}

fun geometricSequenceElements(a: Int, r: Int, n: Int): String {
    return generateSequence(a) { it * r }.take(n).joinToString(", ")
}

fun replace(s: String): String {
    return s.map { if (it in "aeiouAEIOU") "!" else it }.joinToString("")
}

fun areaOrPerimeter(l: Int, w: Int): Int {
// code away...
    return if (l == w) {
        l * w
    } else {
        (l + w) * 2
    }

}

fun overTheRoad(address: Int, n: Int): Int {
    //code here
    return (n * 2) - (address - 1)
}

fun rowSumOddNumbers(n: Int): Int {
    // your code here
    return n * n * n
}

fun rangeExtraction(arr: IntArray): String {
    val sb = StringBuilder()
    var i = 0
    while (i < arr.size) {
        sb.append(arr[i])
        var j = i
        while (j < arr.size - 1 && arr[j] + 1 == arr[j + 1])
            j++
        if (i + 1 < j) {
            i = j
            sb.append("-")
            sb.append(arr[i])
        }
        sb.append(",")
        i++
    }
    sb.setLength(sb.length - 1)
    return sb.toString()
}

fun dblLinear(n: Int): Int {
    // your code
    var numberA = 0
    var numberB = 0
    var numberSize = 3
    var numberCount = 0
    var arrayU = arrayListOf<Int>(1)
    while (numberSize < n + (n / 2)) {
        numberA = 2 * 1 + 1
        numberB = 3 * 1 + 1
        if (arrayU.add(numberA)) {
            numberSize++
        }
        if (arrayU.add(numberB)) {
            numberSize++
        }
        numberCount++
        var x = arrayU.get(numberCount)
    }
    return arrayU[n]

}

fun dblinear(n: Int): Int {
    var x = 1
    var y = 0
    var z = 0
    var counter = 0
    var listSize = 3
    val maxtimes = n + n / 2
    val list = mutableListOf<Int>()
    list.add(1)
    while (listSize < maxtimes) {
        y = 2 * x + 1
        z = 3 * x + 1
        if (list.add(y)) {
            listSize++
        }
        if (list.add(z)) {
            listSize++
        }
        counter++
        x = ArrayList(list)[counter]
    }
    x = ArrayList(list)[n]
    return x
}

fun find(integers: Array<Int>): Int {
    var arrayA = integers.filter { it % 2 == 0 }
    var arrayB = integers.filter { it % 2 != 0 }
    return if (arrayA.size == 1) {
        arrayA[0]
    } else {
        arrayB[0]
    }
}

fun incrementString(str: String): String {
    return str.replace(Regex("([0-8]?)(9*)$")) { e ->
        "${if (e.value.isEmpty()) 1 else (e.value.toInt() + 1)}"
    }
}

fun incremenString(str: String): String {
    val i = str.takeLastWhile { it.isDigit() }
    return str.dropLast(i.length) + ((i.toIntOrNull() ?: 0) + 1).toString().padStart(i.length, '0')
}



fun smallEnough(a: IntArray, limit: Int): Boolean {
    return a.all { it <= limit }
}

fun a(){
    val array = mutableListOf<Int>(4, 44 , 55 , 88 , 88, 8 , 777)
    var arrayList = mutableListOf<Int>()
    for (i in array){
        if (i > 15){
            arrayList.add(i)
            arrayList.map{ it / 10 }
        }
        println(arrayList)
    }
}

fun litres(time: Double): Int {
    val litters = time*0.5
    return litters.toInt()
}




