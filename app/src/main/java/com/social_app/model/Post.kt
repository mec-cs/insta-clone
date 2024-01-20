package com.social_app.model

class Post (
    var username: String,
    var pp: String,
    var postDate: String,
    var photos: List<String>?,
    var comments: List<String>? = null,
    var whoLiked: List<User>? = null,
) {
}