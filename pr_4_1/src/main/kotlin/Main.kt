import java.util.*

// Функция для генерации случайного выбора компьютера
fun generateComputerChoice(): Int {
    return Random().nextInt(3) + 1
}

// Функция для получения выбора игрока
fun getPlayerChoice(): Int {
    val scanner = Scanner(System.`in`)
    println("Выберите ваше действие:")
    println("1 - Камень")
    println("2 - Ножницы")
    println("3 - Бумага")

    return scanner.nextInt()
}

// Функция для определения победителя
fun determineWinner(playerChoice: Int, computerChoice: Int) {
    when {
        playerChoice == computerChoice -> println("Ничья! Попробуйте еще раз!")
        (playerChoice == 1 && computerChoice == 2) || (playerChoice == 2 && computerChoice == 3) || (playerChoice == 3 && computerChoice == 1) -> println("Вы победили!")
        else -> println("Компьютер победил!")
    }
}

fun main() {
    while (true) {
        val computerChoice = generateComputerChoice()
        val playerChoice = getPlayerChoice()

        println("Выбор компьютера: $computerChoice")

        determineWinner(playerChoice, computerChoice)

        println("Хотите сыграть еще раз? (1 - Да, любая другая цифра - Нет)")
        val playAgain = getPlayerChoice()

        if (playAgain != 1) {
            println("Игра завершена. До свидания!")
            break
        }
    }
}
