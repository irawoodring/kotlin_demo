fun Student.getAverage() : Double{
	return grades.average()
}

fun main(args: Array<String>){
	var joe = Student(42, "Joe", 3.45)
	joe.grades.add(100.0)
	joe.grades.add(94.0)
	joe.grades.add(84.0)
	println("Joe has average of ${joe.getAverage()}.")
}
