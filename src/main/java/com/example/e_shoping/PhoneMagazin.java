package com.example.e_shoping;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PhoneMagazin extends AppCompatActivity {
ImageView phone1,phone2,phone3,phone4,phone5,phone6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magazin);
        phone1 = findViewById(R.id.produit1);
        phone2 = findViewById(R.id.produit2);
        phone3 = findViewById(R.id.produit3);
        phone4 = findViewById(R.id.produit4);
        phone5 = findViewById(R.id.produit5);
        phone6 = findViewById(R.id.produit6);


        phone1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(PhoneMagazin.this, DescActivity.class);
                intent.putExtra("image",R.drawable.huawei+"");
                intent.putExtra("description","produit original a vendre");
                intent.putExtra("livraison","gratuite");
                intent.putExtra("garantie","60 jours pour vous");
                intent.putExtra("lien","https://www.t-mobile.com/cell-phones");
                intent.putExtra("prix","35000");

                startActivity(intent);

                return true;
            }
        });

        phone2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(PhoneMagazin.this, DescActivity.class);

                intent.putExtra("image",R.drawable.iphone+"");
                intent.putExtra("description","produit original a vendre");
                intent.putExtra("livraison","gratuite");
                intent.putExtra("garantie","60 jours pour vous");
                intent.putExtra("lien","https://www.t-mobile.com/cell-phones");
                intent.putExtra("prix","60000");
                startActivity(intent);

                return true;
            }
        });

        phone3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(PhoneMagazin.this, DescActivity.class);

                intent.putExtra("image",R.drawable.samsung+"");
                intent.putExtra("description","produit original a vendre");
                intent.putExtra("livraison","gratuite");
                intent.putExtra("garantie","60 jours pour vous");
                intent.putExtra("lien","https://www.t-mobile.com/cell-phones");
                intent.putExtra("prix","45000");
                startActivity(intent);

                return true;
            }
        });


        phone4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(PhoneMagazin.this, DescActivity.class);

                intent.putExtra("image",R.drawable.huawei2+"");
                intent.putExtra("description","produit original a vendre");
                intent.putExtra("livraison","gratuite");
                intent.putExtra("garantie","60 jours pour vous");
                intent.putExtra("lien","https://www.t-mobile.com/cell-phones");
                intent.putExtra("prix","35000");
                startActivity(intent);

                return true;
            }
        });


        phone5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(PhoneMagazin.this, DescActivity.class);

                intent.putExtra("image",R.drawable.iphone3+"");
                intent.putExtra("description","produit original a vendre");
                intent.putExtra("livraison","gratuite");
                intent.putExtra("garantie","60 jours pour vous");
                intent.putExtra("lien","https://www.t-mobile.com/cell-phones");
                intent.putExtra("prix","40000");
                startActivity(intent);

                return true;
            }
        });



        phone6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(PhoneMagazin.this, DescActivity.class);

                intent.putExtra("image",R.drawable.samsung3+"");
                intent.putExtra("description","produit original a vendre");
                intent.putExtra("livraison","gratuite");
                intent.putExtra("garantie","60 jours pour vous");
                intent.putExtra("lien","https://www.t-mobile.com/cell-phones");
                intent.putExtra("prix","35000");
                startActivity(intent);

                return true;
            }
        });

        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneMagazin.this,"35000 DA",Toast.LENGTH_SHORT).show();
            }
        });
        phone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneMagazin.this,"60000 DA",Toast.LENGTH_SHORT).show();
            }
        });
        phone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneMagazin.this,"45000 DA",Toast.LENGTH_SHORT).show();
            }
        });

        phone4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneMagazin.this,"35000 DA",Toast.LENGTH_SHORT).show();
            }
        });

        phone5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneMagazin.this,"40000 DA",Toast.LENGTH_SHORT).show();
            }
        });

        phone6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneMagazin.this,"35000 DA",Toast.LENGTH_SHORT).show();
            }
        });



    }

}
