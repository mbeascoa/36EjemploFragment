package com.example.a36ejemplofragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimerFragmento extends Fragment {

    private Button btn1;
    private EditText edit1;
    private TextView text1;


    public PrimerFragmento() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_primer_fragmento, container, false);
        btn1 = (Button)view.findViewById(R.id.btnPrimerFragment);
        edit1 = (EditText)view.findViewById(R.id.editTextFragment);
        text1 = (TextView)view.findViewById(R.id.tv_Fragment);

        btn1.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                String nombre = edit1.getText().toString();
                text1.setText(nombre.toUpperCase());

            }

        });

        return view;
    }


}