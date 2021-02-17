package com.sr.zoo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sr.zoo.databinding.ItemTicketBinding

class RecyclerAdapter(private val animalsList: ArrayList<ZooAnimal>) : RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = ItemTicketBinding.inflate(LayoutInflater.from(parent.context))
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val zooAnimal = animalsList[position]
        holder.itemBinding.tvAnimalName.text = zooAnimal.animalName
        holder.itemBinding.tvAnimalDescription.text = zooAnimal.description
        holder.itemBinding.ivAnimalImage.setImageResource(zooAnimal.image!!)
    }

    override fun getItemCount(): Int = animalsList.size
}

class RecyclerViewHolder(binding: ItemTicketBinding) : RecyclerView.ViewHolder(binding.root) {
    val itemBinding = binding
}
