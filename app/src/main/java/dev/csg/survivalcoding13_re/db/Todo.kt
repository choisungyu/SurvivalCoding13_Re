package dev.csg.survivalcoding13_re.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Todo(

    val title: String,
    val date: Long
) {

    // 초기화에서 뺌
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

}