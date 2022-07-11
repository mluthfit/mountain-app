package com.biliance.submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    private lateinit var nameMount: TextView
    private lateinit var photoMount: ImageView
    private lateinit var locationMount: TextView
    private lateinit var heightMount: TextView
    private lateinit var typeMount: TextView
    private lateinit var descriptionMount: TextView
    private lateinit var btnFavorite: Button
    private lateinit var btnShare: Button

    companion object {
        const val EXTRA_MOUNT = "extra_mount"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        nameMount = findViewById(R.id.detail_name_mount)
        photoMount = findViewById(R.id.detail_photo_mount)
        locationMount = findViewById(R.id.detail_location_mount)
        heightMount = findViewById(R.id.detail_height_mount)
        typeMount = findViewById(R.id.detail_type_mount)
        descriptionMount = findViewById(R.id.detail_description_mount)
        btnFavorite = findViewById(R.id.btn_favorite)
        btnShare = findViewById(R.id.btn_share)

        val mount: Mountain = intent.getSerializableExtra(EXTRA_MOUNT) as Mountain

        setActionBarTitle(mount.name)
        fillContentMount(mount)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun fillContentMount(mount: Mountain) {
        nameMount.text = mount.name
        locationMount.text = mount.location
        heightMount.text = mount.height
        typeMount.text = mount.type
        descriptionMount.text = mount.description

        Glide.with(this@DetailActivity)
            .load(mount.photo)
            .apply(RequestOptions().override(350, 550))
            .into(photoMount)

        createToastListener(
            btnFavorite,
            "Anda menyukai konten ${mount.name}"
        )

        createToastListener(
            btnShare,
            "Anda membagikan konten ${mount.name}"
        )
    }

    private fun createToastListener(button: Button, text: String) {
        button.setOnClickListener {
            Toast.makeText(
                this@DetailActivity,
                text,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}