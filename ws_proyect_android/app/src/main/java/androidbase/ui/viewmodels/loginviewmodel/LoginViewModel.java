package androidbase.ui.viewmodels.loginviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class LoginViewModel extends ViewModel {

    private final MutableLiveData<String> labelUser;
    private final MutableLiveData<String> textUser;

    private LoginFormViewModel theLoginForm;

    public LoginViewModel(){
        labelUser = new MutableLiveData<>();
        labelUser.setValue("User");

        textUser = new MutableLiveData<>();
        textUser.setValue("pepitoperez@example.com");

    }

    public LiveData<String> getLabelUser(){
        return labelUser;
    }

    public LiveData<String> getTextUser(){
        return textUser;
    }

    public void setTextUser(String newUser) {
        textUser.setValue(newUser);
    }
}


