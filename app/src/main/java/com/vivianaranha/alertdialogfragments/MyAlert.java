package com.vivianaranha.alertdialogfragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by vivianaranha on 1/26/16.
 */
public class MyAlert extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("My Dialog");

//        builder.setMessage("Do you like this Dialog");

//        builder.setItems(R.array.titles, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(getActivity(),"Item at "+which +" was clicked", Toast.LENGTH_LONG).show();
//
//            }
//        });

//        builder.setMultiChoiceItems(R.array.titles, null, new DialogInterface.OnMultiChoiceClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
//                Toast.makeText(getActivity(),"Item at "+which +" is "+ isChecked, Toast.LENGTH_LONG).show();
//
//            }
//        });

//        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(getActivity(),"No was clicked", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(getActivity(),"Yes was clicked", Toast.LENGTH_LONG).show();
//            }
//        });

        LayoutInflater inflator = getActivity().getLayoutInflater();
        View view = inflator.inflate(R.layout.custom_layout, null);
        builder.setView(view);

        Dialog dialog = builder.create();
        return dialog;



    }
}
