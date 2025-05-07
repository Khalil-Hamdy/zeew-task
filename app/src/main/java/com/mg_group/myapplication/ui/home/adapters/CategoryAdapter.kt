package com.mg_group.womniz.Ui.ActivityHome.FragmentHome.Utils


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mg_group.myapplication.databinding.ItemCategoryBinding
import com.mg_group.myapplication.databinding.ItemTodayDealsBinding
import com.mg_group.myapplication.ui.home.module.CategoryData
import com.mg_group.myapplication.ui.home.module.TodayDealData


class CategoryAdapter(var listItem: List<CategoryData>)
    : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>()  {

    class CategoryHolder(var binding: ItemCategoryBinding)
        : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        return CategoryHolder(
            ItemCategoryBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.binding.textCategory.text = listItem.get(position).title
        holder.binding.imageCategory.setImageResource(listItem.get(position).image)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

}