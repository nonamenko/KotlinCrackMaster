import kotlin.system.exitProcess

// Function to obfuscate characters
fun obfuscate(c: Char): Char {
    return (c.code xor 0x5A).toChar()
}

// Function to get the obfuscated correct password
fun getObfuscatedPassword(): String {
    val password = "SecurePass123"
    return password.map { obfuscate(it) }.joinToString("")
}

// Function to check the password
fun checkPassword(input: String): Boolean {
    val obfuscatedPassword = getObfuscatedPassword()
    val obfuscatedInput = input.map { obfuscate(it) }.joinToString("")
    return obfuscatedInput == obfuscatedPassword
}

fun main() {
    println("Welcome to KotlinCrackMaster!")
    print("Please enter the activation password: ")

    val input = readLine()?.trim() ?: ""
    
    // Small delay to complicate analysis
    Thread.sleep(500)

    if (checkPassword(input)) {
        println("Congratulations! You have cracked KotlinCrackMaster.")
    } else {
        println("Incorrect password. Please try again.")
    }

    exitProcess(0)
}
