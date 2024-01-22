package com.social_app.model

import com.social_app.R
import java.util.Collections

object UserStorySys {

    var userList = arrayListOf<User>()

    fun addUserStories() {
        val user1 = User(name="First", surname="Person", username="first_person", pp= R.drawable.user1, bio="I am user1, hello world")
        val user2 = User(name="Second", surname="Person", username="second_person", pp= R.drawable.user2, bio="Meine name ist user2, hallo world")
        val user3 = User(name="Third", surname="Person", username="third_person", pp= R.drawable.user3, bio="Mei to user3, hola world")

        val story1 = Story(user = user1, seen = false, storyImage = R.drawable.horizontal_photo_user1)
        val story2 = Story(user = user2, seen = false, storyImage = R.drawable.long_photo_user2)
        val story3 = Story(user = user3, seen = true, storyImage = R.drawable.kare_user3)

        user1.story = story1
        user2.story = story2
        user3.story = story3

        Collections.addAll(userList, user1, user2, user3)
    }
}