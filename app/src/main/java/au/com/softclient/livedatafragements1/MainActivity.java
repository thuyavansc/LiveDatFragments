package au.com.softclient.livedatafragements1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import au.com.softclient.livedatafragements1.databinding.ActivityMainBinding;
import au.com.softclient.livedatafragements1.fragments.FirstFragment;
import au.com.softclient.livedatafragements1.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.btnF1.setOnClickListener(v->{
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(activityMainBinding.fragmentContainerView1.getId(), new FirstFragment())
                    .addToBackStack(null)
                    .commit();

        });
        activityMainBinding.btnF2.setOnClickListener(v->{
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(activityMainBinding.fragmentContainerView1.getId(), new SecondFragment())
                    .addToBackStack(null)
                    .commit();

        });
    }
}