/*
 * Copyright 2016-2019 JetBrains s.r.o.
 * Use of this source code is governed by the Apache 2.0 License that can be found in the LICENSE.txt file.
 */

package kotlinx.datetime

public expect class TimeZone {
    public val id: String

    companion object {
        val SYSTEM: TimeZone
        val UTC: TimeZone
        fun of(zoneId: String): TimeZone
    }

    public fun Instant.toLocalDateTime(): LocalDateTime
    public fun LocalDateTime.toInstant(): Instant
}