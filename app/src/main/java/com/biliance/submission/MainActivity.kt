package com.biliance.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var rvMountains: RecyclerView

    private var title = "Informasi Gunung"
    private var list: ArrayList<Mountain> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMountains = findViewById(R.id.mountain_container)
        rvMountains.setHasFixedSize(true)

        list.addAll(MountainsData.listData)
        showRecyclerView()
        setActionBarTitle(title)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        doActionMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerView() {
        rvMountains.layoutManager = LinearLayoutManager(this)

        val adapter = RecycleViewAdapter(list)
        adapter.setItemClickedListener(object: RecycleViewAdapter.DetailListener {
            override fun onClick(mount: Mountain) {
                moveToDetailPage(mount)
            }
        })

        rvMountains.adapter = adapter
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun moveToDetailPage(mount: Mountain) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)

        intent.putExtra(DetailActivity.EXTRA_MOUNT, mount)
        startActivity(intent)
    }

    private fun moveToAboutPage() {
        val intent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(intent)
    }

    private fun quitApp() {
        this@MainActivity.finish()
        exitProcess(-1)
    }

    private fun doActionMenu(itemId: Int) {
        when(itemId) {
            R.id.menu_about -> moveToAboutPage()
            R.id.menu_quit -> quitApp()
        }
    }
}