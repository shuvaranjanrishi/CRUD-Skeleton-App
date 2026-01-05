package com.therishideveloper.schoolattendance.utils

import java.time.LocalDate
import java.time.Period

// English Comment: Calculate duration/age from a date
fun calculateDuration(selectedDate: LocalDate): String {
    val currentDate = LocalDate.now()
    val period = Period.between(selectedDate, currentDate)
    // English Comment: Returns formatted string
    return "${period.years} Year ${period.months} Month ${period.days} Day"
}

// English Comment: Standard date formatter
fun formatDateToString(date: LocalDate): String {
    return "${date.dayOfMonth}-${date.monthValue}-${date.year}"
}