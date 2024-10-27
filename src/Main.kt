import kotlin.math.pow

fun main() {

    // exe 1
    val exercises = 13
    var exercisesSolved = 0
    exercisesSolved++

    // exe 2
    val myAge: Int = 18
    println("My age: $myAge")
    exercisesSolved++

    // exe 3
    var ageAverage: Double = myAge.toDouble()
    ageAverage = (ageAverage + 30) / 2
    println("Age average: $ageAverage")
    exercisesSolved++

    // exe 4
    var testNumber = 15
    val evenOdd = testNumber % 2
    println("Even or Odd result (before change): $evenOdd")

    testNumber = 16
    println("Even or Odd result (after change): ${testNumber % 2}")
    exercisesSolved++

    // exe 5
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    println("Final result: $answer")
    exercisesSolved++

    // exe 6
    var age = 25 //  can change
    println("age: $age")
    exercisesSolved++

    // exe 7
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 10)
    println("results: $answer1, $answer2, $answer3")
    exercisesSolved++

    // exe 8
    val result = (5 * 3) - ((4 / 2) *2)
    println("Result exe 8: $result")
    exercisesSolved++

    // exe 9
    val a1 = 12.5
    val b1 = 15.5
    val average = (a1 + b1) / 2
    println("Average of a and b: $average")
    exercisesSolved++

    // exe 10
    val fahrenheit = 98.6
    val celsius = (fahrenheit - 32) / 1.8
    println("Temperature in Celsius: $celsius")
    exercisesSolved++

    // exe 11
    val position = 24
    val row = position / 8
    val column = position % 8
    println("Chessboard Position -> Row: $row, Column: $column")
    exercisesSolved++

    // exe 12
    val degrees = 60.0
    val radians = degrees * Math.PI / 180
    println("Angle in radians: $radians")
    exercisesSolved++

    // exe 13
    val x1 = 4.0
    val y1 = 7.0
    val x2 = 3.0
    val y2 = 2.0
    val distance = Math.sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    println("Distance between points: $distance")
    exercisesSolved++

    println("exercises solved: $exercisesSolved out of $exercises")

}