package com.example.paraaaaaa;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class First extends Fragment {

    TextView textViewFirst;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        view.setBackgroundResource(R.color.DarkGreen);

        textViewFirst = view.findViewById(R.id.viewFirst);
        registerForContextMenu(textViewFirst);

        return view;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getActivity().getMenuInflater().inflate(R.menu.contextmenu_first, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.change_one) {
            textViewFirst.setText("Новый текст");
            return true;
        } else if (item.getItemId() == R.id.change_two) {
            textViewFirst.setText("Другой текст");
            return true;
        }
        return false;
    }

}
