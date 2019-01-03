package tech.cursor.com.geez_dictionary.Repository

import android.app.Application
import androidx.lifecycle.LiveData
import tech.cursor.com.geez_dictionary.Database.GeezDictionaryDatabase
import tech.cursor.com.geez_dictionary.Entities.History
import tech.cursor.com.geez_dictionary.Entities.Word

class Repository(application: Application)
{

    var db: GeezDictionaryDatabase? = null
    var histories:LiveData<List<History>>? = null
    var words: LiveData<List<Word>>? = null

    init {
        db = GeezDictionaryDatabase.INSTANCE
        histories = db!!.historyDao().getAllHistory()
        words = db!!.wordDao().getAllWords()
    }



    fun getSearchHistories() = histories

    fun getDictionaryWords() = words
}

