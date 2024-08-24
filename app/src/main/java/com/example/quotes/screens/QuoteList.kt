package com.example.quotes.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quotes.models.Quote

//@Preview
@Composable
fun QuoteList(modifier: Modifier = Modifier, data:Array<Quote>,onClick: (quote:Quote) -> Unit) {
    LazyColumn(Modifier.fillMaxSize()) {
        items(data.size) {
            QuoteListItem(quote = data[it], onClick = onClick)
        }

    }
}