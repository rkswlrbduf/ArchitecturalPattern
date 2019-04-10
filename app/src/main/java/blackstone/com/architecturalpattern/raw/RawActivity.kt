package blackstone.com.architecturalpattern.raw

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import blackstone.com.architecturalpattern.R
import kotlinx.android.synthetic.main.activity_main.*

class RawActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btClick.setOnClickListener {
            tvState.text = getFullName("first", "last")
        }

    }

    private fun getFullName(firstName: String, lastName: String): String = firstName + lastName

}
