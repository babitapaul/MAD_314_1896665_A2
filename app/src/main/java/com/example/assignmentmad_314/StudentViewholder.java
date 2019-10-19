package com.example.assignmentmad_314;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class StudentViewholder {

    public class AnimalViewHolder extends RecyclerView.ViewHolder {

        public TextView id, Name, pwd;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.textView);
            Name = itemView.findViewById(R.id.textView2);
            pwd = itemView.findViewById(R.id.textView3);
        }

    }

}
