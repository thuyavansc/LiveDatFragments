package au.com.softclient.livedatafragements1.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class FirstFragViewModel extends ViewModel {
    private MutableLiveData<String> message = new MutableLiveData<>();
    public FirstFragViewModel() {
        message.setValue("Constructor Initial-1");
    }
    public void setMessage(String textVal){
        message.setValue(textVal);
    }
    public LiveData<String> getMessage(){
        return message;
    }

}
