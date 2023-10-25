package com.dicoding.newsapp.utils

import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.TimeZone

object DataFormatter {
    fun formatDate(currentDateString: String,targetTimeZOne : String): String {
        val instant = Instant.parse(currentDateString)
        val formatter = DateTimeFormatter.ofPattern("dd MMM yyyy | HH:mm")
            .withZone(ZoneId.of(targetTimeZOne))
        return formatter.format(instant)
    }
}