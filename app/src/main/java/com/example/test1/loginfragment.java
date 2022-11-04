package com.example.test1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link loginfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class loginfragment extends Fragment {

    // ad components
    EditText EtEmail,EtPassword;
    Button Bt;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public loginfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment loginfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static loginfragment newInstance(String param1, String param2) {
        loginfragment fragment = new loginfragment();
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
        return inflater.inflate(R.layout.fragment_loginfragment, container, false);
    }

    // add onstart
    @Override
    public void onStart() {
        super.onStart();
        connectcomponents();
    }

    private void connectcomponents() {
        EtEmail= getView().findViewById(R.id.EtEmailLogin);
        EtPassword=getView().findViewById(R.id.EtPasswordLogin);
        Bt=getView().findViewById(R.id.BtLogin);
        Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String E=EtEmail.getText().toString();
                String P=EtPassword.getText().toString();
                if(E.isEmpty()||P.isEmpty()){
                    return;
                }
            }
        });
    }
}