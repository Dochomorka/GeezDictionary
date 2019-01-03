package tech.cursor.com.geez_dictionary.Entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * id: Word Id
 * word: Actual word
 */
@Entity(tableName = "history")
data class History(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "word")
    @NonNull val word: String)