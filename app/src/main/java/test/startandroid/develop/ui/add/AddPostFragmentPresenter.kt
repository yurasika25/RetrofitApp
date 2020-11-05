package test.startandroid.develop.ui.add

import test.startandroid.develop.mvp.BasicPresenter

class AddPostFragmentPresenter : BasicPresenter<AddPostFragmentView?>(){
    fun onCreateButtonClicked(login: String, password: String) {
        if (login >= 0.toString() && password >=0.toString()) {
            getView()?.onBack()
        } else {
            getView()?.onCredentialsWrong()

        }
    }
}