package com.falkenbeast.falkenselfpromoapp

import java.io.Serializable

public class Message(
    val contactName: String,
    val contactNumber: String,
    val displayName: String,
    val includeJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String
) : Serializable { // Implement Serializable

    fun getFullJobDesc(): String {
        return if (includeJunior) {
            "a junior $jobTitle"
        } else {
            "an $jobTitle"
        }
    }

    fun getAvailability(): String {
        return if (immediateStart) "immediately" else "from $startDate"
    }
}
