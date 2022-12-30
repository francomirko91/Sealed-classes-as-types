fun main() {
    val facebook = User.FacebookUser("pippo", "123456")
    val google = User.GoogleUser("pippo@gmail.com", "654321")
    val email = User.EmailUser("pippo@outlook.com", "654321")

    checkUser(google)

}

sealed class User(open val id: String) {
    data class FacebookUser(override val id: String, val password: String) : User(id)
    data class GoogleUser(override val id: String, val password: String) : User(id)
    data class EmailUser(override val id: String, val password: String) : User(id)


}

fun checkUser(user: User) {
    when (user) {
        is User.FacebookUser -> println("$user")
        is User.GoogleUser -> println("$user")
        is User.EmailUser -> println("$user ")
    }
}





