fun myProfile() {
    val firstName: String = "LAILA"
    val lastName: String = "NURIZMI"
    val age: Int = 23
    val isSingle: Boolean = true

    println("First Name: $firstName")
    println("Last Name: $lastName")
    println("Age: $age")
    println("Is Single: $isSingle")
}

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Member: ${groupMember.joinToString(", ")}")
    println("Session: $session")

    return "Details printed successfully!"
}

fun myTeam(): List<Any> {
    val groupMembers = listOf("awan", "izmi", "asril", "rio", "anisa", "yangyang", "hibban", "sani", "pama", "ikhsan")
    
    return groupMembers
}

fun totalMember(): Int {

    val countOfGroup = arrayOf("awan", "izmi", "asril", "rio", "anisa", "yangyang", "hibban", "sani", "pama", "ikhsan")

    return  countOfGroup.size
}

fun main() {
    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")


    groupDetail("Titantech", listOf("awan", "asril", "izmi", "rio", "anisa", "yangyang", "hibban", "sani", "pama", "ikhsan"), "Morning")
}
