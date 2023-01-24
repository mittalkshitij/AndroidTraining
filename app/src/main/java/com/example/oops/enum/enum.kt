package com.example.oops.enum

enum class DAYS {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
fun main()
{
    for(i in DAYS.values())
        println("${i.ordinal}"+" "+i.name)
}