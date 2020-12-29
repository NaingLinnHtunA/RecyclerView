package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.LatestItemsBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val latestItemList : ArrayList<LatestItems> = ArrayList()

        latestItemList.add((LatestItems("Hello One",123)))
        latestItemList.add((LatestItems("Hello Two",123)))
        latestItemList.add((LatestItems("Hello Three",123)))

        binding.recyclerLatest.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerLatest.adapter = LatestItemAdapter(latestItemList)

        val productItemList: ArrayList<ProductItems> = ArrayList()
        productItemList.add(ProductItems("IPhone 8 Plus","Apple"))
        productItemList.add(ProductItems("IPhone 9 Plus","Apple"))
        productItemList.add(ProductItems("IPhone X Plus","Apple"))

        binding.recyclerPopularProduct.layoutManager = LinearLayoutManager(this)
        binding.recyclerPopularProduct.adapter = ProductAdapter(productItemList)

        val countryList : ArrayList<CountryList> = ArrayList()
        countryList.add(CountryList("Myanmar"))
        countryList.add(CountryList("Japan"))
        countryList.add(CountryList("Korea"))
        countryList.add(CountryList("Indonesia"))
        countryList.add(CountryList("Singapore"))
        countryList.add(CountryList("Thailand"))
        countryList.add(CountryList("USA"))
        countryList.add(CountryList("Myanmar"))

        binding.recyclerCountry.layoutManager = GridLayoutManager(this, 2,GridLayoutManager.HORIZONTAL,false)
        binding.recyclerCountry.adapter = CountryAdapter(countryList)
    }
}