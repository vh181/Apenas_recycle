package com.gv.recycle.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gv.recycle.R
import com.gv.recycle.data.Repository

class RepositoryAdapter (val repository :MutableList<Repository>) : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.repository_list_item,parent,false)
        return  RepositoryViewHolder(view)
    }

    override fun getItemCount(): Int = repository.size
    
    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
      holder.bind(repository[position])
    }




    inner class RepositoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(repository: Repository) {

        }

    }
}