package com.example.reportofcovid

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso



class CountriesAdapter(private val countriesList: List<MyCountry>): RecyclerView.Adapter<CountriesAdapter.ViewHolder>()
{
    class ViewHolder (itemView : View): RecyclerView.ViewHolder(itemView)
    {
        var  imageView = itemView.findViewById<ImageView>(R.id.ivFlag)
        var  tvTitle = itemView.findViewById<TextView>(R.id.tvTittle)
        var  tvCases = itemView.findViewById<TextView>(R.id.tvCases)

        fun bind_(country: MyCountry)
        {
            val name = "Cases : $ {country.cases.toString}"
            tvTitle.text = country.country
            tvCases.text = name
            Picasso.get().load(country.countryInfo.flag).into(imageView);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("Response", "List Count :${countriesList.size}",)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}