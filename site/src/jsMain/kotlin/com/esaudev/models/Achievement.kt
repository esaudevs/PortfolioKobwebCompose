package com.esaudev.models

import com.esaudev.util.Res

enum class Achievement(
    val icon: String,
    val number: Int,
    val description: String
) {
    Completed(
        icon = Res.Icon.checkmark,
        number = 10,
        description = "Completed Projects"
    ),
    Active(
        icon = Res.Icon.shield,
        number = 2,
        description = "Active Projects"
    ),
    Satisfied(
        icon = Res.Icon.happy,
        number = 4,
        description = "Satisfied Clients"
    ),
    Team(
        icon = Res.Icon.user,
        number = 1,
        description = "Team Members"
    )
}