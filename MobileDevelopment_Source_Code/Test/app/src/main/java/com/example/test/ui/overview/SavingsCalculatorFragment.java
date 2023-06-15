package com.example.test.ui.overview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.test.databinding.FragmentSavingsCalculatorBinding;

public class SavingsCalculatorFragment extends Fragment {

    private FragmentSavingsCalculatorBinding binding;

    EditText number1;
    EditText number2;
    EditText number3;
    int ans = 0;
    TextView result;

    public SavingsCalculatorFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSavingsCalculatorBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        number1 = (EditText) binding.editTextBills;
        number2 = (EditText) binding.editTextIncome;
        number3 = (EditText) binding.editTextImportantExpens;
        result = (TextView) binding.result;

        binding.buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //binding.result.setText(binding.editTextBills.getText());
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double num3 = Double.parseDouble(number3.getText().toString());

                double sum = num2 - num1 - num3;

                binding.result.setText(Double.toString(sum));
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}