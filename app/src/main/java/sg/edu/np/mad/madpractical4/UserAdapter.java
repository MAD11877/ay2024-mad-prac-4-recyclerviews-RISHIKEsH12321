package sg.edu.np.mad.madpractical4;

import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    ArrayList<User> data;

    private static final String TAG = "UserAdapter";

    public UserAdapter(ArrayList<User> input) {
        data = input;
    }

    public UserViewHolder onCreateViewHolder(
            ViewGroup parent,
            int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.custom_activity_list,
                parent,
                false);
        return new UserViewHolder(item);
    }

    public void onBindViewHolder(
            UserViewHolder holder,
            int position) {
        User s = data.get(position);
        holder.name.setText(s.name);
        holder.des.setText(s.description);

        Log.d(TAG, "onBindViewHolder Name: " + s.name);
        char Lastchar = s.name.charAt(s.name.length() - 1);
        if (Lastchar == '7'){
            holder.bigImg.setVisibility(View.VISIBLE);
            Log.d(TAG, "onBindViewHolder: Visible" );
        }
        else{
            holder.bigImg.setVisibility(View.GONE);
        }
    }

    public int getItemCount() {
        return data.size();
    }
}


