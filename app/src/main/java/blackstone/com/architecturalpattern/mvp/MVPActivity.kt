package blackstone.com.architecturalpattern.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import blackstone.com.architecturalpattern.R
import blackstone.com.architecturalpattern.mvp.presenter.Contract
import blackstone.com.architecturalpattern.mvp.presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MVPActivity : AppCompatActivity(), Contract.View {

    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter()
        presenter.setView(this)
        presenter.setName()

        btClick.setOnClickListener {
            presenter.clicked()
        }

    }

    override fun setFullNameText(fullName: String) {
        tvState.text = fullName
    }

}
