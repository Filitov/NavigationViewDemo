package tw.fili.navigationviewdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout dl = findViewById(R.id.drawer_layout);
                dl.openDrawer(Gravity.RIGHT);
                // dl.openDrawer(Gravity.LEFT); 符合 NavigationView 的設定
            }
        });


        NavigationView nv = findViewById(R.id.nav_list);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId(); // 被點選的 id

                if (id==R.id.test1) {
                    DrawerLayout dl = findViewById(R.id.drawer_layout);
                    dl.closeDrawers();
                    return true;
                }

                return false;
            }
        });

    }
}
