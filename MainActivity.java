package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1, sp2;
    EditText ed1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);


        String[] from = {"USD", "Euro", "Dinar", "INR"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        String[] to = {"USD", "Euro", "Dinar", "INR"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());

                if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "INR") {
                    tot = amount * 74.18;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();

                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "INR") {
                    tot = amount * 87.37;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();

                } else if (sp1.getSelectedItem().toString() == "Dinar" && sp2.getSelectedItem().toString() == "INR") {
                    tot = amount * 246.84;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();

                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 1.18;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();

                }
                else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Dinar") {
                    tot = amount * 0.35;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Euro") {
                    tot = amount * 0.85;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Dinar") {
                    tot = amount * 0.30;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Dinar" && sp2.getSelectedItem().toString() == "Euro") {
                    tot = amount * 2.83;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Dinar" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 3.33;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "Dinar" && sp2.getSelectedItem().toString() == "Dinar") {
                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Euro") {
                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "INR") {
                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 0.013;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "Euro") {
                    tot = amount * 0.011;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "Dinar") {
                    tot = amount * 0.0041;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
            }
            });


        }


    }

