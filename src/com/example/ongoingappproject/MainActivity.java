package com.example.ongoingappproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener{

	private Spinner entreeSpinner;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		entreeSpinner  = (Spinner) findViewById(R.id.entreeSpinner);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.entreeSpinner, android.R.layout.simple_spinner_item);
		entreeSpinner.setAdapter(adapter2);
		entreeSpinner.setOnItemSelectedListener(this);
    }

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		switch(position){
		case 0:
			Toast.makeText(this, "Yum!", Toast.LENGTH_SHORT).show();
			break;
		case 1:
			startActivity(new Intent(this, Agnolotti.class));
			break;
		case 2:
			startActivity(new Intent(this, ArugulaSalad.class));
			break;
		case 3:
			startActivity(new Intent(this, BanhMi.class));
			break;
		case 4:
			startActivity(new Intent(this, BreadPudding.class));
			break;
		case 5:
			startActivity(new Intent(this, BrusselSprouts.class));
			break;
		case 6:
			startActivity(new Intent(this, CaeserSalad.class));
			break;
		case 7:
			startActivity(new Intent(this, CurryChicken.class));
			break;
		case 8:
			startActivity(new Intent(this, Dounuts.class));
			break;
		case 9:
			startActivity(new Intent(this, Cake.class));
			break;
		case 10:
			startActivity(new Intent(this, Fries.class));
			break;
		case 11:
			startActivity(new Intent(this, Gyro.class));
			break;
		case 12:
			startActivity(new Intent(this, Milanese.class));
			break;
		case 13:
			startActivity(new Intent(this, MixedGreens.class));
			break;
		case 14:
			startActivity(new Intent(this, Mussels.class));
			break;
		case 15:
			startActivity(new Intent(this, Napolean.class));
			break;
		case 16:
			startActivity(new Intent(this, CheeseCake.class));
			break;
		case 17:
			startActivity(new Intent(this, PadThai.class));
			break;
		case 18:
			startActivity(new Intent(this, Guacamole.class));
			break;
		case 19:
			startActivity(new Intent(this, Popcorn.class));
			break;
		case 20:
			startActivity(new Intent(this, PumpkinChili.class));
			break;
		case 21:
			startActivity(new Intent(this, Quesadilla.class));
			break;
		case 22:
			startActivity(new Intent(this, Ravioli.class));
			break;
		case 23:
			startActivity(new Intent(this, Salmon.class));
			break;
		case 24:
			startActivity(new Intent(this, SpringRolls.class));
			break;
		case 25:
			startActivity(new Intent(this, SweetCalamari.class));
			break;
		case 26:
			startActivity(new Intent(this, Tacos.class));
			break;
		case 27:
			startActivity(new Intent(this, Tart.class));
			break;
		case 28:
			startActivity(new Intent(this, Trout.class));
			break;

		/*
		case R.id.appsSpinner:
			if(position == 0){
				Toast.makeText(this, "Yum!", Toast.LENGTH_LONG).show();
			}else if(position == 1){
				startActivity(new Intent(this, Gyro.class));
			}else if(position == 2){
				startActivity(new Intent(this, Popcorn.class));
			}
		case R.id.entreeSpinner:
			if(position == 0){
				Toast.makeText(this, "Yum!!", Toast.LENGTH_LONG).show();
			}else if(position == 1){
				startActivity(new Intent(this, Cake.class));
			}else if(position == 2){
				startActivity(new Intent(this, Salmon.class));
			}
			*/
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}


}
