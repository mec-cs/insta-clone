package com.social_app.model

class Post (
    var user: User,
    var postDate: String,
    var photos: List<Int>? = null,
    var comments: List<String>? = null,
    var whoLiked: List<User>? = null,
) {
}