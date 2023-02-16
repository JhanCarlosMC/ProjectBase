package androidbase.ui.viewmodels.loginviewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginFormViewModel extends ViewModel {
    private final MutableLiveData<String> labelUser;

    public LoginFormViewModel(MutableLiveData<String> labelUser) {
        this.labelUser = labelUser;
    }
}
