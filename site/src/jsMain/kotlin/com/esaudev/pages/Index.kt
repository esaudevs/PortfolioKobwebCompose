package com.esaudev.pages

import androidx.compose.runtime.*
import com.esaudev.components.BackToTopButton
import com.esaudev.components.OverflowMenu
import com.esaudev.models.Achievement
import com.esaudev.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {

    var menuOpened by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSection(onMenuClick = { menuOpened = true })
            AboutSection()
            ServiceSection()
            PortfolioSection()
            AchievementsSection()
            //TestimonialSection()
            ExperienceSection()
            ContactSection()
            FooterSection()
        }

        BackToTopButton()

        if (menuOpened) {
            OverflowMenu(onMenuClosed = { menuOpened = false })
        }
    }
}
