package com.social_app.model

class User(
    var name: String,
    var surname: String,
    var username: String,
    var pp: Int,
    var followers: List<User>? = null,
    var follows: List<User>? = null,
    var bio: String,
    var story: Story? = null,
    var highlightedStories: List<Story>? = null,
    var posts: List<Post>? = null,
    var postsLiked: List<Post>? = null,
) {

}