package com.example.apicalling

    import android.content.Context
    import android.support.v7.widget.RecyclerView
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import kotlinx.android.synthetic.main.api_screen_layout.view.*

class RecyclerActivity(private val apiList:ArrayList<JsonFile>,private val context  : Context):RecyclerView.Adapter<RecyclerActivity.ViewHolder>() {
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bind(apiList[p1], context)
    }
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.api_screen_layout, parent, false)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int = apiList.count()

         class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            fun bind(apiList: JsonFile, context: Context) {
                itemView.tvTitle.text=apiList.title
                itemView.tvBody.text=apiList.body

            }

        }

}