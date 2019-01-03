package tech.cursor.com.geez_dictionary.Daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import tech.cursor.com.geez_dictionary.Entities.Word

@Dao
interface WordDao
{
    @Query("select * from word_table")
    fun getAllWords(): LiveData<List<Word>>

    @Query("select * from word_table where word like :wrd LIMIT 40")
    fun getSearchWord(wrd: Word): LiveData<List<Word>>

}