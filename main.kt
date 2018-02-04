val names = arrayOf("Anna", "Alex", "Brian", "Jack")
val count = names.count()
for (i in 0..count - 1) {
  println("Person ${i + 1} is called ${names[i]}")
}
class Shape {
  var numberOfSides = 0
  fun simpleDescription() =
    "A shape with $numberOfSides sides."
}

var shape = Shape()
shape.numberOfSides = 7
println(shape.simpleDescription())
listOf(1, 5, 3, 12, 2).sorted()
