package com.example.riotracker_00026521.ui.rio

import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.riotracker_00026521.R
import com.example.riotracker_00026521.data.model.RioModel

class RioViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
    private var nameTextView = itemView.findViewById<TextView>(R.id.riverName)
    private var lenghtTextView = itemView.findViewById<TextView>(R.id.riverILenght)

    fun bind(river: RioModel, onClickListener: (RioModel)-> Unit){
        nameTextView.text = river.name
        lenghtTextView.text = river.lenght

        nameTextView.setOnClickListener {
            onClickListener(river)
        }

        lenghtTextView.setOnClickListener {
            onClickListener(river)
        }


    }
}