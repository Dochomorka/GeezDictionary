package tech.cursor.com.geez_dictionary.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import tech.cursor.com.geez_dictionary.Daos.HistoryDao
import tech.cursor.com.geez_dictionary.Daos.WordDao
import tech.cursor.com.geez_dictionary.Entities.History
import tech.cursor.com.geez_dictionary.Entities.Word

@Database(entities = arrayOf(History::class, Word::class), version = 1)
abstract class GeezDictionaryDatabase : RoomDatabase() {

    abstract fun historyDao(): HistoryDao
    abstract fun wordDao(): WordDao

    companion object {

        @Volatile
        var INSTANCE: GeezDictionaryDatabase? = null

        internal fun getINSTANCE(context: Context?): GeezDictionaryDatabase? {
            if (context == null) {
                synchronized(GeezDictionaryDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.inMemoryDatabaseBuilder(
                            context!!.applicationContext,
                            GeezDictionaryDatabase::class.java
                        )
                            .build()
                    }
                }
            }

            return INSTANCE
        }
    }


}
