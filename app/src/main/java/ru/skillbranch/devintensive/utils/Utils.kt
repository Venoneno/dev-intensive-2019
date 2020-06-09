package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?>{
        //TODO FIX ME!

        val pair:Pair<String?, String?> = null to null;

        return when(fullName){
            null -> pair;
            "" -> pair;
            " " -> pair;
            else -> {
                val parts : List<String>? = fullName?.split(" ")

                val firstName = parts?.getOrNull(0);
                val lastName = parts?.getOrNull(1);

                firstName to lastName;
            }
        }
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
