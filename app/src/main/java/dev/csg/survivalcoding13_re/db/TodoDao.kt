package dev.csg.survivalcoding13_re.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {
    @Query("SELECT * FROM todo")
    fun getAll(): LiveData<List<Todo>>

    @Insert
    fun insert(todo: Todo)

    @Insert
    fun update(todo: Todo)

    @Insert
    fun delete(todo: Todo)
}