package au.com.softclient.livedatafragements1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import au.com.softclient.livedatafragements1.R;
import au.com.softclient.livedatafragements1.databinding.FragmentFirstBinding;
import au.com.softclient.livedatafragements1.databinding.FragmentSecondBinding;
import au.com.softclient.livedatafragements1.viewmodels.FirstFragViewModel;
import au.com.softclient.livedatafragements1.viewmodels.SecondFrgViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentSecondBinding fragmentSecondBinding;
    private SecondFrgViewModel secondFrgViewModel;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentSecondBinding = FragmentSecondBinding.inflate(inflater, container, false);
        View view = fragmentSecondBinding.getRoot();

        // Obtain the ViewModel
        secondFrgViewModel = new ViewModelProvider(requireActivity()).get(SecondFrgViewModel.class);

        // Set the ViewModel and the lifecycle owner
        fragmentSecondBinding.setFrag2ViewModel(secondFrgViewModel);
        fragmentSecondBinding.setLifecycleOwner(this);

        fragmentSecondBinding.editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                secondFrgViewModel.setMessage(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;
    }
}