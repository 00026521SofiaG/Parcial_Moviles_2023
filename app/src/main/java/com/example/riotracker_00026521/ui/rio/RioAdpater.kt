package com.example.riotracker_00026521.ui.rio

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.riotracker_00026521.R
import com.example.riotracker_00026521.data.model.RioModel

class RioAdpater(private val clickListener: (RioModel)-> Unit): RecyclerView.Adapter<RioViewHolder>() {
    private var data : List<RioModel>? = null

    fun setData(data: List<RioModel>){
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RioViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_rio , parent  , false)
        return RioViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data?.size ?:0
    }

    override fun onBindViewHolder(holder: RioViewHolder, position: Int) {
        data?. let {
            val river = it[position]
            holder.bind(river, clickListener)
        }
    }
}