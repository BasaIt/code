import java.math.BigInteger
import java.util.Scanner
import kotlin.math.abs
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val scanA = Scanner(System.`in`)


    val scanB = Scanner(scanA.nextLine()).next()
    val sum = (scanB)
    println("$sum")
}


fun ger(a: Int, b: Int, c: Int): String {
    return generateSequence { a * b }.take(c).toString()
}

fun peopleWeek(people: Int, week: String) {
    when (week) {
        "Понедельник" -> {
            if (people < 10_000) {
                println(150_000)
            } else if (people >= 10_000 && people < 50_000) {
                println(200_000)
            } else {
                println(300_000)
            }
        }

        "Вторник" -> {
            if (people < 10_000) {
                println(125_000)
            } else if (people >= 10_000 && people < 50_000) {
                println(175_000)
            } else {
                println(275_000)
            }
        }

        "Среда" -> {
            if (people < 10_000) {
                println(100_000)
            } else if (people >= 10_000 && people < 50_000) {
                println(150_000)
            } else {
                println(250_000)
            }
        }

        "Четверг" -> {
            if (people < 10_000) {
                println(70_000)
            } else if (people >= 10_000 && people < 50_000) {
                println(120_000)
            } else {
                println(220_000)
            }
        }

        "Пятница" -> {
            if (people < 10_000) {
                println(150_000)
            } else if (people >= 10_000 && people < 50_000) {
                println(200_000)
            } else {
                println(300_000)
            }
        }

        "Суббота" -> {
            if (people < 10_000) {
                println(150_000)
            } else if (people >= 10_000 && people < 50_000) {
                println(200_000)
            } else {
                println(300_000)
            }
        }

        "Воскресенье" -> {
            if (people < 10_000) {
                println(150_000)
            } else if (people >= 10_000 && people < 50_000) {
                println(200_000)
            } else {
                println(300_000)
            }
        }
    }
}

fun removeChar(str: String): String {
    // You got this!
    for (i in str.indices) {
        str.chars()
    }
    return str
}

fun repeatStr(r: Int, str: String): String {
    var repeatStr = repeat(r) {
        println(str)
    }
    return repeatStr.toString()
}

fun grow(arr: IntArray): Int {
    var sum = 1
    for (i in arr) {
        sum *= i
    }
    return sum
}

fun numberToString(num: Int): String {
    // code here
    return num.toString()
}

fun stringToNumber(str: String): Int {
    return str.toInt()
}

fun convert(b: Boolean): String {
    return b.toString()
}

fun findSmallestInt(nums: List<Int>): Int {
// Implement me!return
    return nums.min()
}

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    // your code here
    return Math.abs(dadYearsOld - sonYearsOld * 2)
}

fun makeNegative(x: Int): Int {
    // your code here
    return -Math.abs(x)
}

fun people(busStops: Array<Pair<Int, Int>>): Int {
    //code here
    return busStops.sumOf { (inIN, inOut) -> inIN - inOut }
}

fun evaporator(
    content: Double,
    evap_per_day: Double,
    threshold: Double
): Int {
    var day = 0
    var precent = 100.0
    while (precent > threshold) {
        precent -= precent * evap_per_day * 2
        day++
    }
    return day
}

fun meaningOfTheExpression(a: Int, b : Int ) :Int {
    return (a + b)*3
}

fun reverseWords(str:String):String{
    return str.split(" ").reversed().joinToString (" ")
}

