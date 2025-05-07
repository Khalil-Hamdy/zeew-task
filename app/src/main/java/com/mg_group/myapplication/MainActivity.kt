package com.mg_group.myapplication

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.cooltechworks.views.ScratchImageView
import com.mg_group.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener{
    private var _bindig: ActivityMainBinding? = null
    private val binding get() = _bindig!!
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _bindig = ActivityMainBinding.inflate(layoutInflater)
        //onClickMenuNavBar()
        binding.linearHome.setOnClickListener(this)
        binding.linearTrending.setOnClickListener(this)
        binding.linearSearch.setOnClickListener(this)
        binding.linearMyOrders.setOnClickListener(this)
        binding.linearProfile.setOnClickListener(this)

        //Fragment (HomeFragment) Begin
        val naveHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
                as NavHostFragment
        navController = naveHostFragment.navController

        /*navController.popBackStack()
        //Fragment (HomeFragment)
        navController.navigate(R.id.onBoardingFragment)*/
        linearHome()
        setContentView(binding.root)

    }


    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.linearHome->{
                linearHome()
            }
            R.id.linearTrending->{
                navController.popBackStack()
                //Fragment (HomeFragment)
                navController.navigate(R.id.trendingFragment)
                //Icon
                binding.imgHome.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgTrending.setColorFilter(ContextCompat.getColor(this, R.color.primary_color), PorterDuff.Mode.SRC_IN)
                binding.imgSearch.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgMyOrders.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgProfile.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                //text
                binding.txtHome.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtTrending.setTextColor(ContextCompat.getColor(this, R.color.primary_color))
                binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtMyOrders.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))

            }
            R.id.linearSearch->{
                navController.popBackStack()
                //Fragment (HomeFragment)
                navController.navigate(R.id.searchFragment)
                //Icon
                binding.imgHome.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgTrending.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgSearch.setColorFilter(ContextCompat.getColor(this, R.color.primary_color), PorterDuff.Mode.SRC_IN)
                binding.imgMyOrders.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgProfile.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                //text
                binding.txtHome.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtTrending.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.primary_color))
                binding.txtMyOrders.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))

            }
            R.id.linearMyOrders->{
                navController.popBackStack()
                //Fragment (HomeFragment)
                navController.navigate(R.id.myOrdersFragment)
                //Icon
                binding.imgHome.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgTrending.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgSearch.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgMyOrders.setColorFilter(ContextCompat.getColor(this, R.color.primary_color), PorterDuff.Mode.SRC_IN)
                binding.imgProfile.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                //text
                binding.txtHome.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtTrending.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtMyOrders.setTextColor(ContextCompat.getColor(this, R.color.primary_color))
                binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))

            }
            R.id.linearProfile->{
                navController.popBackStack()
                //Fragment (HomeFragment)
                navController.navigate(R.id.profileFragment)
                //Icon
                binding.imgHome.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgTrending.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgSearch.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgMyOrders.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
                binding.imgProfile.setColorFilter(ContextCompat.getColor(this, R.color.primary_color), PorterDuff.Mode.SRC_IN)
                //text
                binding.txtHome.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtTrending.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtMyOrders.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
                binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.primary_color))

            }
            else ->{}
        }

    }
    private fun linearHome(){
        navController.popBackStack()
        //Fragment (HomeFragment)
        navController.navigate(R.id.homeFragment)
        //Icon
        binding.imgHome.setColorFilter(ContextCompat.getColor(this, R.color.primary_color), PorterDuff.Mode.SRC_IN)
        binding.imgTrending.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
        binding.imgSearch.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
        binding.imgMyOrders.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
        binding.imgProfile.setColorFilter(ContextCompat.getColor(this, R.color.secoundry_color), PorterDuff.Mode.SRC_IN)
        //text
        binding.txtHome.setTextColor(ContextCompat.getColor(this, R.color.primary_color))
        binding.txtTrending.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
        binding.txtSearch.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
        binding.txtMyOrders.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))
        binding.txtProfile.setTextColor(ContextCompat.getColor(this, R.color.secoundry_color))

    }

}