import kotlin.math.cbrt

fun main(args:String){
    println("Вопрос: Какая цель игры?")
    println("Ответ: Целью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.\n")
    println("Вопрос: Сколько дается попыток?")
    println("Ответ: Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.\n")
    println("Вопрос: Есть ограничение по времени?")
    println("Алиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить счет за аренду сервера.\n")
}

fun one() {
    println("Введите число:")
    val num = readln().toInt()
    do {
        val number = readln().toInt()
        if (num == number) {
            println("Вы угадали число!")
        } else if (number > 100) {
            println("Число $number лежит за пределами заданного промежутка")
        } else if (num > number) {
            println("Загаданное число больше")
            println("Введите число:")
        } else if (num < number){
            println("Загаданное число меньше")
            println("Введите число:")
        }else{
            break
        }
    } while (num != number)

}


fun letsGetNumber(number:Int){
    println("1. Запустить игру")
    println("2. Гид по игре")
    println("3. Выйти из игры\n")

    val choice = readln().toInt()

    println("Выберите пункт:\n")

    when(choice){
        1 -> println("Идет запуск игры")

        2 -> println("Открывается гид по игре")

        3 -> println("Идет закрытие игры")

    }
}

fun cf(){
    var count= 0
    do {
        var food = readln().toString()
        count++
    }while (food != "Продуктовая корзина пустая")
    println(count-1)
}
fun cFod(){
    val food = readln().toString()
    val array = listOf<Int>(14, 69, 240, 31, 46, 10_000)
    val arr = listOf<String>("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    for (i in arr.indices){
        if (arr[i] == food){
            println("Товар \""+food+"\" стоит " + array[i] + " кредитов")
        }
        break
    }
}
fun on(){
    val arr = mutableListOf<String>("Макарошки", "Гречка", "Сало",
        "Пшено", "Рис", "Кусок металла")
    val array = mutableListOf<Int>(14, 69, 240, 31, 46, 10_000)
    var count = 0
    var food= ""
    do {
        val food = readln().toString()
        if (food != "Продуктовая корзина пустая")
        for (i in arr.indices){
            if (arr[i] == food){
                count += array[i]
                break
            }
        }else{
            break
        }
    } while (true)
    println("Стоимость всех товаров в продуктовой корзине: $count кредитов")
}
fun o() {
    val array = arrayListOf<String>(
        "Макарошки",
        "Гречка", "Сало", "Пшено",
        "Рис", "Кусок металла")
    var exception = false
    var food = ""
    do {
        for (i in array.indices){
            food = readln().toString()
            if (array[i] == food){
                exception = true
            }else{
                break
            }
        }
    }while (exception)
    println("Товар\"$food\" не найден в базе данных")
}

fun data(): Unit {
    val data = arrayOf(
        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!",
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!",
        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в магазинах! Обнови своего дроида!"
    )
    // пишите свой код здесь
    for (i in data.indices)
    println(data[i]+"\n")
}
fun dat(): Unit {
    val data = arrayOf(
        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!",
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!",
        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в магазинах! Обнови своего дроида!"
    )
    val number = readln().toInt()
    var count = 0
    do {
        for (i in data.indices)
            println(data[i]+"\n")
            count++
    }while (count != number)
}
fun da(){
    val dataAuto = arrayOf(
        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!"
    )

    val dataMovie = arrayOf(
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!"
    )

    val dataDroid = arrayOf(
        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в" +
                " магазинах! Обнови своего дроида!"
    )

    // пишите свой код здесь
    var count = 0

}

fun printMainMenu() {
    // Ваш код здесь
    println("1. Запустить игру")
    println("2. Гид по игре")
    println("3. Выйти из игры")
}

fun readItemMenu(): Int {
    // Ваш код здесь
    val choice = readln().toInt()
    println("Выберите пункт:\n")
    when(choice){
        1 -> println("Идет запуск игры")

        2 -> println("Открывается гид по игре")

        3 -> println("Идет закрытие игры")
    }
    return choice
}

fun runGame() {
    // Ваш код здесь
    println("Введите число:")
    val num = readln().toInt()
    do {
        val number = readln().toInt()
        if (num == number) {
            println("Вы угадали число!")
        } else if (number > 100) {
            println("Число $number лежит за пределами заданного промежутка")
        } else if (num > number) {
            println("Загаданное число больше")
            println("Введите число:")
        } else if (num < number){
            println("Загаданное число меньше")
            println("Введите число:")
        }else{
            break
        }
    } while (num != number)

}

fun showGuide() {
    // Ваш код здесь
    println("Вопрос: Какая цель игры?")
    println("Ответ: Целью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.\n")
    println("Вопрос: Сколько дается попыток?")
    println("Ответ: Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.\n")
    println("Вопрос: Есть ограничение по времени?")
    println("Ответ: Алиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить счет за аренду сервера.\n")

}

fun main (args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat a lot of algae"),
    FishColor by fishColor

fun izzBuzz(n: Int): MutableList<String> {
    //TODO: Enter your code here!
    var array = mutableListOf<String>()
    if (n % 3 == 0){
        array.add("Fizz")
    }else if(n % 5 == 0){
        array.add("Buzz")
    }else if (n % 3 == 0 && n % 5 == 0){
        array.add("FizzBuzz")
    }else{
        array
    }
    return array
}

fun getCount(str : String) : Int {
    var count = 0
    for(i in 0 until str.length){
        var l = str[i]
        when(l){
            'a', 'e', 'i', 'o', 'u' ->count++
        }
    }
    return count
}

fun longest(s1:String, s2:String):String {
    // your code
    val str = s1.plus(s2)
    val sort = str.toList().sorted().distinct().joinToString()
    return sort.replace(",".toRegex(), "")
}

fun twoOldestAges(ages: List<Int>): List<Int> {
    var maxFirst = ages.max()
    var maxSecond = ages.max()
    var result = ages.toList()
    return result

    return listOf(0, 0)
}

fun isLeapYear(year: Int) : Boolean {
    // code here
    var boolean = false
    return year % 4 == 0 || year % 100 != 0 || year % 400 == 0
}

fun potatoes(p0:Int, w0:Int, p1:Int):Int {
    // your code
    return (w0 * (100-p0)/(100-p1))
}

fun catMouse(s: String): String {
    var name = ""
    for(i in s.indices){
        if(i <= 3){
            name = "Caught!"
        }else{
            name = "Escaped!"
        }
    }
    //Your code goes here!
    return name
}

fun repeats(arr: IntArray): Int {
    arr.sort()
    var array = mutableListOf<Int>()
    for(i in 0..arr.size){
        if (arr[i] != arr[i-1])
            array.add(i)
    }
    return array.sum()
}

fun argsCount(vararg args: Any): Int {
    var count = 0
    return args.count()

}
fun faroCycles(deckSize: Int): Int {
    TODO()
}