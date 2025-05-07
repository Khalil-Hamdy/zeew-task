package com.mg_group.myapplication.ui.home.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mg_group.myapplication.R
import com.mg_group.myapplication.databinding.FragmentHomeBinding
import com.mg_group.myapplication.ui.home.module.CategoryData
import com.mg_group.myapplication.ui.home.module.StoreData
import com.mg_group.myapplication.ui.home.module.TodayDealData
import com.mg_group.womniz.Ui.ActivityHome.FragmentHome.Utils.CategoryAdapter
import com.mg_group.womniz.Ui.ActivityHome.FragmentHome.Utils.StoreAdapter
import com.mg_group.womniz.Ui.ActivityHome.FragmentHome.Utils.TodayDealAdapter


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    private  var todayDealAdapter = TodayDealAdapter(listOf(
        TodayDealData(
            R.drawable.today_deal1
        ),
        TodayDealData(
            R.drawable.today_deal2
        ),
        TodayDealData(
            R.drawable.today_deal3
        ),
        TodayDealData(
            R.drawable.today_deal1
        ),

    ))

    private  var categoryAdapter = CategoryAdapter(listOf(
        CategoryData(
            "Food",
            R.drawable.img_food
        ),
        CategoryData(
            "Electronics",
            R.drawable.img_electroincs
        ),
        CategoryData(
            "Fashion",
            R.drawable.img_fashon
        ),
        CategoryData(
            "Food",
            R.drawable.img_food
        )

        ))

    private  var storesAdapter = StoreAdapter(listOf(
        StoreData(
            "Buffalo Burger",
            category = "Food",
            rate = "4.5",
            R.drawable.img_buffalo
        ),
        StoreData(
            "Papa Johns",
            category = "Food",
            rate = "2.5",
            R.drawable.img_johns
        ),
        StoreData(
            "Buffalo Burger",
            category = "Food",
            rate = "4.5",
            R.drawable.img_buffalo
        ),
        StoreData(
            "Papa Johns",
            category = "Food",
            rate = "2.5",
            R.drawable.img_johns
        ),

    ))




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)

        binding.recyclerTodayDeals.layoutManager = LinearLayoutManager(requireContext()
            , LinearLayoutManager.HORIZONTAL, true)
        binding.recyclerTodayDeals.adapter = todayDealAdapter

        binding.recyclerCategory.layoutManager = LinearLayoutManager(requireContext()
            , LinearLayoutManager.HORIZONTAL, true)
        binding.recyclerCategory.adapter = categoryAdapter

        binding.recyclerStores.layoutManager = LinearLayoutManager(requireContext()
            , LinearLayoutManager.HORIZONTAL, true)
        binding.recyclerStores.adapter = storesAdapter

        return binding.root
    }

}