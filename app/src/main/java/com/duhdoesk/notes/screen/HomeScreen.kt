package com.duhdoesk.notes.screen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.duhdoesk.notes.components.NoteInputText
import com.duhdoesk.notes.components.TopBar
import com.duhdoesk.notes.components.NoteButton

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun HomeScreen() {
    Column {
        TopBar("Notes")
        NewNote()
    }
}

@Composable
fun NewNote() {
    var title by remember { mutableStateOf("") }
    var body by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
    ) {
        NoteInputText(
            text = title,
            label = "Title",
            onTextChange = {
                if (it.all { char ->
                        char.isLetter() || char.isWhitespace()
                    }) title = it
            },
            modifier = Modifier
                .fillMaxWidth()
        )

        NoteInputText(
            text = body,
            label = "Body",
            onTextChange = {
                if (it.all { char ->
                        char.isLetter() || char.isWhitespace()
                    }) body = it
            },
            maxLine = 4,
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
        )

        NoteButton(
            text = "Add",
            onClick = {
                if (title.isNotEmpty() && body.isNotEmpty()) {
                    title = ""
                    body = ""
                }
            },
            modifier = Modifier.padding(top = 12.dp)
        )
    }
}

