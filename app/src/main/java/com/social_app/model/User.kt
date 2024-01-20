package com.social_app.model

class User(
    var name: String,
    var surname: String,
    var username: String,
    var pp: String,
    var followers: List<User>? = null,
    var follows: List<User>,
    var stories: List<Story>? = null,
    var posts: List<Post>? = null,
    var postsLiked: List<Post>? = null,
) {

}