package tech.cursor.com.geez_dictionary.Daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import tech.cursor.com.geez_dictionary.Entities.History
import tech.cursor.com.geez_dictionary.Entities.Word

@Dao
interface HistoryDao {
    @Query("select * from history")
    fun getAllHistory(): LiveData<List<History>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addHistory(history: History): Int
}