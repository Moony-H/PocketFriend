package com.moony.chat.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.moony.chat.viewmodel.ChatViewModel

@Composable
fun ChatScreen(
    viewModel: ChatViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    LazyColumn {
        
    }
}
