package dev.csg.survivalcoding13_re


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.csg.survivalcoding13_re.databinding.ItemTodoBinding
import dev.csg.survivalcoding13_re.db.Todo
import dev.csg.survivalcoding13_re.db.TodoListViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val viewModel = ViewModelProviders.of(requireActivity()).get(TodoListViewModel::class.java)
//
////        val adapter = TodoAdapter()
//
//        val adapter = TodoAdapter{
//
//        }
//        recycler_view.layoutManager = LinearLayoutManager(requireContext())
//        recycler_view.adapter = adapter
//
//        viewModel.getAll().observe(this, Observer {
//            adapter.items = it
//            adapter.notifyDataSetChanged()
//        })


        fab_add.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_editFragment)

        }
    }


//    class TodoAdapter(private val clickListener: (todo: Todo) -> Unit) :
//        RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
//        class TodoViewHolder(val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root)
//
//        var items = listOf<Todo>()
//
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
//            val view = LayoutInflater.from(parent.context)
//                .inflate(R.layout.item_todo, parent, false)
//
//            val viewHolder = TodoViewHolder(ItemTodoBinding.bind(view))
//
//            view.setOnClickListener {
//                clickListener.invoke(items[viewHolder.adapterPosition])
//            }
//            return TodoViewHolder(ItemTodoBinding.bind(view))
//        }
//
//        override fun getItemCount() = items.size
//
//        override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
//            holder.binding.todo = items[position]
//        }
//    }

}


