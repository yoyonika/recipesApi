package com.example.android.recipes

import android.support.v7.widget.RecyclerView
import android.view.View

class RecipesAdapter: RecyclerView.Adapter<RecipesAdapter.RecipesViewHolder>(){

    val recipesList: MutableList<Recipe> = mutableListOf()

inner class RecipesViewHolder (itemView: View){

}
}