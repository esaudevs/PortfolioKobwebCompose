package com.esaudev.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.esaudev.components.ContactForm
import com.esaudev.components.SectionTitle
import com.esaudev.models.Section
import com.esaudev.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ContactSection() {
    Box(
        modifier = Modifier
            .id(Section.Contact.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        ContactContent()
    }
}

@Composable
fun ContactContent() {
    val breakpoint by rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 25.px),
            section = Section.Contact,
            alignment = Alignment.CenterHorizontally
        )
        ContactForm(breakpoint = breakpoint)
    }
}