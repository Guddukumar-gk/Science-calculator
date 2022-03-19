package com.example.sciencecalculator;

import static com.example.sciencecalculator.R.drawable.name;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sciencecalculator.databinding.FragmentEMIFargmentBinding;


public class EMIFargment extends Fragment {
    FragmentEMIFargmentBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEMIFargmentBinding.inflate(inflater,container,false);
        final EditText p = binding.amount;
        final EditText r = binding.Rate;
        final EditText t = binding.year;
        final Button btr = binding.button;
        final Button clear = binding.clear;
        final TextView emi = binding.emi;
        final TextView total = binding.totalAmount;
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (p.getText().toString().length() < 10)     //size as per your requirement
                {
                    p.requestFocus();
                    r.setText("");
                    t.setText("");
                    p.setText("");
                    total.setText("");
                    emi.setText("");
                }
            }
        });


        btr.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                String str1 = p.getText().toString();
                String str2 = r.getText().toString();
                String str3 = t.getText().toString();
                if (TextUtils.isEmpty(str1)) {
                    p.setError("Enter the amount ");
                    p.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    r.setError("Enter the insterest ");
                    r.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    t.setError("Enter the years ");
                    t.requestFocus();
                    return;
                }

                float p = Float.parseFloat(str1);
                float r = Float.parseFloat(str2);
                float y = Float.parseFloat(str3);
                float si = (p * r * y) / 100;


                emi.setText("Emi : " + String.valueOf(si));
                float ti = si + p;
                total.setText("TOTAL Amount : " + String.valueOf(ti));

            }
        });



        return binding.getRoot();
    }
}