package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val authors: List<Authors>,
//    val comments: List<Comment>,
)
