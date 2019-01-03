package tech.cursor.com.geez_dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /**
     * Note
     * Please use kotlin Language code for uniformity, but if you are not aware of kotlin Language
     * You man use built in java to kotlin converter inside you android studio if you are using android studio as you primary development environment
     * to convert any java code to kotlin equivalent please follow the following steps
     * 1. open Your android studio program
     * 2. after opening, select Code tab inside android studio
     * 3. after selecting, find the option 'Convert Java File to Kotlin File' and select it!
     *
     * Android Studio will do the rest for You!
     *  2011 አመተምህረት ታህሳስ ፳፬
     *  wednesday 2019 january 2
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        val menuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.main_activity_option,menu!!)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
        val menuItemId = item!!.itemId

        when (menuItemId)
        {
            R.id.setting -> {
            Toast.makeText(this,"Holla",Toast.LENGTH_LONG).show()
        }
        }

        return true
    }
}
