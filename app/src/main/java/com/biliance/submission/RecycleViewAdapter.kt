package com.biliance.submission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecycleViewAdapter(private val listMountains: ArrayList<Mountain>): RecyclerView.Adapter<RecycleViewAdapter.CardViewHolder>() {
    private lateinit var detailListener: DetailListener

    interface DetailListener {
        fun onClick(mount: Mountain)
    }

    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var nameText: TextView = itemView.findViewById(R.id.item_name_mount)
        var photoImage: ImageView = itemView.findViewById(R.id.item_image_mount)
        var locationText: TextView = itemView.findViewById(R.id.item_location_mount)
        var heightText: TextView = itemView.findViewById(R.id.item_height_mount)
        var typeText: TextView = itemView.findViewById(R.id.item_type_mount)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail_mount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card_mountain, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val mount = listMountains[position]
        Glide.with(holder.itemView.context)
            .load(mount.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.photoImage)

        holder.nameText.text = mount.name
        holder.locationText.text = mount.location
        holder.heightText.text = mount.height
        holder.typeText.text = mount.type

        holder.btnDetail.setOnClickListener {
            detailListener.onClick(mount)
        }
    }

    override fun getItemCount(): Int {
        return listMountains.size
    }

    fun setItemClickedListener(detailListener: DetailListener) {
        this.detailListener = detailListener
    }
}