package com.esaudev.models

import com.esaudev.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String
) {
    One(
        image = Res.Image.Portfolio1,
        title = "Kudoe",
        description = "Web Design"
    ),
    Two(
        image = Res.Image.Portfolio2,
        title = "Landing Page for NFT",
        description = "Frontend"
    ),
    Three(
        image = Res.Image.Portfolio3,
        title = "NFT Application",
        description = "Frontend/Backend"
    ),
    Four(
        image = Res.Image.Portfolio4,
        title = "Game Statistics Application",
        description = "Web/Mobile App"
    ),
    Five(
        image = Res.Image.Portfolio5,
        title = "Platform for Online Courses",
        description = "Web/Mobile App"
    )
}