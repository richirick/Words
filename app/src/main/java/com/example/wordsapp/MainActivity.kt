/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.wordsapp
//https://web.archive.org/web/20230607034554/https://developer.android.com/courses/pathways/android-basics-kotlin-unit-3-pathway-2

//https://web.archive.org/web/20230927065325/https://developer.android.com/codelabs/basic-android-kotlin-training-fragments-navigation-component?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-fragments-navigation-component#8
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapp.databinding.ActivityMainBinding


/**
 * Main Activity and entry point for the app. Displays a RecyclerView of letters.
 */


class MainActivity : AppCompatActivity() {
//    private lateinit var recyclerView: RecyclerView
//    private var isLinearLayoutManager = true
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)

//        recyclerView = binding.recyclerView
        // Sets the LinearLayoutManager of the recyclerview
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = LetterAdapter()
//        chooseLayout()
//        contentResolver.query(uri, arrayOf("*"), "name = ?", arrayOf(name), null)?.use{ cursor ->
//            while (cursor.moveToNext()) {
//                println(cursor.columnNames.mapIndexed {i, name ->
//                    name + "=" + cursor.getString(i)
//                }.joinToString())
//            }
//        }
        
    }
    
    override fun onSupportNavigateUp() : Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
//    private fun chooseLayout() {
//        if (isLinearLayoutManager) {
//            recyclerView.layoutManager = LinearLayoutManager(this)
//        } else {
//            recyclerView.layoutManager = GridLayoutManager(this, 4)
//        }
//        recyclerView.adapter = LetterAdapter()
//    }
//    private fun setIcon(menuItem: MenuItem?) {
//        if (menuItem == null)
//            return
//
//        // Set the drawable for the menu icon based on which LayoutManager is currently in use
//
//        // An if-clause can be used on the right side of an assignment if all paths return a value.
//        // The following code is equivalent to
//        // if (isLinearLayoutManager)
//        //     menu.icon = ContextCompat.getDrawable(this, R.drawable.ic_grid_layout)
//        // else menu.icon = ContextCompat.getDrawable(this, R.drawable.ic_linear_layout)
//        menuItem.icon =
//            if (isLinearLayoutManager)
//                ContextCompat.getDrawable(this, R.drawable.ic_grid_layout)
//            else ContextCompat.getDrawable(this, R.drawable.ic_linear_layout)
//    }
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.layout_menu, menu)
//
//        val layoutButton = menu?.findItem(R.id.action_switch_layout)
//        // Calls code to set the icon based on the LinearLayoutManager of the RecyclerView
//        setIcon(layoutButton)
//
//        return true
//    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.action_switch_layout -> {
//                // Sets isLinearLayoutManager (a Boolean) to the opposite value
//                isLinearLayoutManager = !isLinearLayoutManager
//                // Sets layout and icon
//                chooseLayout()
//                setIcon(item)
//
//                return true
//            }
//            //  Otherwise, do nothing and use the core event handling
//
//            // when clauses require that all possible paths be accounted for explicitly,
//            //  for instance both the true and false cases if the value is a Boolean,
//            //  or an else to catch all unhandled cases.
//            else -> super.onOptionsItemSelected(item)
//        }
//    }


}
