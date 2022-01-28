package com.example.sciencecalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sciencecalculator.databinding.FragmentCalculatorBinding;


public class CalculatorFragment extends Fragment {
    double num1,num2;
    int count1=0;

    boolean addition ,substraction,multi,division,modules;


    FragmentCalculatorBinding binding;

    public CalculatorFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false);

        binding.btr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              binding.inputText.setText(binding.inputText.getText()+"1");

            }
        });
        binding.btr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"2");
            }
        });
        binding.btr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"3");
            }
        });
        binding.btr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"4");
            }
        });
        binding.btr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"5");
            }
        });
        binding.btr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"6");
            }
        });
        binding.btr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"7");
            }
        });
        binding.btr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"8");
            }
        });
        binding.btr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"9");
            }
        });
        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"0");
            }
        });
        binding.point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+".");
            }
        });
        binding.dzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText(binding.inputText.getText()+"00");
            }
        });

        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.inputText.length() != 0) {
                    String text = binding.inputText.getText().toString();
                    if (text.endsWith("."))
                        count1 = 0;

                    String newText = text.substring(0, text.length() - 1);
                    binding.inputText.setText(newText);
                }
            }
        });
        binding.allclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputText.setText("");
                binding.resultview.setText("");

            }
        });
        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.inputText == null) {
                    binding.inputText.setText("");
                } else {
                    num1 = Float.parseFloat(binding.inputText.getText()+"");
                    addition = true;
                    binding.inputText.setText(null);
                }
            }
        });

        binding.substra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(binding.inputText.getText() + "");
                substraction = true;
                binding.inputText.setText(null);
            }
        });

        binding.multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(binding.inputText.getText() + "");
                multi = true;
                binding.inputText.setText(null);
            }
        });

        binding.divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(binding.inputText.getText() + "");
                division = true;
                binding.inputText.setText(null);
            }
        });

        binding.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(binding.inputText.getText() + "");

                if (addition == true) {
                    binding.resultview.setText(num1 + num2 + "");
                    addition = false;
                }

                if (substraction == true) {
                    binding.resultview.setText(num1 - num2 + "");
                    substraction = false;
                }

                if (multi == true) {
                    binding.resultview.setText(num1 * num2 + "");
                    multi = false;
                }

                if (division == true) {
                    binding.resultview.setText(num1 / num2 + "");
                    division = false;
                }
            }
        });


        return binding.getRoot();

    }
}
