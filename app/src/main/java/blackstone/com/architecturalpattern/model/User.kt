package blackstone.com.architecturalpattern.model

class User(var firstName: String, var lastName: String) {

    fun getFullName() : String = firstName + lastName

}
