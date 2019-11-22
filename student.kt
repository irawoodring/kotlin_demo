class Student(id: Int, name: String, gpa: Double){
	private val id = id
	private var name = name
	private var gpa = gpa

	var grades = mutableListOf<Double>()

}

fun main(args: Array<String>){
	var joe = Student(42, "Joe", 3.45)
	joe.grades.add(100.0)
	joe.grades.add(94.0)
	joe.grades.add(84.0)
}
