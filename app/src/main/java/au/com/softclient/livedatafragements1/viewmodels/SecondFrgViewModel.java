package au.com.softclient.livedatafragements1.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//Nothing
public class SecondFrgViewModel extends ViewModel {
    private MutableLiveData<String> message = new MutableLiveData<>();
    public SecondFrgViewModel() {
        message.setValue("Constructor Initial-2");
    }
    public void setMessage(String textVal){
        message.setValue(textVal);
    }
    public LiveData<String> getMessage(){
        return message;
    }
}
