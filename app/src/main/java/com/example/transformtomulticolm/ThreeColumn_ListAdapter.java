package com.example.transformtomulticolm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThreeColumn_ListAdapter extends ArrayAdapter<User> {

    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<User> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        User user = users.get(position);

        if (user != null) {
            TextView Name = (TextView) convertView.findViewById(R.id.editName);
            TextView Phone = (TextView) convertView.findViewById(R.id.editPhone);
            TextView Email = (TextView) convertView.findViewById(R.id.editEmail);
            TextView Street = (TextView) convertView.findViewById(R.id.editStreet);

            if (Name != null) {
                Name.setText(user.getName());
            }
            if (Phone != null) {
                Phone.setText((user.getPhone()));
            }
            if (Email != null) {
                Email.setText((user.getEmail()));
            }
            if (Street != null) {
                Street.setText((user.getStreet()));
            }
        }

        return convertView;
    }
}