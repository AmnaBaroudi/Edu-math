package fr.app.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menuprincipale extends Activity implements OnClickListener
{
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.menu);
		btn2=(Button)this.findViewById(R.id.btn_cours);
		btn2.setOnClickListener(this);

		btn3=(Button)this.findViewById(R.id.Btn_exo);
		btn3.setOnClickListener(this);

		btn4=(Button)this.findViewById(R.id.Btn_param);
		btn4.setOnClickListener(this);


		

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if(btn2.isClickable()){


		}
	}


	public void onClick(View click) {

		if(click==btn2)
		{Intent intent2 = new Intent(this,algebre_geo.class);
		this.startActivity(intent2);}

		if(click==btn3)
		{Intent intent3 = new Intent(this,algebre_geo_exo.class);
		this.startActivity(intent3);}


		if(click==btn4){
			Intent intent4 = new Intent(this,parametre.class);
			this.startActivity(intent4);}

		
	}}

