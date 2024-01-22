package com.social_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.social_app.adapter.StoryItemDecoration
import com.social_app.adapter.UserStoryRecyclerViewAdapter
import com.social_app.databinding.ActivityMainBinding
import com.social_app.model.Story
import com.social_app.model.UserStorySys

class MainActivity : AppCompatActivity(), UserStoryRecyclerViewAdapter.StoryRecyclerViewInterface {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        UserStorySys.addUserStories()

        var storyAdapter = UserStoryRecyclerViewAdapter(this)

        binding.storyRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.storyRecyclerView.adapter = storyAdapter
        binding.storyRecyclerView.addItemDecoration(StoryItemDecoration(10))








    }

    override fun showStory(story: Story) {

    }
}