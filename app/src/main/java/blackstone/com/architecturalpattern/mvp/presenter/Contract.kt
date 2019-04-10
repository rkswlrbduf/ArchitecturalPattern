package blackstone.com.architecturalpattern.mvp.presenter

interface Contract {

    interface View {
        fun setFullNameText(fullName: String)
    }

    interface Presenter {
        fun setView(view: View)
        fun setName()
        fun clicked()
    }

}
