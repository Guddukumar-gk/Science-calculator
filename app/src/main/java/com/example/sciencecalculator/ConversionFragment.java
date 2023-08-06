package com.example.sciencecalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.sciencecalculator.databinding.FragmentConversionBinding;

public class ConversionFragment extends Fragment implements View.OnClickListener {


    FragmentConversionBinding binding;
    private Double operand1 = null;
    private String pendingOperation = "=";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentConversionBinding.inflate(inflater,container,false);
        binding.allclearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.resultTextView.setText("");
                binding.newNumberTextView.setText("");

            }
        });

        binding.backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackspaceClick(v);
            }
        });


        // click function

        binding.button0.setOnClickListener(this);
        binding.button1.setOnClickListener(this);
        binding.button2.setOnClickListener(this);
        binding.button3.setOnClickListener(this);
        binding.button4.setOnClickListener(this);
        binding.button5.setOnClickListener(this);
        binding.button6.setOnClickListener(this);
        binding.button7.setOnClickListener(this);
        binding.button8.setOnClickListener(this);
        binding.button9.setOnClickListener(this);
        binding.buttonDot.setOnClickListener(this);
        binding.buttonmodule.setOnClickListener(this);
        binding.buttonEquals.setOnClickListener(this);
        binding.buttonDivide.setOnClickListener(this);
        binding.buttonMultiply.setOnClickListener(this);
        binding.buttonMinus.setOnClickListener(this);
        binding.buttonPlus.setOnClickListener(this);


        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button0:
                binding.newNumberTextView.append("0");
                break;
            case R.id.button1:
                binding.newNumberTextView.append("1");
                break;
            case R.id.button2:
                binding.newNumberTextView.append("2");
                break;
            case R.id.button3:
                binding.newNumberTextView.append("3");
                break;
            case R.id.button4:
                binding.newNumberTextView.append("4");
                break;
            case R.id.button5:
                binding.newNumberTextView.append("5");
                break;
            case R.id.button6:
                binding.newNumberTextView.append("6");
                break;
            case R.id.button7:
                binding.newNumberTextView.append("7");
                break;
            case R.id.button8:
                binding.newNumberTextView.append("8");
                break;
            case R.id.button9:
                binding.newNumberTextView.append("9");
                break;
            case R.id.buttonDot:
                if (binding.newNumberTextView.getText().toString().contains(".")) {
                    return;
                } else {
                    binding.newNumberTextView.append(".");
                }
                break;
            case R.id.buttonEquals:
                String operation = pendingOperation;
                if (operand1 == null) {
                    operand1 = Double.valueOf(binding.newNumberTextView.getText().toString());
                } else {
                    Double operand2 = Double.valueOf(binding.newNumberTextView.getText().toString());
                    if (operation.equals("=")) {
                        operation = pendingOperation;
                    }
                    switch (operation)
                    {
                        case "/":
                            operand1 /= operand2;
                            break;
                        case "*":
                            operand1 *= operand2;
                            break;
                        case "-":
                            operand1 -= operand2;
                            break;
                        case "+":
                            operand1 += operand2;
                            break;
                    }
                }
        }

    }

    public void onBackspaceClick(View view) {
        String currentText = binding.newNumberTextView.getText().toString();
        if (currentText.length() > 0) {
            String newText = currentText.substring(0, currentText.length() - 1);
            binding.newNumberTextView.setText(newText);
        }
    }

}