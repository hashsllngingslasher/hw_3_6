package com.example.hw_3_6

import android.content.Context
import android.graphics.ColorSpace.Adaptation
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw_3_6.databinding.ItemPhoneBinding

class PhoneAdapter(val itemPhoneList: ArrayList<PhoneModel>): Adapter<ViewHolder>(){
//    (private val context: Context, private val phoneItemList:MutableList<PhoneItem>)
//    : RecyclerView.Adapter<PhoneAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPhoneBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = itemPhoneList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itemPhoneList[position])
    }
}

class ViewHolder(val binding: ItemPhoneBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(phoneItem: PhoneModel){
        binding.tvPhoneName.text = phoneItem.name
        binding.imgPhone.loadImage(phoneItem.image)
    }
}