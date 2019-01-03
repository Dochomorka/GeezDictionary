package tech.cursor.com.geez_dictionary.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

/**
 * id: Identifies word instantly! this will be autogenerated automatically by the room (autoincrement)
 * word: The Actual word
 * def: Word definitions
 * synonyms: word Synonyms
 * antonyms: word antonyms
 */
@Entity(tableName = "word")
data class Word(
    @PrimaryKey(autoGenerate = true)val id: Int,
    @NotNull val word: String,
    @NotNull val def: String,
    val synonyms:String,
    val antonyms: String)