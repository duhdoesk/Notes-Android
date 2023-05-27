package com.duhdoesk.notes.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.duhdoesk.notes.components.NoteInputText
import com.duhdoesk.notes.components.TopBar
import com.duhdoesk.notes.R

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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
    ) {
        NoteInputText(
            text = "",
            label = "Title",
            onTextChange = {}
        )

        NoteInputText(
            text = "",
            label = "Body",
            onTextChange = {},
            maxLine = 3
        )

        Button(
            onClick = { },
            modifier = Modifier.padding(top = 12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_add_24),
                    contentDescription = "plus sign"
                )
                Text(text = "Add", Modifier.padding(start = 8.dp))
            }
        }
    }
}

