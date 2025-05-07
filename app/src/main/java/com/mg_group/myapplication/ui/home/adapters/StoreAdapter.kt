package com.mg_group.womniz.Ui.ActivityHome.FragmentHome.Utils


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mg_group.myapplication.databinding.ItemCategoryBinding
import com.mg_group.myapplication.databinding.ItemStoresBinding
import com.mg_group.myapplication.databinding.ItemTodayDealsBinding
import com.mg_group.myapplication.ui.home.module.CategoryData
import com.mg_group.myapplication.ui.home.module.StoreData
import com.mg_group.myapplication.ui.home.module.TodayDealData


class StoreAdapter(var listItem: List<StoreData>)
    : RecyclerView.Adapter<StoreAdapter.StoreHolder>()  {

    class StoreHolder(var binding: ItemStoresBinding)
        : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreHolder {
        return StoreHolder(
            ItemStoresBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }

    override fun onBindViewHolder(holder: StoreHolder, position: Int) {
        holder.binding.textTitle.text = listItem.get(position).name
        holder.binding.textCategory1.text = listItem.get(position).category
        holder.binding.textRate.text = listItem.get(position).rate
        holder.binding.imageStore.setImageResource(listItem.get(position).image)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

}