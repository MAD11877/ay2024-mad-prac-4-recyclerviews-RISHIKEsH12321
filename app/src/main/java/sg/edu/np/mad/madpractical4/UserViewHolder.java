package sg.edu.np.mad.madpractical4;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;
public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView des;

    ImageView smallImg;

    ImageView bigImg;
    private static final String TAG = "HolderActivity";
    public UserViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.tvName);
        des = itemView.findViewById(R.id.tvDes);
        smallImg = itemView.findViewById(R.id.ivImageSmall);
        bigImg = itemView.findViewById(R.id.ivImageBig);
        bigImg.setVisibility(View.GONE);


        smallImg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Profile");
                builder.setMessage(name.getText());
                builder.setCancelable(true);

                builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent listActivity = new Intent(smallImg.getContext(), MainActivity.class);
                        listActivity.putExtra("Name",name.getText());
                        listActivity.putExtra("Des",des.getText());
                        startActivity(v.getContext(), listActivity, null);
                        return;
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();

            }
        });
    }
}
