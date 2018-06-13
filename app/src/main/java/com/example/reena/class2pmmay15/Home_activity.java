package com.example.reena.class2pmmay15;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Home_activity extends AppCompatActivity {
    ImageView popupIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_practice);
        popupIcon = findViewById(R.id.popup);
        popupIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showpopup(v);
            }
        });
    }
    public void showpopup(View view)
    {
        PopupMenu menu=new PopupMenu(this,view);
        getMenuInflater().inflate(R.menu.menu_main, menu.getMenu());

        menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(Home_activity.this, Register_activity.class);
                startActivity(intent);
                return false;
            }
        });
        menu.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.menu1:
                Intent intent = new Intent(this, Register_activity.class);
                startActivity(intent);
                break;
            case R.id.menu2:
                Toast.makeText(this, "menu2", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu3:
                Toast.makeText(this, "menu3", Toast.LENGTH_SHORT).show();
                break;

            case R.id.submenu1:
                Toast.makeText(this, "submenu1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.submenu2:
                Toast.makeText(this, "submenu2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                SharedPreferences sharedPreferences = getSharedPreferences("Userinfo", 0);
                sharedPreferences.edit().putBoolean("rememberme", false).apply();
                startActivity(new Intent(this, Loginactivity.class));
                finish();


        }

        return super.onOptionsItemSelected(item);
    }
}

