fun main() {
    val me = User()
    println ("What is your First Name ?")
    me.firstName = readLine().toString()
    println ("What is your Last Name ?")
    me.lastName = readLine().toString()
    println ("What is your Age ?")
    me.age = readLine().toString().toInt()
    println ("What is your Gender ?")
    me.sex = readLine().toString()
    println ("What is your Email ?")
    me.useremail = readLine().toString()
    println("Hello," + me.firstName +" " +me.lastName + "!, you are " + me.age +" years old "+ me.sex+ " and your contact email is "+ me.useremail)
}

class User() {
    var firstName =""
    var lastName = ""
    var fullName = "$firstName $lastName"
    var age = 0
        set(value) {
            if (value < 0) throw IllegalArgumentException(
                "Age cannot be negative")
            field = value
        }
    init {
        this.age = age
    }
    var sex= ""
    var useremail = ""

    fun echouser() {
        println("Hello, $fullName!, you are a $age years old $sex and your contact email is $useremail ")
    }
}

