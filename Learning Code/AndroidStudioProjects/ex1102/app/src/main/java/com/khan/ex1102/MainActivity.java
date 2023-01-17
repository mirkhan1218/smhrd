package com.khan.ex1102;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    final static String SPF_TITLE = "mSPF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                new Fragment_1()).commit();
        bnv = findViewById(R.id.bnv);

        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                // 어떤 메뉴를 선택했는지!
                switch (item.getItemId()){
                    case R.id.tab1: // 1번 메뉴를 선택했다면!
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                                new Fragment_1()).commit();
                        break;
                    case R.id.tab2: // 2번 메뉴를 선택했다면!
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                                new Fragment_2()).commit();
                        break;
                    case R.id.tab3: // 3번 메뉴를 선택했다면!
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                                new Fragment_3()).commit();
                        break;
                    case R.id.tab4: // 4번 메뉴를 선택했다면!
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                                new Fragment_4()).commit();
                        break;
                }
                // Event처리 끝났음! => true로 표시! => Event Queue에서 해당 이벤트 pop
                return true;
            }
        });
    }
}