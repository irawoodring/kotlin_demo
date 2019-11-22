fun Student.modify(grades: MutableList<Double>, calc: (Double) -> Double) : MutableList<Double> {
	var newGrades = mutableListOf<Double>()
	for(grade in grades)
		newGrades.add(calc(grade))
	return newGrades
}

fun main(args: Array<String>){
	var joe = Student(42, "Joe", 3.45)
	joe.grades.add(100.0)
	joe.grades.add(94.0)
	joe.grades.add(84.0)
	var double = { a: Double -> a * 2 } 
	var newGrades = joe.modify(joe.grades, double )
	for(grade in newGrades)
		println(grade)
}
