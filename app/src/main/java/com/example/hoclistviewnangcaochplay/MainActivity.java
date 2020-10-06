package com.example.hoclistviewnangcaochplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter.AppCHplayAdapter;
import com.example.model.AppCHplay;

public class MainActivity extends AppCompatActivity {

    ListView mLvAppCH;
    AppCHplayAdapter mAppCHplayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        fakeDatas();
    }

    private void fakeDatas() {
        mAppCHplayAdapter.add(new AppCHplay(1, R.drawable.candy_crush, "Candy Crush Saga", "King", 4.8));
        mAppCHplayAdapter.add(new AppCHplay(2, R.drawable.fruit_ninja, "Fruit Ninja", "Halfbrick Studios", 4.2));
        mAppCHplayAdapter.add(new AppCHplay(3, R.drawable.hungry_shark, "Hungry Shark Evolution", "Ubisoft Entertainment", 4.9));
        mAppCHplayAdapter.add(new AppCHplay(4, R.drawable.subway, "Subway Surfers", "SYBO games", 4.0));
        mAppCHplayAdapter.add(new AppCHplay(5, R.drawable.temple_run, "Temple Run 2", "Imangi Studios", 5.0));
        mAppCHplayAdapter.add(new AppCHplay(6, R.drawable.candy_crush, "Candy Crush Saga", "King", 4.8));
        mAppCHplayAdapter.add(new AppCHplay(7, R.drawable.lubach, "Thầy Lu đại chiến Vted", "Lu Entertainment", 9.99));
        mAppCHplayAdapter.add(new AppCHplay(8, R.drawable.pvz, "Plant vs. Zombies", "ELECTRONIC ARTS", 4.4));
        mAppCHplayAdapter.add(new AppCHplay(9, R.drawable.shadow_fight, "Shadow Fight 2", "NEKKI", 4.1));

    }

    private void addControls() {
        mLvAppCH = findViewById(R.id.lvAppCH);
        //tạo adapter
        mAppCHplayAdapter = new AppCHplayAdapter(MainActivity.this, R.layout.item_app_chplay);

        //set adapter
        mLvAppCH.setAdapter(mAppCHplayAdapter);
    }
}