package tech.cursor.com.geez_dictionary.Setting

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import tech.cursor.com.geez_dictionary.R

class GeezSettingFragment: PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference,rootKey)
    }
}