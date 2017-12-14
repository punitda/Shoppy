package com.example.heady.categories.childcategory

import com.example.heady.model.ApiResponse
import com.example.heady.model.Category

/**
 * Created by punitdama on 13/12/17.
 */
data class ChildCategoryViewState(
        val isLoading : Boolean = false,
        val error : String? = null,
        val categories: List<Category>? = null
)