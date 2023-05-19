package com.esaudev.models

import com.esaudev.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val link: String
) {
    One(
        image = Res.Image.PortfolioMyLeague,
        title = "My league",
        description = "Native android application to manage soccer tournaments in real time",
        link = "https://play.google.com/store/apps/details?id=com.esaudev.footballtournament"
    ),
    Two(
        image = Res.Image.PortfolioSplitFair,
        title = "SplitFair",
        description = "Native android application to manage expenses with friends",
        link = "https://play.google.com/store/apps/details?id=com.esaudev.splitfair"
    ),
    Three(
        image = Res.Image.PortfolioYoutube,
        title = "Code with Esau",
        description = "Youtube channel focused on Android development and tutorials",
        link = "https://www.youtube.com/@CodeWithEsau"
    )
}