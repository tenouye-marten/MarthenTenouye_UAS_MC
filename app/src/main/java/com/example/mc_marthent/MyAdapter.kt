package com.example.mc_marthent


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val namaList: ArrayList<ItemData>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
  private lateinit var mListener: onItemClickListener

  interface  onItemClickListener{
      fun onItemClick(position: Int)
  }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    class MyViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){
        val gambar:ImageView = itemView.findViewById(R.id.img)
        val judul:TextView = itemView.findViewById(R.id.jdl)
        val ayat:TextView = itemView.findViewById(R.id.ayt)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  itemView = LayoutInflater.from(parent.context).inflate(R.layout.perdata,parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.judul.text = currentItem.judul
        holder.ayat.text = currentItem.ayat

    }

    override fun getItemCount(): Int {
        return namaList.size
    }


}