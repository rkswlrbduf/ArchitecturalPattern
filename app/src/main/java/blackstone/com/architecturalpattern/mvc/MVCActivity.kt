package blackstone.com.architecturalpattern.mvc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import blackstone.com.architecturalpattern.R
import blackstone.com.architecturalpattern.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MVCActivity : AppCompatActivity() {

    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = User("first", "last")

        btClick.setOnClickListener {
            tvState.text = user.getFullName()
        }

    }

}
