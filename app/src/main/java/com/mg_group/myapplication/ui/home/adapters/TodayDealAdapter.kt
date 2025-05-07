package com.mg_group.womniz.Ui.ActivityHome.FragmentHome.Utils


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mg_group.myapplication.databinding.ItemTodayDealsBinding
import com.mg_group.myapplication.ui.home.module.TodayDealData


class TodayDealAdapter(var listItem: List<TodayDealData>)
    : RecyclerView.Adapter<TodayDealAdapter.TodayDealHolder>()  {

    class TodayDealHolder(var binding: ItemTodayDealsBinding)
        : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayDealHolder {
        return TodayDealHolder(
            ItemTodayDealsBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }

    override fun onBindViewHolder(holder: TodayDealHolder, position: Int) {
        holder.binding.imageProduct.setImageResource(listItem.get(position).image)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

}