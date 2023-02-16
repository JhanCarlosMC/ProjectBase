package androidbase.ui.viewparts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ws_proyect_android.R;


public class LoginTestViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> mText2;

    public LoginTestViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is a test text");

        mText2 = new MutableLiveData<>();
        mText2.setValue("No is a text");

    }

    public LiveData<String> getText2(){
        return mText2;
    }

    public LiveData<String> getText(){
        return mText;
    }


}
