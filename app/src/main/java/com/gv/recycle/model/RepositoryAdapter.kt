package com.gv.recycle.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gv.recycle.R
import com.gv.recycle.data.Repository

class RepositoryAdapter (val repository :MutableList<Repository>) : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.repository_list_item, parent, false)
        return RepositoryViewHolder(view)
    }

    override fun getItemCount(): Int = repository.size

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.bind(repository[position])
    }


    inner class RepositoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageIconRepositoryAdapter: ImageView = itemView.findViewById(R.id.imageIcon)
        var userNameRepositoryAdapter: TextView = itemView.findViewById(R.id.userName)
        var surNameRepositoryAdapter: TextView = itemView.findViewById(R.id.surName)
        var repositoryNameRepositoryAdapter: TextView = itemView.findViewById(R.id.repositoryName)
        var repositoryTextRepositoryAdapter: TextView = itemView.findViewById(R.id.repositoryText)
        var numberGitRepositoryAdapter: TextView = itemView.findViewById(R.id.numberGit)
        var numberStarRepositoryAdapter: TextView = itemView.findViewById(R.id.numberStar)
        var gitIconRepositoryAdapter: ImageView = itemView.findViewById(R.id.gitIcon)
        var starIconRepositoryAdapter: ImageView = itemView.findViewById(R.id.starIcon)
        fun bind(repository: Repository) {
            with(repository) {
                imageIconRepositoryAdapter.setImageResource(R.drawable.user)
                userNameRepositoryAdapter.text = userNameRepository
                surNameRepositoryAdapter.text = surNameRepository
                repositoryNameRepositoryAdapter.text = repositoryNameRepository
                repositoryTextRepositoryAdapter.text = repositoryTextRepository
                numberGitRepositoryAdapter.text = numberGitRepository
                numberStarRepositoryAdapter.text = numberStarRepository
                gitIconRepositoryAdapter.setImageResource(R.drawable.ic_share)
                starIconRepositoryAdapter.setImageResource(R.drawable.ic_star)


            }

        }


    }
}