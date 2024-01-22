package com.social_app.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.social_app.R
import com.social_app.model.Story
import com.social_app.model.UserStorySys

class UserStoryRecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<UserStoryRecyclerViewAdapter.RecyclerViewItemHolder>() {

    var favAdapterInterface: UserStoryRecyclerViewAdapter.StoryRecyclerViewInterface

    init{
        favAdapterInterface = context as StoryRecyclerViewInterface
    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): RecyclerViewItemHolder {
        val inflator = LayoutInflater.from(viewGroup.context)
        val itemView: View = inflator.inflate(R.layout.story_layout, viewGroup, false)
        return RecyclerViewItemHolder(itemView)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onBindViewHolder(storyRecyclerViewItemHolder: RecyclerViewItemHolder, position: Int) {
        val user = UserStorySys.userList[position]

        storyRecyclerViewItemHolder.storyOwnerUsername.text = user.username
        storyRecyclerViewItemHolder.storyOwnerPp.setImageResource(user.pp)
    }

    override fun getItemCount(): Int {
        return UserStorySys.userList.size
    }

    inner class RecyclerViewItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var storyOwnerPp: ImageView
        var storyOwnerUsername: TextView
        init {
            storyOwnerPp = itemView.findViewById(R.id.storyImageView)
            storyOwnerUsername = itemView.findViewById(R.id.storyUsernameTv)
        }
    }

    interface StoryRecyclerViewInterface {
        fun showStory(story: Story)
    }
}