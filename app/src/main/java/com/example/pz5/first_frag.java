package com.example.pz5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class first_frag extends Fragment {
    View view;

    public first_frag(){
        super(R.layout.first_fragment);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.first_fragment, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            TextView textView = (TextView) view.findViewById(R.id.TextFirst);
            textView.setText(bundle.getString("getDepositMoneyKey"));
        }
        view.findViewById(R.id.make_an_appointment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("mainText", String.valueOf(((EditText) view
                        .findViewById(R.id.EditFirst))
                        .getText()));

                Navigation.findNavController(view).navigate(R.id.action_first_frag_to_second_frag);
            }
        });

        return view;
    }
}

