package com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.models.QuoteModel
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.viewmodel.QuoteViewModel

@Composable
fun HomePage() {
    val quoteData = viewModel(modelClass = QuoteViewModel::class.java)
    val state by quoteData.state.collectAsState()

    if(state.isEmpty()){
        Box(modifier = Modifier.fillMaxSize()){
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
    if(state.isNotEmpty()){
        LazyColumn{
            items(state){quote ->
                ItemHolder(quote)
            }
        }
    }
}

@Composable
fun ItemHolder(quote : QuoteModel) {
    Card( shape = RoundedCornerShape(15.dp), modifier = Modifier.padding(5.dp).fillMaxWidth(), backgroundColor = Color.Gray) {
        Column(modifier=Modifier.padding(12.dp)) {
                Text(text = quote.q, fontSize = 18.sp, fontWeight = FontWeight.W400, color = Color.Black)
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "-${quote.a}", fontSize = 18.sp, fontWeight = FontWeight.W500, modifier = Modifier.align(
                Alignment.End))
        }
    }
    
}