package dev.csg.survivalcoding13_re


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import dev.csg.survivalcoding13_re.db.Todo
import dev.csg.survivalcoding13_re.db.TodoListViewModel
import kotlinx.android.synthetic.main.fragment_edit.*

class EditFragment : Fragment() {
    // 전역으로 쓸 때,
    val viewModel: TodoListViewModel by lazy {
        ViewModelProviders.of(requireActivity()).get(TodoListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab_done.setOnClickListener {
            val title = todo_edit_text.text.toString()
            val date = calendarView.date

            viewModel.insert(Todo(title, date))
        }
    }

}

