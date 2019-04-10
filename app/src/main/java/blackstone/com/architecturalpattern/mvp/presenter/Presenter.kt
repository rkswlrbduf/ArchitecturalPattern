package blackstone.com.architecturalpattern.mvp.presenter

import blackstone.com.architecturalpattern.model.User

class Presenter: Contract.Presenter {

    private lateinit var view: Contract.View
    private lateinit var user: User

    override fun clicked() {
        view.setFullNameText(user.getFullName())
    }

    override fun setView(view: Contract.View) {
        this.view = view
    }

    override fun setName() {
        user = User("first", "last")
    }

}
