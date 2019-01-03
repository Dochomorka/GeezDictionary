package tech.cursor.com.geez_dictionary.Setting

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import tech.cursor.com.geez_dictionary.R


class GeezSettingActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_preference)

        supportFragmentManager.beginTransaction()
            .add(R.id.setting_container,GeezSettingFragment())
            .commit();
    }
}