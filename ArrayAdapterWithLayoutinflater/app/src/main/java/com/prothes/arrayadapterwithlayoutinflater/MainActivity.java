package com.prothes.arrayadapterwithlayoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter arrayAdapter;
    private String myArray[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setNavigationBarColor(getColor(R.color.sky));
        this.getWindow().setStatusBarColor(getColor(R.color.sky));
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        myArray = getResources().getStringArray(R.array.countryName);

        arrayAdapter = new ArrayAdapter<>(this,R.layout.array_adapter_listitems,R.id.textView,myArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int positionItemNum = arrayAdapter.getPosition(myArray[position]);
                String getItemName = myArray[position];
                // In array Total item Number
                int length = myArray.length;
                // Each Every Item Character Length  .. Example :  Bangladesh = length = 10;
                // int eachItemLength = myArray[position].length();

                if (positionItemNum == 0){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum+"\n Total Item is\n"+length, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 1){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 2){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 3){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 4){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 5){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 6){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 7){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 8){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 9){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 10){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 11){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 12){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 13){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 14){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 15){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 16){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }else if (positionItemNum == 17){
                    Toast.makeText(MainActivity.this, getItemName+" "+positionItemNum, Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}