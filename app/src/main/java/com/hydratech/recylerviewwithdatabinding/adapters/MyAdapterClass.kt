package com.hydratech.recylerviewwithdatabinding.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hydratech.recylerviewwithdatabinding.databinding.SinglerowdesignBinding
import com.hydratech.recylerviewwithdatabinding.model.Students

class MyAdapterClass(val context: Context,val list: List<Students>) : RecyclerView.Adapter<MyAdapterClass.ViewHolder>() {

    class ViewHolder( val singleRowDesignBinding: SinglerowdesignBinding)
        : RecyclerView.ViewHolder(singleRowDesignBinding.root){
//            val binding = singleRowDesignBinding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val binding = SinglerowdesignBinding.inflate(inflate,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val students = list[position]
//            holder.binding.studentObject = students
        holder.singleRowDesignBinding.studentObject =students

    }

    override fun getItemCount(): Int {
        return list.size
    }


}