package com.example.sharemenuactionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override           //option menu jast come to a  java file
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override   //option menu sleacted
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.shareid){

            Intent intent=new Intent(Intent.ACTION_SEND);

            intent.setType("text/plain");

            String subject="this is demo apps";

            String body="this is very useful apps.\n com.example.sharemenuactionbar";

            intent.putExtra(intent.EXTRA_SUBJECT,subject);
            intent.putExtra(intent.EXTRA_TEXT,subject);

            startActivity(Intent.createChooser(intent,"share with"));

        }

        return super.onOptionsItemSelected(item);
    }
}