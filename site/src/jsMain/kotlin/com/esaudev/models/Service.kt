package com.esaudev.models

import com.esaudev.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = "General android development knowledge, android lifecycle, navigation, services, etc."
    ),
    IOS(
        icon = Res.Image.Compose,
        imageDesc = "Compose Icon",
        title = "Jetpack Compose",
        description = "I am using Jetpack Compose for all my new projects."
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = "Basic knowledge about Kotlin multiplatform for Web and Server side"
    ),
    Design(
        icon = Res.Icon.injection,
        imageDesc = "Dependency Injection Icon",
        title = "Dependency Injection",
        description = "2 years of experience using Dagger Hilt, basic knowledge of Koin"
    ),
    Business(
        icon = Res.Icon.database,
        imageDesc = "Persistence Icon",
        title = "Persistence",
        description = "Experience using Room for data persistence layer, experience using migrations and " +
                "relational databases"
    ),
    SEO(
        icon = Res.Icon.network,
        imageDesc = "Network icon",
        title = "Network",
        description = "I have worked with libraries like Retrofit and Apollo for GraphQl apps"
    )
}