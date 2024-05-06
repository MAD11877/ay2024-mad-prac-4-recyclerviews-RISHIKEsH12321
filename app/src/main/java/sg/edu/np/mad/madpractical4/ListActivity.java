package sg.edu.np.mad.madpractical4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Creating 20 Users
        ArrayList<User> userList = new ArrayList<User>();
        Random random = new Random();
        userList.add(new User("Alice" + new Random().nextInt(99999), "Software Engineer", 1, false));
        userList.add(new User("Bob" + new Random().nextInt(99999), "Data Scientist", 2, true));
        userList.add(new User("Charlie" + new Random().nextInt(99999), "UI/UX Designer", 3, false));
        userList.add(new User("David" + new Random().nextInt(99999), "Product Manager", 4, true));
        userList.add(new User("Emma" + new Random().nextInt(99999), "Frontend Developer", 5, false));
        userList.add(new User("Frank" + new Random().nextInt(99999), "Backend Developer", 6, true));
        userList.add(new User("Grace" + new Random().nextInt(99999), "Mobile App Developer", 7, false));
        userList.add(new User("Henry" + new Random().nextInt(99999), "DevOps Engineer", 8, true));
        userList.add(new User("Ivy" + new Random().nextInt(99999), "Systems Analyst", 9, false));
        userList.add(new User("Jack" + new Random().nextInt(99999), "Database Administrator", 10, true));
        userList.add(new User("Kevin" + new Random().nextInt(99999), "Network Engineer", 11, false));
        userList.add(new User("Lily" + new Random().nextInt(99999), "Cybersecurity Analyst", 12, true));
        userList.add(new User("Mike" + new Random().nextInt(99999), "Cloud Architect", 13, false));
        userList.add(new User("Nancy" + new Random().nextInt(99999), "AI Specialist", 14, true));
        userList.add(new User("Oliver" + new Random().nextInt(99999), "Game Developer", 15, false));
        userList.add(new User("Pam" + new Random().nextInt(99999), "Embedded Systems Engineer", 16, true));
        userList.add(new User("Quinn" + new Random().nextInt(99999), "Web Developer", 17, false));
        userList.add(new User("Rachel" + new Random().nextInt(99999), "Software Tester", 18, true));
        userList.add(new User("Sam" + new Random().nextInt(99999), "Data Engineer", 19, false));
        userList.add(new User("Tom" + new Random().nextInt(99999), "Machine Learning Engineer", 20, true));


        RecyclerView rcView = findViewById(R.id.rvView);
        UserAdapter mAdapter = new UserAdapter(userList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);

        rcView.setLayoutManager(mLayoutManager);
        rcView.setItemAnimator(new DefaultItemAnimator());
        rcView.setAdapter(mAdapter);

        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);



    }
}