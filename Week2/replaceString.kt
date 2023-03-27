fun main() {
    val inputString = "api.bytewise.com/{path}/{student}/kotlin/{name}/{rollnumber}"
    val outputString = inputString.stringKeyReplace("android", "yes", "kashif", 3314)
    println(outputString)

}

fun String.stringKeyReplace (vararg input: Any): String{
    val keys = this.split("/").filter { it.startsWith("{") && it.endsWith("}") }
    var output = this
    for ((index, key) in keys.withIndex()) {
        val value = input[index].toString()
        output = output.replace(key, value)
    }
    return output
}




