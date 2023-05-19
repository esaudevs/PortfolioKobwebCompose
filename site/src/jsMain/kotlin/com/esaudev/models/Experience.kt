package com.esaudev.models

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Software Engineer, Android",
        description = "Working for the most important clients both in the local Mexican and international markets, " +
                "supporting applications with millions of users using Kotlin and agile methodologies.",
        company = "Wizeline",
        from = "Aug 2022",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Android Developer",
        description = "Responsible for the development of the company's main Android application. Development entirely" +
                " in Kotlin making use of the latest technologies in the market such as Jetpack Navigation, MVVM " +
                "architecture, Dagger Hilt, Retrofit, Firebase Auth (Google, Facebook, and Apple), Room, separation by " +
                "modules and automated deployment through Bitrise. Complete migration from RxJava to Kotlin Flow.",
        company = "Casai",
        from = "Jul 2021",
        to = "Jul 2022",
    ),
    Third(
        number = "03",
        jobPosition = "Testing Engineer",
        description = "Test case management for the automotive sector, specifically for HMI development. Use of Jira and " +
                "Testrail as well as agile methodologies. Execution of manual tests.",
        company = "Capgemini Engineering",
        from = "Nov 2020",
        to = "March 2021",
    )
}