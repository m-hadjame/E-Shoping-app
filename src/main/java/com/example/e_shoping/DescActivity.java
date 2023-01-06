package com.example.e_shoping;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DescActivity extends AppCompatActivity {
ImageView image;
    Button Bgarant,Bsans_garant;
    String prix,description,livraison,grantie,lien,img ;
    TextView  desc,price,garant,url,liv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        if (savedInstanceState == null) {
            Bundle extras;
            extras = getIntent().getExtras();
            assert extras != null;
            description  = extras.getString("description");
                grantie  = extras.getString("garantie");
                livraison  = extras.getString("livraison");
                lien  = extras.getString("lien");
                img = extras.getString("image");
                prix = extras.getString("prix");
            //}
        }
        else {
            description  = (String) savedInstanceState.getSerializable("description");
            grantie  = (String) savedInstanceState.getSerializable("garantie");
            livraison  =(String) savedInstanceState.getSerializable("livraison");
            lien  = (String) savedInstanceState.getSerializable("lien");
            img =(String) savedInstanceState.getSerializable("image");
            prix = (String) savedInstanceState.getSerializable("prix");

        }

        image = findViewById(R.id.image);
        image.setImageResource(Integer.parseInt(img));
        price = findViewById(R.id.prix);
        desc = findViewById(R.id.desc);
        garant = findViewById(R.id.garant);
        url = findViewById(R.id.url);
        liv = findViewById(R.id.livri);


        price.setText(prix);
        garant.setText(grantie);
        desc.setText(description);
        url.setText(lien);
        liv.setText(livraison);

        Bgarant = findViewById(R.id.garantie);

        Bsans_garant = findViewById(R.id.sans_garantie);

        Bgarant.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                price.setText((Integer.parseInt(prix) *1.1)+"");
                Bgarant.setEnabled(false);
                Bsans_garant.setEnabled(true);
            }
        });
        Bsans_garant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price.setText(prix);
                Bsans_garant.setEnabled(false);
                Bgarant.setEnabled(true);
            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("description",description);
        outState.putString("livraison",livraison);
        outState.putString("garantie",grantie);
        outState.putString("lien",lien);
        outState.putString("prix",prix);
        outState.putString("image",img);
    }
}
