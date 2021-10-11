#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ${NAME} : RecyclerView.Adapter<${Model}Adapter.${ViewHolder_NAME}>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${ViewHolder_NAME} {
        val view = LayoutInflater.from(context).inflate(R.layout.${item_NAME}, parent, false)
        return ${ViewHolder_NAME}(view)
    }

    override fun getItemCount() = OJGName.size

    override fun onBindViewHolder(holder: ${ViewHolder_NAME}, position: Int) {
        holder.bind(data[position])
    }

    class ${ViewHolder_NAME}(itemView: View) : RecyclerView.${ViewHolder_NAME}(itemView) {
        fun bind(item: ${Model}) = with(itemView) {
        // TODO: Bind the data with View
    }
    }
}