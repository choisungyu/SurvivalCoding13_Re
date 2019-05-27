package dev.csg.survivalcoding13_re.db

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.room.Room
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TodoListViewModel(application: Application) : AndroidViewModel(application) {

    val db: AppDatabase by lazy {

        Room.databaseBuilder(
            application,
            AppDatabase::class.java, "database-name"
        )
            .build()
    }

    fun getAll(): LiveData<List<Todo>> {
        return db.todoDao().getAll()
    }

    fun insert(todo: Todo) {
        CoroutineScope(Dispatchers.IO).launch {

            db.todoDao().insert(todo)

        }
    }

    fun update(todo: Todo) {
        db.todoDao().update(todo)
    }

    fun delete(todo: Todo) {
        db.todoDao().delete(todo)
    }
}