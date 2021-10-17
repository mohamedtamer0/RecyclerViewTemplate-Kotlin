#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ${NAME} : RecyclerView.Adapter<${Model}Adapter.${ViewHolder_NAME}>() {

    private var binding: ${BINDING_CLASS}? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${ViewHolder_NAME} {

        binding =
        ${BINDING_CLASS}.inflate(LayoutInflater.from(parent.context), parent, false)

        return ${ViewHolder_NAME}(binding!!);
    }

    override fun getItemCount() = OJGName.size

    override fun onBindViewHolder(holder: ${ViewHolder_NAME}, position: Int) {
        with(holder){
            // Do your binding here.
        }
    }

    inner class ${ViewHolder_NAME}(val binding: ${BINDING_CLASS}) :
        RecyclerView. ${ViewHolder_NAME}(binding.root)


}