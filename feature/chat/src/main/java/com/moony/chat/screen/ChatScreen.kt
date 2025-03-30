package com.moony.chat.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.moony.chat.viewmodel.ChatViewModel

@Composable
fun ChatScreen(
    viewModel: ChatViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Text(modifier = Modifier.align(Alignment.Center), text = "hello", fontSize = 30.sp)
    }
}
